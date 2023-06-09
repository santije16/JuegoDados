/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegodados;

import java.util.Random;

/**
 *
 * @author Santiago
 */
public class Controles {
    private int id;
    private String nombre;
    private int puntaje=0;
    private int nroJugadas;
    private boolean puedeLanzar=true;
    private int puntajeTotal=0;
    private int lanzamientosRealizados=0;

    

    public Controles(int id, String n, int nroJugadas) {
        this.id = id;
        this.nombre = n;
        this.nroJugadas = nroJugadas;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public int getNroJugadas() {
        return this.nroJugadas;
    }
    
    public int getLanzamientosRealizados() {
        return this.lanzamientosRealizados;
    }

    public int lanzarDados() {
        Random objAleatorio = new Random();
        int ultimoLanza = 2 + objAleatorio.nextInt(12);//retorna un valor aleatorio entre 2 y 12
        this.puntaje = this.puntaje + ultimoLanza;
        lanzamientosRealizados = lanzamientosRealizados+1;
        if (ultimoLanza==2 || ultimoLanza==12) {
            this.nroJugadas = this.nroJugadas + 1;
            this.nroJugadas = this.nroJugadas - 1;
        } else {
            this.nroJugadas = this.nroJugadas - 1;
        }
        
        return ultimoLanza;
        
    }
    
    public boolean PermiteLanzar () {
        if (nroJugadas>0) {
            puedeLanzar= true;
        } else {
            puedeLanzar= false;
        }
        return puedeLanzar;
    }
}
