/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio3;

import Calculo.Operacion;

/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("La suma es: " + operacion.sumar());
        System.out.println("La resta es: " + operacion.restar());
        System.out.println("La multiplicación es: " + operacion.multiplicar());
        System.out.println("La división es: " + operacion.dividir());

    }
    
}
