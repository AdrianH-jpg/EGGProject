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
public class EjercicioExtra10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        int ingreso;
        
        num1 = (int)(Math.random() * 10);
        num2 = (int)(Math.random() * 10);
        resultado = num1 * num2;
        System.out.println(resultado);
        do{
            System.out.println("Adivine el resultado de la multiplicacion entre numeros del 0 al 10");
            ingreso = leer.nextInt();
            
        }while(resultado != ingreso);
        System.out.println("Correcto el numero era " + resultado);
    }
}
