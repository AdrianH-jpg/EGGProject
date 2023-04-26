/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */


public class FechaService {
    
    public static Date fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año de su nacimiento: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese el mes de su nacimiento (1-12): ");
        int mes = scanner.nextInt(); // Los meses en la clase Date van de 0 a 11
        System.out.print("Ingrese el día de su nacimiento: ");
        int dia = scanner.nextInt();
        return new Date(anio - 1900, mes-1, dia);
    }
    
    public static Date fechaActual() {
        return new Date();
    }
    
    public static int diferencia(Date fecha1, Date fecha2) {
        int diferenciaEnMs = fecha2.getYear() - fecha1.getYear();
        return (int) (diferenciaEnMs ); 
    }
}