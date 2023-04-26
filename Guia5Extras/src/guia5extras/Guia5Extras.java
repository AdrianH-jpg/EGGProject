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
public class Guia5Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.print("Ingrese el tamaño del vector: ");
        N = leer.nextInt();
        int[] vector = new int[N];
        int suma = 0;
        System.out.println("Ingrese los elementos del vector: ");
        for (int i = 0; i < N; i++) {
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
    
}
