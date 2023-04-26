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
public class EjercicioExtra5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String letra;
        double costo;
        do{
        System.out.println("Bienvenido");
        System.out.println("Ingrese su tipo de socio, A/B/C");
        letra = leer.next();
        }while(!letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("b") && !letra.equalsIgnoreCase("c"));
        
        System.out.println("Ingrese el costo del tratamiento");
        costo = leer.nextDouble();
        
        switch(letra.toUpperCase()){
            case "A":
                costo = costo * 0.5;
                System.out.println("El costo del tratamiento par un socio tipo A es $" + costo);
                break;
            case "B":
                costo = costo * 0.35;
                System.out.println("El costo del tratamiento par un socio tipo B es $" + costo);
                break;
            case "C":
                
                System.out.println("El costo del tratamiento par un socio tipo C es $" + costo);
                break;
            default:
                break;
                   
        }
        
    }
}
