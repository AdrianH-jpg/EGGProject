/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio1;

import Entidad.Cadena;
import Service.ServiceCadena;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cadena frase = new Cadena("la era del hombre a terminado, la era de orco comienza");
        
        ServiceCadena SC = new ServiceCadena();
        
        SC.mostrarVocales(frase);
        SC.invertirFrase(frase);
        System.out.println("Ingrese una letra a comparar");
        String r = leer.next();
        SC.vecesRepetido(r);
        System.out.println("Ingrese una frase a comparar ");
        String l = "hola juan carlos";
        SC.compararLongitud(l);
        SC.unirFrase(l);
        SC.reemplazar(r);
        
        System.out.println("\n" + SC.contiene(r));
    }
    
}
