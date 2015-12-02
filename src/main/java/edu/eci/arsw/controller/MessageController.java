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
import java.util.List;

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
    private List<Jugador> jugadores;
    
    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public ServerMessage serverMessage(ClientMessage message) throws Exception {
            jugadores=new ArrayList<>();
            Jugador j1 = new Jugador(1, "James");
            jugadores.add(j1);
            char noJugador = message.getMessage().charAt(0);
            for (Jugador aux:jugadores){
                if(aux.getNoCamisa() == noJugador){
                    aux.agregarMensaje(message);
                    System.out.print("Se agrego el mensaje "+message.getMessage()+" Al jugador "+aux.getNombre());
                }
            }
           // Thread.sleep(1000); // simulated delay
            ServerMessage msj = new ServerMessage(message.getMessage());
            return msj;
    }
}
