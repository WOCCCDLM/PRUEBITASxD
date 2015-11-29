/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.equipo;

import java.util.ArrayList;

/**
 *
 * @author FAMILIA
 */
public class PlantillaDeJugadores {
    private String nombreEquipo;   
    private ArrayList<Jugador> jugadores;
    
    public PlantillaDeJugadores(String nomEquipo){
        nombreEquipo = nomEquipo;
        jugadores = new ArrayList<>();
     }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    
    public void agregarJugador(Jugador j){
        jugadores.add(j);
    }
    
    public void eliminarJugador(Jugador j){
        for(Jugador aux:jugadores){
            if(aux.getNoCamisa() == j.getNoCamisa()){
                jugadores.remove(j);
            }
        }
    }
}