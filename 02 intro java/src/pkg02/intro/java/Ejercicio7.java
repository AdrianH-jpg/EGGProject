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
public class Ejercicio7 {
    
     public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        //se crean variables numericas que se utilizan para guardad los datos ingresados
        int opcion;
        //muestra un mensaje por pantalla con salto de linea
    	System.out.println("Ingrese una opción");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        opcion = leer.nextInt();
        
    	switch (opcion) {
        	case 1:
                    System.out.println("La bomba es una bomba de agua.");
                break;

        	case 2:
                    System.out.println("La bomba es una bomba de gasolina.");
                break;
                
                case 3:
                    System.out.println("La bomba es una bomba de hormigón.");
                break;
                
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                break;

        	default:
                System.out.println("No existe un valor válido para tipo de bomba.");
    	}
     }

}
