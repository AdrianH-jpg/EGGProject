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
public class Ejercicio3 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(99999);
        }
        System.out.print("Vector generado ");
        int u=0;
        int d=0;
        int c=0;
        int m=0;
        int dm=0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
            if(vector[i]<10)
            {
                u++;
            }
            if(vector[i] >= 10 && vector[i] < 100)
            {
                d++;
            }
            if(vector[i] >= 100 && vector[i] < 1000)
            {
                c++;
            }
            if(vector[i] >= 1000 && vector[i] < 10000)
            {
                m++;
            }
            if(vector[i] >= 10000)
            {
                dm++;
            }
        }
        System.out.println("");
        
        System.out.println("Cantidad de numeros de 1 digito: " + u);
        System.out.println("Cantidad de numeros de 2 digitos: " + d);
        System.out.println("Cantidad de numeros de 3 digitos: " + c);
        System.out.println("Cantidad de numeros de 4 digitos: " + m);
        System.out.println("Cantidad de numeros de 5 digitos: " + dm);
    }
        
}
