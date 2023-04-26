/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.intro.java;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se crean dos variables numericas que se utilizan para guardad los datos ingresados
        int num1;
        int num2;
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa el primer numero");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        num1 = leer.nextInt();
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa el segundo numero");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        num2 = leer.nextInt();
        if(num1>25){
            //mostramos los datos por consola con un hola mundo personalizado
            System.out.println("El numero: " + num1 + " es mayor a 25");
        }
         if(num2>25){
            //mostramos los datos por consola con un hola mundo personalizado
            System.out.println("El numero: " + num2 + " es mayor a 25");
        }

    }
    
}
