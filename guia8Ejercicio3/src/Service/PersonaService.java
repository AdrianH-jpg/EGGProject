/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class PersonaService {
    private Persona Pr = new Persona();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        Pr.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        Pr.setEdad(leer.nextInt());
        
        String n;
        boolean sexoValido = false;
        while(!sexoValido) {
            System.out.println("Ingrese el sexo de la persona, sea H para hombre, M para mujer, O para otro");
            n = leer.nextLine();
            if(n.equalsIgnoreCase("H") || n.equalsIgnoreCase("M") || n.equalsIgnoreCase("O")) {
                sexoValido = true;
                Pr.setSexo(n.charAt(0));
            }
            else{
                System.out.println("Error: El sexo ingresado no es válido.");
            }
            
        }
        System.out.println("Ingrese el peso de la persona");
        Pr.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese la altura de la persona");
        Pr.setAltura(leer.nextDouble());
        
        return Pr;
    }
    
    public boolean esMayorDeEdad(Persona P){
        return 18 < P.getEdad();
    }
    
    public int calcularIMC(Persona P){
        double imc = P.getPeso() / (P.getAltura() * P.getAltura()); 

        if (imc < 20) {
            return -1; // La persona está por debajo de su peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // La persona está en su peso ideal
        } else {
            return 1; // La persona tiene sobrepeso
        }
    }
}
