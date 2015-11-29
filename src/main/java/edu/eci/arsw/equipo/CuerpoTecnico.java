/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.equipo;

import edu.eci.arsw.model.ClientMessage;
import java.util.ArrayList;

/**
 *
 * @author FAMILIA
 */
public interface CuerpoTecnico {
    public int getId();
    public int getCargo();
    public int getEdad();
    public String getNombre();
    public String getPais();
    public void agregarMensaje(ClientMessage msj);
    public ArrayList<ClientMessage> getMensajes();
    public int getColorTexto(int cargo);
}
