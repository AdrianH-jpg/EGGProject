/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio3;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia8Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       PersonaService PS = new PersonaService();
       //Persona P = PS.crearPersona();
       Scanner scanner = new Scanner(System.in);
       
        // Crear 4 objetos de tipo Persona
        Persona persona1 = new Persona("Javier", 28, 'M',70.0,1.8);
        Persona persona2 = new Persona("María", 25, 'M', 60.0, 1.6);
        Persona persona3 = new Persona("Juan", 17, 'H', 70.0, 1.75);
        Persona persona4 = new Persona("Ana", 30, 'M', 55.0, 1.65);
        
        int[] imcResultados = new int[4];
        boolean[] mayorEdadResultados = new boolean[4];
        
        imcResultados[0] = PS.calcularIMC(persona1);
        mayorEdadResultados[0] = PS.esMayorDeEdad(persona1);
        
        imcResultados[1] = PS.calcularIMC(persona2);
        mayorEdadResultados[1] = PS.esMayorDeEdad(persona2);
        
        imcResultados[2] = PS.calcularIMC(persona3);
        mayorEdadResultados[2] = PS.esMayorDeEdad(persona3);
        
        imcResultados[3] = PS.calcularIMC(persona4);
        mayorEdadResultados[3] = PS.esMayorDeEdad(persona4);
        
        
        // Calculamos el porcentaje de personas por debajo de su peso, en su peso ideal y por encima
        int debajoPeso = 0;
        int pesoIdeal = 0;
        int encimaPeso = 0;
        int mayor = 0;
        int menor = 0;
        
        for (int i = 0; i < imcResultados.length; i++) {
           switch (imcResultados[i]) {
               case -1:
                   debajoPeso++;
                   break;
               case 0:
                   pesoIdeal++;
                   break;
               default:
                   encimaPeso++;
                   break;
           }
        }
        for (int i = 0; i < mayorEdadResultados.length; i++) {
           if(mayorEdadResultados[i]) {
               mayor++;
           }
           else{
               menor++;
           }
        }
        
        double porcentajeDebajoPeso = debajoPeso * 100.0 / imcResultados.length;
        double porcentajePesoIdeal = pesoIdeal * 100.0 / imcResultados.length;
        double porcentajeEncimaPeso = encimaPeso * 100.0 / imcResultados.length;
        double mayorPorcentaje = mayor * 100.0 / mayorEdadResultados.length;
        double menorPorcentaje = menor * 100.0 / mayorEdadResultados.length;
        
        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcentajeDebajoPeso + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobre peso: " + porcentajeEncimaPeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + mayorPorcentaje + "%");
        System.out.println("Porcentaje de personas menores de edad: " + menorPorcentaje + "%");
    }
        
    
}
