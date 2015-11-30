/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.model;

import edu.eci.arsw.equipo.CuerpoTecnico;
import edu.eci.arsw.equipo.Jugador;

/**
 *
 * @author laboratorio
 */

public class ClientMessage { 
    private String message;

    private CuerpoTecnico autor;
    private Jugador jug;
  
    public ClientMessage(){}
    
    public ClientMessage(String message, Jugador autorP){
        this.message = message;
        this.jug =autorP;
    }
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public CuerpoTecnico getAutor(){
        return autor;
    } 
    public Jugador getJugador(){
    return jug;
    }
}

