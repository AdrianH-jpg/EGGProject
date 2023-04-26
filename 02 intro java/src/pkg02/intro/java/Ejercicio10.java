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
public class Ejercicio10 {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        //se crean variables numericas que se utilizan para guardad los datos ingresados
        int numero;
        int cont = 4;
        
        for (int i = 0; i < 10; i++) {
            //muestra un mensaje por pantalla con salto de linea
            System.out.println("Ingrese una nota entre 1 y 20");
            //leemos los datos ingresados por el usuario y se le asigna a la variable
            numero = leer.nextInt();
            if(numero < 0 || numero > 20)
            {
                continue;
            }   
            cont--;
            System.out.print(numero);
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if(cont == 0)
            {
                break;
            }
        }
    }
}
