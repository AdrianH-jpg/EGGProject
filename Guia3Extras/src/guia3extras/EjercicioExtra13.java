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
public class EjercicioExtra13 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int altura;
        
        System.out.println("Ingrese la altura de la escalera de numeros");
        altura = leer.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
