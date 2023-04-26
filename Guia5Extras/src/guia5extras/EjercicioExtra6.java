/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioExtra6 {
      public static void main(String[] args) {
        int tamano = 20;
        int cantidadPalabras = 5;
        int tamanoPalabraMin = 3;
        int tamanoPalabraMax = 5;
        char[][] sopaDeLetras = new char[tamano][tamano];
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        String[] palabras = new String[cantidadPalabras];
        boolean[] ocupado = new boolean[tamano];
        for (int i = 0; i < cantidadPalabras; i++) {
            String palabra;
            do {
                System.out.print("Ingrese la palabra " + (i+1) + " de " + tamanoPalabraMin + " a " + tamanoPalabraMax + " caracteres: ");
                palabra = leer.nextLine().trim().toUpperCase();
            } while (palabra.length() < tamanoPalabraMin || palabra.length() > tamanoPalabraMax);
            palabras[i] = palabra;
        }
        int fila = r.nextInt(tamano);
        int columna = 0;
        for (int i = 0; i < cantidadPalabras; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                sopaDeLetras[fila][columna + j] = palabra.charAt(j);
            }
            ocupado[fila] = true;
            columna += palabra.length();
        }
        for (int i = 0; i < tamano; i++) {
            if (!ocupado[i]) {
                for (int j = 0; j < tamano; j++) {
                    sopaDeLetras[i][j] = (char) (r.nextInt(10) + '0');
                }
            }
        }
        System.out.println("La sopa de letras es:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}
