/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banca;

/**
 *
 * @author Adrian H
 */
public class Cuenta {
    private double saldo;
    private String titular;
    
    public Cuenta(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo para realizar la operación.");
        } else {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
        }
    }
}

