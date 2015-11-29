/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import edu.eci.arsw.model.*;

/**
 *
 * @author laboratorio
 */
@Controller
public class MessageController {
@MessageMapping("/message")
@SendTo("/topic/messages")
    public ServerMessage serverMessage(ClientMessage message) throws Exception {
        Thread.sleep(3000); // simulated delay
        return new ServerMessage("Message: " + message.getMessage() + "!");
    }
}
