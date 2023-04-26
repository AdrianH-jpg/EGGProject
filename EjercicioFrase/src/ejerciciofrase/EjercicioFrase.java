/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofrase;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se crean dos variables numericas que se utilizan para guardad los datos ingresados
        String frase;
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa una frase");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        frase = leer.nextLine();
        //mostramos los datos por consola con un hola mundo personalizado
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
