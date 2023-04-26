/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class PersonaService {
    
    public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento de la persona (dd/mm/aaaa): ");
        String fechaNacimientoStr = scanner.nextLine();
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1;
        int anio = Integer.parseInt(partesFecha[2]);
        Date fechaNacimiento = new Date(anio-1900, mes, dia);
        return new Persona(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(Persona persona) {
        Date fechaNacimiento = persona.getFechaNacimiento();
        Date fechaActual = new Date();
        int diferenciaEnMs = fechaActual.getYear() - fechaNacimiento.getYear();
       
        return (int) (diferenciaEnMs);
    }
    
    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }
    
    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento().toString());
        System.out.println("Edad: " + calcularEdad(persona));
    }
    
}