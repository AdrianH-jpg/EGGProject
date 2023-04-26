/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicios;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int suma = 0;

        // Lectura del cuadrado
        System.out.println("Introduce los números del cuadrado mágico (del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                cuadrado[i][j] = leer.nextInt();
                // Comprobar que los números introducidos son correctos
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }

        // Comprobar si el cuadrado es mágico
        for (int i = 0; i < 3; i++) {
            suma += cuadrado[0][i];
        }

        // Comprobar filas
        for (int i = 1; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila != suma) {
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }

        // Comprobar columnas
        for (int i = 0; i < 3; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaColumna += cuadrado[j][i];
            }
            if (sumaColumna != suma) {
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }

        // Comprobar diagonales
        if (cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] != suma
                || cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] != suma) {
            System.out.println("No es un cuadrado mágico.");
            return;
        }

        // Si llegamos hasta aquí es porque el cuadrado es mágico
        System.out.println("Es un cuadrado mágico.");
    }
}
