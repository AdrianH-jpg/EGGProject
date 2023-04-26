/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Adrian H
 */
import java.util.Scanner;

public class Juego {
    private int numJugador1;
    private int numJugador2;
    private int intentos;
    private int ganador1;
    private int ganador2;

    public Juego() {
        ganador1 = 0;
        ganador2 = 0;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);

        System.out.println("¡Juego de adivinanza de números!");
        System.out.println("Jugador 1, elija un número: ");
        numJugador1 = leer.nextInt();
        leer.nextLine();

        System.out.println("Jugador 2, adivina el número: ");
        intentos = 0;
        while (true) {
            numJugador2 = leer.nextInt();
            leer.nextLine();
            intentos++;

            if (numJugador2 == numJugador1) {
                System.out.println("¡Adivinaste el número!");
                if (intentos == 1) {
                    System.out.println("¡Ganaste en 1 intento!");
                } else {
                    System.out.println("¡Ganaste en " + intentos + " intentos!");
                }

                break;
            } else if (numJugador2 < numJugador1) {
                System.out.println("Más alto. Intenta de nuevo: ");
            } else {
                System.out.println("Más bajo. Intenta de nuevo: ");
            }

            if (intentos == 3) {
                System.out.println("¡Te has quedado sin intentos!");
                System.out.println("El número correcto era: " + numJugador1);
                break;
            }
        }

        // Registrar ganador
        if (numJugador2 == numJugador1) {
             ganador2++;
//            
        }else{
            ganador1++;
        }
    }
    
    public void mostrarFinal(){
        if (ganador1 == ganador2) {
            System.out.println("Empate");
        } else if (ganador1 > ganador2) {
            System.out.println("Jugador 1 es el ganador");
        } else {
            System.out.println("Jugador 2 es el ganador");
        }
    }

    public void mostrar_ganadores() {
        System.out.println("Jugador 1: " + ganador1 + " ganador(es)");
        System.out.println("Jugador 2: " + ganador2 + " ganador(es)");
    }
}

