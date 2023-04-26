/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4extras;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioExtra3 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        double euros;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros (€)");
        euros = leer.nextInt();
        System.out.println("Ingrese moneda a convertir (dólares, yenes o libras)");
        moneda = leer.next().toLowerCase();
        
        while (!moneda.equalsIgnoreCase("libras") && (!moneda.equalsIgnoreCase("yenes")) && (!moneda.equalsIgnoreCase("dolares"))) {
            System.out.println("\nOpcion no valida\nSolo Ingrese \"libras\", \"dolares\" o \"yenes\"\n");
            moneda = leer.next();
        }
        convertir(euros,moneda);
    }
    
    public static void convertir(double euros, String moneda){
        double resultado;
        
        switch(moneda){
            case "dolares":
                resultado = euros * 1.28611;
                System.out.println(euros + " euros son " + resultado + " dolares");
                break;
            case "libras":
                resultado = euros * 0.86;
                System.out.println(euros + " euros son " + resultado + " libras");
                break;
            case "yenes":
                resultado = euros * 129.852;
                System.out.println(euros + " euros son " + resultado + " yenes");
                break;
            default:
                System.out.println("Ingrese una moneda valida");
            
        }
        
    }
}
