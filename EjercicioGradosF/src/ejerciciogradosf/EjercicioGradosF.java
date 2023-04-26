/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogradosf;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioGradosF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se crean dos variables numericas que se utilizan para guardad los datos ingresados
        int grados;
        int f;
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa los grados centígrados");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        grados = leer.nextInt();
        //calculamos los grados Fahrenheit
        f = 32 + ((9 * grados) / 5);

        //mostramos los datos por consola con un hola mundo personalizado
        System.out.println("Dada la cantidad de grados centígrados: " + grados);
        System.out.println("Equivale en grados Fahrenheit: " + f);
    }
    
}
