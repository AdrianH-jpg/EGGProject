/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Ejercicio5 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int limite;
        int suma = 0;
        
        System.out.println("Ingrese un numero positivo para el limite");
        limite = leer.nextInt();
        
        do {
            System.out.println("ingrese un numero");
            suma = suma + leer.nextInt();
          
        }while(limite > suma);
        System.out.println("El programa termino porque el limite " + limite + " fue superado por la suma " + suma);
        
    }
}
