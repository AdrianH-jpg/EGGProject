/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio3;

import Service.ArregloService;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ArregloService arregloService = new ArregloService();
        
        arregloService.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        arregloService.mostrar(arregloA);
        
        arregloService.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor:");
        arregloService.mostrar(arregloA);
        
        arregloService.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo B:");
        arregloService.mostrar(arregloB);
    }
    
}
