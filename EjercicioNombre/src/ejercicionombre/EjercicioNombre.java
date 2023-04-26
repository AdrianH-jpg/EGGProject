/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionombre;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        //se crean dos variables numericas que se utilizan para guardad los datos ingresados
        String nombre;
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa tu nombre");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        nombre = leer.next();
        //mostramos los datos por consola con un hola mundo personalizado
        System.out.println("Hola " + nombre);
    }
    
}
