/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class EjercicioExtra5 {
    public static void main(String[] args) {
        int N = 3; // Número de filas
        int M = 4; // Número de columnas
        int[][] matriz = new int[N][M];
        Random r = new Random();
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = r.nextInt(10);
                suma += matriz[i][j];
            }
        }
        System.out.println("La matriz es:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}
