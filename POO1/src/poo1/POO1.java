/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import Entidad.Persona;

/**
 *
 * @author Adrian H
 */
public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        Persona nuevaPersona = new Persona("Adrian", "Hahn", 29);
        
        nuevaPersona.setNombre("Belen");
        nuevaPersona.setApellido("Antunez");
        nuevaPersona.setEdad(29);
    }

    
    
}
