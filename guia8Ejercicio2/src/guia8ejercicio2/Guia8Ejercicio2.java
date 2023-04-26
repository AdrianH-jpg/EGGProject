/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio2;

import Entidad.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia8Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraService CS = new CafeteraService();
        Scanner leer = new Scanner(System.in);
        Cafetera C = CS.llenarCafetera();
        int opc;
        do{
        System.out.println("Ingrese una opcion: \n 1 llenar taza \n 2 Vaciar cafetera \n 3 Agregar cafe \n 4 Salir");
         opc = leer.nextInt();
         switch(opc){
             case 1: 
                 System.out.println("Ingrese el tamaño de la taza vacia");
                 CS.servirTaza(leer.nextInt());
                 break;
             case 2:
                 System.out.println("Vaciando cafetera...");
                 CS.vaciarCafetera();
                 break;
             case 3:
                 System.out.println("Ingrese la cantidad de cafe que desea agregar");
                 CS.agregarCafe(leer.nextInt());
                 break;
         }
        }while(opc != 4);
    }
    
}
