/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicios;

/**
 *
 * @author Adrian H
 */
public class Ejercicio1 {
    public static void main(String[] args){
        int[] enteros = new int[100];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println("[ " + enteros[i] + " ]");
        }
    }
}
