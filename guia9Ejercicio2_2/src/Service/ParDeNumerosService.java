/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.ParDeNumeros;

/**
 *
 * @author Adrian H
 */
public class ParDeNumerosService {
    //private ParDeNumeros PDN = new ParDeNumeros();
    
    public static void mostrarValores (){
        System.out.println("Numero 1: " + ParDeNumeros.num1 + " Numero 2: " + ParDeNumeros.num2);
    }
    
    public static double devolverMayor(){
       return Math.max(ParDeNumeros.num1, ParDeNumeros.num2);
    }
    
    public static long calcularPotencia (){
        long n1 = Math.round(ParDeNumeros.num1);
        long n2 = Math.round(ParDeNumeros.num2);
        
        return (long) Math.pow(Math.max(n1, n2), Math.min(n2, n1));
        
    }
    
    public static double calculaRaiz(){
       double minimo = (double) Math.min(ParDeNumeros.num1, ParDeNumeros.num2);
       minimo = Math.abs(minimo);
       return Math.sqrt(minimo);
       
       
    }
}
