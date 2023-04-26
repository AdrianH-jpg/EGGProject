/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio4;

import Service.FechaService;
import java.util.Date;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fechaNacimiento = FechaService.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());
      
        Date fechaActual = FechaService.fechaActual();
        System.out.println("Fecha actual: " + fechaActual.toString());
    
        int edad = FechaService.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Edad: " + edad + " años");
    }
    
}
