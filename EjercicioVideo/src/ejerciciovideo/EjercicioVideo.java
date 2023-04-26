/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovideo;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una variable Scanner que se utiliza para leer datos ingresador por el usuario
        Scanner leer = new Scanner(System.in);
        //se crea una variable cadena (String) que se utiliza para guardad los datos ingresados
        String nombre;
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa tu nombre:");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        nombre = leer.next();
        //mostramos los datos por consola con un hola mundo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}
