/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class EjercicioExtra3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String letra;
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese una letra");
        letra = leer.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println(letra + " es una vocal");
        }
        else{
            System.out.println(letra + " no es una vocal");
        }
        
    }
}
