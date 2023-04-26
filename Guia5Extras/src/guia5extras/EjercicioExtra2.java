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
public class EjercicioExtra2 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.print("Ingrese el tamaño de los vectores: ");
        N = leer.nextInt();
        int[] vector1 = new int[N];
        int[] vector2 = new int[N];
        boolean iguales = true;
        System.out.println("Ingrese los elementos del primer vector: ");
        for (int i = 0; i < N; i++) {
            vector1[i] = leer.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < N; i++) {
            vector2[i] = leer.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
}
