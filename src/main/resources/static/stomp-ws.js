var stompClient = null;
var jugador;
var miembroCt;

function setConnected(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
    document.getElementById('conversationDiv').style.visibility = connected ? 'visible' : 'hidden';
    document.getElementById('response').innerHTML = '';
}

function connect() {
    
     var socket = new SockJS('/ws');
       
      jugador = document.getElementById("jugadores");
         if (jugador.selectedIndex == null || jugador.selectedIndex == 0) { 
            alert("No escogio a nungun jugador.");
            return false;
            }
         else { 
            alert("El formulario ha sido enviado"+" "+jugador.selectedIndex);
            }		
        
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

function sendMessage() {
    
    var message = document.getElementById('message').value;
   
    stompClient.send("/app/message", {}, JSON.stringify({ 'message': message }));
     
}

function showServerMessage(message) {
    var response = document.getElementById('response');
    var p = document.createElement('p');
    p.style.wordWrap = 'break-word';
    p.appendChild(document.createTextNode("asdsadasdsadsad"+jugador.selectedIndex+localStorage.username+"  "+message));
    response.appendChild(p);
}

function init() {
   var btnConnect = document.getElementById('connect');
   btnConnect.onclick=connect;
   var btnDisconnect = document.getElementById('disconnect');
   btnDisconnect.onclick=disconnect;
  
   
   disconnect();
}


function seleccion(boton) {
        miembroCt = boton.value.toString();
       	localStorage.setItem("username",miembroCt);
        if(miembroCt == "primerEntrenador"){
            alert("Bienvenido Primer entrenador !!");
        }
        
        if(miembroCt == "segundoEntrenador"){
            alert("Bienvenido Segundo entrenador !!");
        }
        
        if(miembroCt == "primerPreparadorFisico"){
            alert("Bienvenido Primer preparador fisico !!");
        }
        if(miembroCt == "segundoPreparadorFisico"){
            alert("Bienvenido Segundo preparador fisico !!");
        }
        
         if(miembroCt == "psicologo"){
            alert("Bienvenido Psicologo !! ");
        }
    
}


window.onload = init;