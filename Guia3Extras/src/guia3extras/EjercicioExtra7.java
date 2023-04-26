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
public class EjercicioExtra7 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int N;
        int cont = 0;
        int numero = 0;
        int mayor = 0;
        int menor = 99999999;
        int suma = 0;
        
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese cantidad de numeros");
        N = leer.nextInt();
        
        do{
            System.out.println("Ingrese numero ");
            numero = leer.nextInt();
            suma = suma + numero;
            if (numero > mayor)
            {
                mayor = numero;
            }
            if(numero < menor)
            {
                menor = numero;
            }
            cont++;
        }while(cont < N);
        
        System.out.println("El promedio para " + N + " alturas es " + suma / N);
        System.out.println("El mayor numero ingresado es " + mayor);
        System.out.println("El menor numero ingresado es " + menor);
    }
}
