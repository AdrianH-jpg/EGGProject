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
public class Ejercicio4 {
    
    public static void main (String[] args){
        //iniciamos scanner para tomar datos del usuario
        Scanner leer = new Scanner(System.in);
        
        //definimos una variable para guardar los datos tomados del usuario
        String frase;
        
        //mostramos una frase por pantalla
        System.out.println("Ingrese una frase o palabra");
        
        frase = leer.nextLine();
        
        if(frase.substring(0, 1).equalsIgnoreCase("a"))
        {
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
        
    }
}
