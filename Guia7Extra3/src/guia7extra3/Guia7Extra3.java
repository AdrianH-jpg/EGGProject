/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra3;

import Game.Juego;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia7Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner leer = new Scanner(System.in);
        boolean seguirJugando = true;

        while (seguirJugando) {
            juego.iniciar_juego();
            juego.mostrar_ganadores();

            System.out.println("¿Quieres seguir jugando? (Si/No)");
            
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                seguirJugando = false;
                juego.mostrarFinal();
            }
        }
    }
    
}
