/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Adrian H
 */
public class ParDeNumeros {
    private double numero1;
    private double numero2;
    
    public ParDeNumeros() {
        this.numero1 = Math.random();
        this.numero2 = Math.random();
    }
    
    public double getNumero1() {
        return numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
