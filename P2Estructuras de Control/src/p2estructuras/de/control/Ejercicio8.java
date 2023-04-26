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
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        int N;
        System.out.println("Bienvenido");
        System.out.println("Ingrese el tamaño del cuadro");
        N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N; j++) {

                if(i > 1 && i < N && j > 1 && j < N){
                   System.out.print(" "); 
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println("");

        }
    }
}
