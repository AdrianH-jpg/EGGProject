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
public class EjercicioExtra2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int A = 8;
        int B = 7;
        int C = 6;
        int D = 4;
        int aux = 0;
        
        System.out.println("El valor inicial de las variables es:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        /*B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.*/
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("El valor final de las variables es:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
    }
}
