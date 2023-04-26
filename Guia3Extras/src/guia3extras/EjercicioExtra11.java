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
public class EjercicioExtra11 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int numero;
        int digitos;
        
        System.out.println("Ingrese un numero para saber la cantidad de digitos");
        numero = leer.nextInt();
        digitos = (int)(Math.log10(numero)+1);
        System.out.println("La cantidad de digitos es " + digitos +  " en el numero " + numero);
    }
}
