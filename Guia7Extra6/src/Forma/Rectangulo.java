/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forma;

/**
 *
 * @author Adrian H
 */
public class Rectangulo {
    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double calcular_area() {
        return lado1 * lado2;
    }
}


