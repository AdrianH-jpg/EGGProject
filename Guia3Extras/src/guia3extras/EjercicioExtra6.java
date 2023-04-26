/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class EjercicioExtra6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int N;
        double altura;
        double total = 0;
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese cantidad de alturas a ingresar");
        N = leer.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese altura para " + i);
            altura = leer.nextDouble();
            total = total + altura;
        }
        System.out.println("El promedio para " + N + " alturas es " + total / N);
    }
}
