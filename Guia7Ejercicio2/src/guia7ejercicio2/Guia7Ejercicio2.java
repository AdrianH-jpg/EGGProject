/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio2;
import Calculo.Circunferencia;
/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia c = new Circunferencia(0);
        
        c.crearCircunferencia();
        System.out.println("El area es: " + c.area());
        System.out.println("El perimetro es: " + c.perimetro());
        
    }
    
}
