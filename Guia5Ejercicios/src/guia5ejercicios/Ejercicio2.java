/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicios;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Adrian H
 */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
       
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = r.nextInt(100); 
        }
        
        
        System.out.print("Vector generado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        
       
        System.out.println("Ingrese el número a buscar: ");
        int num = leer.nextInt();
        
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                count++;
                System.out.println("El número " + num + " se encuentra en la posición " + i + " del vector.");
            }
        }
        
        
        if (count == 0) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        } else if (count == 1) {
            System.out.println("El número " + num + " aparece una sola vez en el vector.");
        } else {
            System.out.println("El número " + num + " aparece " + count + " veces en el vector.");
        }
    }
}
