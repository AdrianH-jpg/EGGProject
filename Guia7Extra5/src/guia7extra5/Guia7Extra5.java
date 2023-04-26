/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra5;

import Calculo.Empleado;

/**
 *
 * @author Adrian H
 */
public class Guia7Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 35, 2000.0);
        System.out.println("El empleado " + empleado.getNombre() + " de " + empleado.getEdad() + " años de edad");
        System.out.println("Salario actual: " + empleado.getSalario());

        empleado.calcular_aumento();

        System.out.println("Salario después del aumento: " + empleado.getSalario());
    }
    
}
