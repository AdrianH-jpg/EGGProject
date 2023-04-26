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
public class Ejercicio8 {
    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        //se crean variables numericas que se utilizan para guardad los datos ingresados
        double opcion;
        //muestra un mensaje por pantalla con salto de linea
    	System.out.println("Ingrese una nota entre 1 y 10");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        opcion = leer.nextFloat();
        
        while (opcion < 0 || opcion > 10) {
      	 
    	System.out.println("Ingrese una nota entre 1 y 10");
        opcion = leer.nextFloat();
   	}
        System.out.println("La nota es correcta");
    }
}
