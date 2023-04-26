/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class ServiceCadena {
    private Cadena frase;
    public void mostrarVocales(Cadena frase){
        this.frase = frase;
        int cont = 0;
        for (int i = 0; i < frase.getLongitud() ; i++) {

            switch (frase.getFrase().substring(i, i+1).toUpperCase()) {
                case "A":
                    cont++;
                    break;
                case "E":
                    cont++;
                    break;
                case "I":
                    cont++;
                    break;
                case "O":
                    cont++;
                    break;
                case "U":
                    cont++;
                    break;
                default:
                    break;
            }
            
        }
        System.out.println("La cantidad de vocales es: " + cont);
    }
    
    public void invertirFrase(Cadena frase){
        
        for(int i = frase.getLongitud()-1; i >= 0 ; i--) {
            System.out.print(frase.getFrase().charAt(i));
        }
        System.out.println("");
    }
    
    public void vecesRepetido(String letra){
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(frase.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                cont++;
            }
        }
        
        if(cont > 1)
        {
            System.out.println("La letra " + letra + " esta repetida " + cont + " veces.");
        }else if(cont == 1){
            System.out.println("La letra " + letra + " no esta repetida.");
        } 
        else{
            System.out.println("La letra " + letra + " no esta en la frase.");
        }
    }
    
    public void compararLongitud(String nFrase){
        
        if(frase.getLongitud() > nFrase.length())
        {
            System.out.println("La frase ingresada tiene una longitud menor.");
        }else if(frase.getLongitud() == nFrase.length()){
            System.out.println("La frase ingresada tiene una longitud igual.");
        }else{
            System.out.println("La frase ingresada tiene una longitud mayor.");
        }
    }
    
    public void unirFrase(String nFrase){
        
        System.out.println(frase.getFrase() + " " + nFrase);
    }
    
    public void reemplazar(String letra){
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(frase.getFrase().substring(i, i +1).equalsIgnoreCase("A")){
                System.out.print(letra);
            }else{
                System.out.print(frase.getFrase().substring(i, i +1));
            }
        }
    }
    
    public boolean contiene(String letra){
        boolean r = false;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(frase.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                r = true;
            }
        }
        return r;
    }
}
