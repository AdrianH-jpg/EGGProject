/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4subprogamas;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el numero a verificar si es multiplo");
        num2 = leer.nextInt();
        
        System.out.println(EsMultiplo(num1,num2));
    }
    
    public static String EsMultiplo(int n1, int n2){
        String resultado;
        
        if(n1 % n2 == 0){
            resultado = "El numero " + n1 + " es multiplo de " + n2;
        }
        else{
            resultado = "El numero " + n1 + " no es multiplo de " + n2;
        }
        return resultado;
    }
}
