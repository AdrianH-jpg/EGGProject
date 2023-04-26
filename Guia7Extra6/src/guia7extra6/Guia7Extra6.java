/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra6;

import Forma.Rectangulo;

/**
 *
 * @author Adrian H
 */
public class Guia7Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        double area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + area);
    }
    
}
