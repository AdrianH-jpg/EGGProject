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
public class EjercicioExtra3 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        Random r = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(100);
        }
    }
    
    public static void imprimirVector(int[] vector) {
        System.out.println("El vector es: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
