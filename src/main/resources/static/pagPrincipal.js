/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var pagPrincipal = null;


function seleccion(boton) {
    var mensaje = boton.value.toString();
        if(mensaje == "primerEntrenador"){
            alert("Bienvenido Primer entrenador !!");
        }
        
        if(mensaje == "segundoEntrenador"){
            alert("Bienvenido Segundo entrenador !!");
        }
        
        if(mensaje == "primerPreparadorFisico"){
            alert("Bienvenido Primer preparador fisico !!");
        }
        if(mensaje == "segundoPreparadorFisico"){
            alert("Bienvenido Segundo preparador fisico !!");
        }
        
         if(mensaje == "psicologo"){
            alert("Bienvenido Psicologo !! ");
        }
    
}
