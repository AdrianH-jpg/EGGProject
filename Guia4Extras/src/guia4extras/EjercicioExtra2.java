/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extras;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class EjercicioExtra2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        String opc = "";
        int edad;
        String nombre = "";
        
        do{
            System.out.println("Ingrese nombre");
            nombre = leer.next();
            System.out.println("Ingrese edad");
            edad = leer.nextInt();
            System.out.println(resultado(nombre,edad));
            System.out.println("Desea ingresar mas personas?");
            opc = leer.next();
            
        }while(!opc.equalsIgnoreCase("no"));
    }
    
    public static String resultado( String nom, int edad){
        String resultado = "";
        if (edad >= 18)
        {
            resultado = resultado.concat("Hola " + nom + " eres mayor de edad.");
        }
        else{
            resultado = resultado.concat("Hola " + nom + " no eres mayor de edad.");
        }
        return resultado;
    }
}
