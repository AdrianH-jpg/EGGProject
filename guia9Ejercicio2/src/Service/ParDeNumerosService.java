/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.ParDeNumeros;

/**
 *
 * @author Adrian H
 */
public class ParDeNumerosService {
    private ParDeNumeros parDeNumeros;
    
    public ParDeNumerosService() {
        this.parDeNumeros = new ParDeNumeros();
    }
    
    public void mostrarValores() {
        System.out.println("Número 1: " + parDeNumeros.getNumero1());
        System.out.println("Número 2: " + parDeNumeros.getNumero2());
    }
    
    public double devolverMayor() {
        if (parDeNumeros.getNumero1() > parDeNumeros.getNumero2()) {
            return parDeNumeros.getNumero1();
        } else {
            return parDeNumeros.getNumero2();
        }
    }
    
    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = (mayor == parDeNumeros.getNumero1()) ? parDeNumeros.getNumero2() : parDeNumeros.getNumero1();
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz() {
        double menor = (parDeNumeros.getNumero1() < parDeNumeros.getNumero2()) ? parDeNumeros.getNumero1() : parDeNumeros.getNumero2();
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
