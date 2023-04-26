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
public class EjercicioExtra4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("Bienvenido");
            System.out.println("Ingrese un numero entre 1 y 10");
            System.out.println("para conocer su equivalente romano");
            numero = leer.nextInt();
        }while(numero < 1 || numero > 10);
        
        switch(numero){
            case 1:
                System.out.println("El numero 1 -> " + "I");
                break;
            case 2:
                System.out.println("El numero 2 -> " + "II");
                break;
            case 3:
                System.out.println("El numero 3 -> " + "III");
                break;
            case 4:
                System.out.println("El numero 4 -> " + "IV");
                break;
            case 5:
                System.out.println("El numero 5 -> " + "V");
                break;
            case 6:
                System.out.println("El numero 6 -> " + "VI");
                break;
            case 7:
                System.out.println("El numero 7 -> " + "VII");
                break;
            case 8:
                System.out.println("El numero 8 -> " + "VIII");
                break;
            case 9:
                System.out.println("El numero 9 -> " + "IX");
                break;
            case 10:
                System.out.println("El numero 10 -> " + "X");
                break;
            default:
                System.out.println("ccccc");
                break;
        }
    }
}
