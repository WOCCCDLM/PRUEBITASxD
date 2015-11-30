var stompClient = null;
var selectedPlayer ;

function setConnected(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
    document.getElementById('conversationDiv').style.visibility = connected ? 'visible' : 'hidden';
    document.getElementById('response').innerHTML = '';
}

function connect() {
    var socket = new SockJS('/ws');
     var jugador = document.getElementsByName("selectPlayer");
  
    alert(jugador.length);
    for (var i = 0; i<jugador.length;i++){
        if(jugador[i].checked){
        alert( jugador[i].value+ " Gonorrea");
        selectedPlayer = jugador[i].value;
        }
    }
    //alert(jugador.value + "sfsd");
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
    setConnected(true);
    console.log('Connected: ' + frame);
    stompClient.subscribe('/topic/messages', function(serverMessage){
        showServerMessage(JSON.parse(serverMessage.body).content);
    });
    });
}

function disconnect() {
    if (stompClient != null) {
    stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

/*function enviarJugador(boton){
     alert(jugador);
    jugador = boton.value;
    
    alert("Ha escogido a: "+jugador);
    stompClient.send("/app/message", {}, JSON.stringify({ 'jugador': jugador }));
}*/

function sendMessage() {
    
    var message = document.getElementById('message').value;
    alert(selectedPlayer);
    stompClient.send("/app/message", {}, JSON.stringify({ 'message': message }));
     
}

function showServerMessage(message) {
    var response = document.getElementById('response');
    var p = document.createElement('p');
    p.style.wordWrap = 'break-word';
    p.appendChild(document.createTextNode(message));
    response.appendChild(p);
}

function init() {
   var btnConnect = document.getElementById('connect');
   btnConnect.onclick=connect;
   var btnDisconnect = document.getElementById('disconnect');
   btnDisconnect.onclick=disconnect;
  
   
   disconnect();
}

window.onload = init;