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
public class Ejercicio9 {
    public static void main(String[] args) {

    	Scanner leer = new Scanner(System.in);

    	int respuesta;
        int suma = 0;
        int cont = 0;

    	do {
            System.out.println("Ingrese un numero");
            respuesta = leer.nextInt();
            cont++;
            if(respuesta > 0)
            {
                suma = suma + respuesta;

            }else  if(respuesta == 0)
            {
                System.out.println("Se capturó el numero cero.");
                break;
            }
    	} while(respuesta != 0 && cont != 20 );
         System.out.println("La suma de los " + cont + " numeros ingresados es: " + suma);
    }

}
