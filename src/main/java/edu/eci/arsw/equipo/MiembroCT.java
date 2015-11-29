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
public class MiembroCT implements CuerpoTecnico{
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
    private final int id;
    private int cargo;
    private int edad;
    private String nombre;
    private String pais;
    private ArrayList<ClientMessage> mensajes;

    
    public MiembroCT(int id, int cargo, int edad, String nombre, String pais){
        this.id = id;
        this.cargo = cargo;
        this.edad=edad;
        this.nombre=nombre;
        this.pais=pais;
        mensajes = new ArrayList<>();
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getCargo() {
        return cargo;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getPais() {
        return pais;
    }

    @Override
    public ArrayList<ClientMessage> getMensajes() {
        return mensajes;
    }

    @Override
    public void agregarMensaje(ClientMessage msj) {
        mensajes.add(msj);
    }

    @Override
    public int getColorTexto(int cargo) {
        if(cargo == TECNICOPRINCIPAL){
            return NEGRO;
            
        }
        
        if(cargo == SEGUNDOENTRENADOR){
            return AZUL;
            
        }
        
        if(cargo == PREPARADORFISICO1){
            return ROJO;
            
        }
        
        if(cargo == PREPARADORFISICO2){
            return VERDE;
            
        }
        
        if(cargo == PSICOLOGO){
            return CAFE;
            
        }
        
        
        return 0;
    }
    
    
    
    
    
}
