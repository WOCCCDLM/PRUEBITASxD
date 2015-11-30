/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.model;

import edu.eci.arsw.equipo.CuerpoTecnico;

/**
 *
 * @author laboratorio
 */
public class ServerMessage {
    private String content;
   
    
    public ServerMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    
    
}