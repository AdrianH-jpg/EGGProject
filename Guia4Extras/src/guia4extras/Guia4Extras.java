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
public class Guia4Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int opc;
        int resultado = 0;
        
        System.out.println("Ingrese primer numero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        do{
            System.out.println("BIENVENIDO");
            System.out.println("INGRESE UNA OPCION");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }while(opc < 4 && opc > 1);
        System.out.println("El resultado es : " + resultado);
    }
    public static int sumar(int n1,int n2){
        int suma = 0;
        suma = n1 + n2;
        return suma;
    }
    public static int restar(int n1,int n2){
        int resta = 0;
        resta = n1 - n2;
        return resta;
    }
    public static int multiplicar(int n1,int n2){
        int multi = 0;
        multi = n1 * n2;
        return multi;
    }
    public static int dividir(int n1,int n2){
        int divi = 0;
        divi = n1 / n2;
        return divi;
    }
    
}
