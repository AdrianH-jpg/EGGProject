/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioExtra6B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        char[][] sopa = new char[20][20];

        // Pedimos las palabras al usuario y las guardamos en un arreglo
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese palabra " + (i+1) + ": ");
            palabras[i] = leer.next().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                System.out.print("Ingrese palabra " + (i+1) + ": ");
                palabras[i] = leer.next().toUpperCase();
            }
        }

        // Colocamos las palabras en la sopa de letras en filas aleatorias
        for (int i = 0; i < 5; i++) {
            String palabra = palabras[i];
            int filaAleatoria = (int)(Math.random() * 20);
            int columnaAleatoria = (int)(Math.random() * (20 - palabra.length() + 1));
            for (int j = 0; j < palabra.length(); j++) {
                sopa[filaAleatoria][columnaAleatoria+j] = palabra.charAt(j);
            }
        }

        // Rellenamos los espacios no utilizados con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char)((int)(Math.random() * 10) + 48);
                }
            }
        }

        // Imprimimos la sopa de letras
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
