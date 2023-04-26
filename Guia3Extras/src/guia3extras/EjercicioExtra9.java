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
public class EjercicioExtra9 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double num1;
        double num2;
        double residuo = 0;
        int cociente = 0;
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese el numero a dividir");
        num1 = leer.nextInt();
        System.out.println("Ingrese el divisor");
        num2 = leer.nextInt();
        residuo = num1;
        
        do{
            residuo = residuo - num2;
            System.out.println(num1 + " - " + num2 + " = " + residuo);
            
            num1 = residuo;
            
            cociente++;
        }while(residuo > num2);
        System.out.println("dado que " + residuo + " es menor que " + num2 + ", entonces: el residuo es " + residuo + " y el cociente es " + cociente);
    }
}
