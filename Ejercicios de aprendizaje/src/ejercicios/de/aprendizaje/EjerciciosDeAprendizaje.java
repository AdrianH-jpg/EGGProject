/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjerciciosDeAprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //se crea una variable Scanner que se utiliza para leer datos ingresador por el usuario
        Scanner leer = new Scanner(System.in);
        //se crean dos variables numericas que se utilizan para guardad los datos ingresados
        int numero1;
        int numero2;
        int suma;
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Para realizar la suma debes ingresar dos numeros :");
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa el primer numero:");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        numero1 = leer.nextInt();
        //muestra un mensaje por pantalla con salto de linea
        System.out.println("Ingresa el segundo numero:");
        //leemos los datos ingresados por el usuario y se le asigna a la variable
        numero2 = leer.nextInt();
        //realizamos la suma
        suma = numero1 + numero2;
        //mostramos los datos por consola con un hola mundo personalizado
        System.out.println("El resultado de la suma es " + suma);
    }
    
}
