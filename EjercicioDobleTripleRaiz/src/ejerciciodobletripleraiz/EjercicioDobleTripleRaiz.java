/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodobletripleraiz;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioDobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se crean dos variables numericas que se utilizan para guardad los datos ingresados
        int numero;
        int doble;
        int triple;
        double raiz;
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa un numero");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        numero = leer.nextInt();
        //calculamos los grados Fahrenheit
        doble = numero * 2;
        triple = numero * 3;
        raiz = Math.sqrt(numero);

        //mostramos los datos por consola con un hola mundo personalizado
        System.out.println("Dado el numero: " + numero);
        System.out.println("El doble es : " + doble);
        System.out.println("El triple es : " + triple);
        System.out.println("La raiz es : " + raiz);
    }
    
}
