/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controller;

import edu.eci.arsw.equipo.CuerpoTecnico;
import edu.eci.arsw.equipo.Jugador;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import edu.eci.arsw.model.*;
import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
@Controller
public class MessageController {
    private static final int TECNICOPRINCIPAL = 1;
    private static final int SEGUNDOENTRENADOR = 2;
    private static final int PREPARADORFISICO1 = 3;
    private static final int PREPARADORFISICO2 = 4;
    private static final int PSICOLOGO = 5;
    private static final int NEGRO = 10;
    private static final int AZUL = 11;
    private static final int ROJO = 12;
    private static final int VERDE = 13;
    private static final int CAFE = 14;
    private CuerpoTecnico miembroCT;
    
@MessageMapping("/message")
    @SendTo("/topic/messages")
    public ServerMessage serverMessage(ClientMessage message) throws Exception {
            System.out.println("sadkksdjdjsdajdsjdsjdsjdsaj");
           
            Thread.sleep(1000); // simulated delay
            return new ServerMessage("nooo seeee: " + message.getMessage());
    }
}
