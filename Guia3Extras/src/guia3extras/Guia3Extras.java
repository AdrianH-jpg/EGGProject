/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Guia3Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int dato;
        int minutos = 0;
        int horas = 0;
        int dias = 0;
        System.out.println("Bienvenido");
        System.out.println("Ingrese la cantidad de minutos que desea convertir en dias/horas");
        dato = leer.nextInt();
        System.out.println(dato);
        do{
            if(dato > 1440){
                dias++;
                dato = dato -1440;
            }
            if(dato >= 60)
            {
                horas++;
                dato= dato-60;
            }else
            {
                minutos = dato;
                dato = 0;
            } 
        }while(dato > 0);
        System.out.println("La cantidad de dias: " + dias);
        System.out.println("La cantidad de horas: " + horas);
        System.out.println("La cantidad de minutos: " + minutos);
    }
    
}
