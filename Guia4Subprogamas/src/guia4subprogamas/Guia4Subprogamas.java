/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4subprogamas;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Guia4Subprogamas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String frase;
        String fraseJ;
        
        
        System.out.println("Ingrese una frase que termine en (.) ");
        frase = leer.nextLine();
        fraseJ=cambiar(frase);
        System.out.println("La frase quedara asi: " + fraseJ);
    }
    public static String cambiar(String frase){
        int i = 0;
        String x = "";
        String fraseG = " ";
        
        while(!x.equals(".") && i <= frase.length()){
            x= frase.substring(i, i + 1);
            
            switch(x.toUpperCase()){
                case "A":
                    x = "@";
                    break;
                case "E":
                    x = "#";
                    break;
                case "I":
                    x = "$";
                    break;
                case "O":
                    x="%";
                    break;
                case "U":
                    x="*";
                    break;
                default:
                        break;
                        
              
            }
            fraseG = fraseG.concat(x);
            i++;
            
        }
        
        return fraseG;
        
    }
    
}
