/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2;

import Service.ParDeNumerosService;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService servicio = new ParDeNumerosService();
        
        servicio.mostrarValores();
        System.out.println("El número mayor es: " + servicio.devolverMayor());
        System.out.println("La potencia del mayor elevado al menor es: " + servicio.calcularPotencia());
        System.out.println("La raíz cuadrada del menor es: " + servicio.calcularRaiz());
    }
    
}
