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
public class EjercicioExtra4 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingresa un número entero positivo: ");
    int numero = leer.nextInt();
    
    if (esPrimo(numero)) {
      System.out.println(numero + " es primo.");
    } else {
      System.out.println(numero + " no es primo.");
    }
  }
  
  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }
    
    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    
    return true;
  }
  
}
