/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4;

import Forma.Rectángulo;

/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectángulo rectangulo = new Rectángulo();
        rectangulo.crearRectangulo();
        System.out.println("La superficie del rectángulo es: " + rectangulo.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
        rectangulo.dibujarRectangulo();
    }
    
}
