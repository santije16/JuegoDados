/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.juegodados;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class JuegoDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numeroLanzamientosMinimos, id1, id2, id3, i, ok1, ok2, ok3, mayorPuntajePorLanzamiento=0;
        String nombre1, nombre2, nombre3;
        
        System.out.println("Cuantas veces lanzaran los datos los jugadores como minimo");
        numeroLanzamientosMinimos = sc.nextInt();
        
        System.out.println("Cual es el ID del primer jugador: ");
        id1 = sc.nextInt();
        System.out.println("Cual es el nombre del primer jugador");
        nombre1 = sc.next();
                
        System.out.println("Cual es el ID del segundo jugador: ");
        id2 = sc.nextInt();
        System.out.println("Cual es el nombre del segundo jugador");
        nombre2 = sc.next();
        
        System.out.println("Cual es el ID del tercer jugador: ");
        id3 = sc.nextInt();
        System.out.println("Cual es el nombre del tercer jugador");
        nombre3 = sc.next();
        
        Controles jugador1 = new Controles(id1, nombre1, numeroLanzamientosMinimos);
        Controles jugador2 = new Controles(id1, nombre1, numeroLanzamientosMinimos);
        Controles jugador3 = new Controles(id1, nombre1, numeroLanzamientosMinimos);
        
        
        while (jugador1.PermiteLanzar() || jugador2.PermiteLanzar() || jugador3.PermiteLanzar()) {
            if (jugador1.PermiteLanzar()) {
                System.out.println("Jugador "+nombre1+" puede lanzar presiona 1");
                ok1 = sc.nextInt();
                System.out.println("Jugador "+nombre1+" saca: " + jugador1.lanzarDados());
                System.out.println("Jugador "+nombre1+" tiene un puntaje de: " + jugador1.getPuntaje());
                System.out.println("Jugador "+nombre1+" tiene: " +jugador1.getNroJugadas()+" lanzamientos ");
                System.out.println();
            } else {
                System.out.println("El jugador "+nombre1+" ya no tiene mas lanzamientos");
            }
            if (jugador2.PermiteLanzar()) {
                System.out.println("Jugador "+nombre2+" puede lanzar presiona 2");
                ok2 = sc.nextInt();
                System.out.println("Jugador "+nombre2+" saca: " + jugador2.lanzarDados());
                System.out.println("Jugador "+nombre2+" tiene un puntaje de: " + jugador2.getPuntaje());
                System.out.println("Jugador "+nombre2+" tiene: " +jugador2.getNroJugadas()+" lanzamientos ");
                System.out.println();
            } else {
                System.out.println("El jugador "+nombre2+" ya no tiene mas lanzamientos");
            }
            if (jugador3.PermiteLanzar()) {
                System.out.println("Jugador "+nombre3+" puede lanzar presiona 3");
                ok3 = sc.nextInt();
                System.out.println("Jugador "+nombre3+" saca: " + jugador3.lanzarDados());
                System.out.println("Jugador "+nombre3+" tiene un puntaje de: " + jugador3.getPuntaje());
                System.out.println("Jugador "+nombre3+" tiene: " +jugador3.getNroJugadas()+" lanzamientos ");
                System.out.println();
            } else {
                System.out.println("El jugador "+nombre3+" ya no tiene mas lanzamientos");
            }
        }
        
        System.out.println("EL JUEGO TERMINO"); 
        
        System.out.println("El jugador "+nombre1+" realizo "+jugador1.getLanzamientosRealizados()+" lanzamientos");
        System.out.println("El jugador "+nombre2+" realizo "+jugador2.getLanzamientosRealizados()+" lanzamientos");
        System.out.println("El jugador "+nombre3+" realizo "+jugador3.getLanzamientosRealizados()+" lanzamientos");
        System.out.println();
        System.out.println("Jugador "+nombre1+" obtuvo un puntaje de: " + jugador1.getPuntaje());
        System.out.println("Jugador "+nombre2+" obtuvo un puntaje de: " + jugador2.getPuntaje());
        System.out.println("Jugador "+nombre3+" obtuvo un puntaje de: " + jugador3.getPuntaje());
        System.out.println();
        
        if (jugador1.getPuntaje()>jugador2.getPuntaje() && jugador1.getPuntaje()>jugador3.getPuntaje()) {
            System.out.println("El jugador con mayor puntaje fue: "+nombre1+" con "+jugador1.getPuntaje()+ " puntos");
        } else if (jugador2.getPuntaje()>jugador1.getPuntaje() && jugador2.getPuntaje()>jugador3.getPuntaje()) {
            System.out.println("El jugador con mayor puntaje fue: "+nombre2+" con "+jugador2.getPuntaje()+ " puntos");
        } else {
            System.out.println("El jugador con mayor puntaje fue: "+nombre3+" con "+jugador3.getPuntaje()+ " puntos");
        }
    }
}
