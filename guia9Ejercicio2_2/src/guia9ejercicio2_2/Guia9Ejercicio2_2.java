/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2_2;

import Entidad.ParDeNumeros;
import Service.ParDeNumerosService;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros.ParDeNumeros();
        ParDeNumerosService.mostrarValores();
        System.out.println("El Numero mayor es " + ParDeNumerosService.devolverMayor());    
        System.out.println("La potencia es " + ParDeNumerosService.calcularPotencia());
        System.out.println("La raiz es "+ ParDeNumerosService.calculaRaiz()); 
    }
    
}
