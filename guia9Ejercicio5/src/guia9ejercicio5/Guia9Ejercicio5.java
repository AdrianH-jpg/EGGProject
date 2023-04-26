/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio5;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        Persona persona = personaService.crearPersona();
        personaService.mostrarPersona(persona);

        if (personaService.menorQue(persona, 18)) {
            System.out.println("La persona es menor de edad.");
        } else {
            System.out.println("La persona es mayor de edad.");
        }
    }
    
}
