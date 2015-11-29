/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.equipo;

/**
 *
 * @author FAMILIA
 */
public class Jugador {
    private int noCamisa;
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;
    private String posicion;
    
    public Jugador(int noCamisa, String nombre, int edad, float peso, float estatura, String posicion){
        this.noCamisa = noCamisa;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.posicion = posicion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public void setPosicion(String nuevaPosicion){
        posicion = nuevaPosicion;
    }
    
    public int getNoCamisa(){
        return noCamisa;
    }
    
}
