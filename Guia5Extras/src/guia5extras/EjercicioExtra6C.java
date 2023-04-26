/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class EjercicioExtra6C {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String [][] sopa = new String [20][20];
        String [] palabra = new String [5];
        
        boolean [] bandera = new boolean [20];
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                sopa[i][j]="";
                
            }
            
        }
               
        
        int fila, columna;
        
        for (int i=0; i<5;i++){
            
            do {
                System.out.print("Ingrese la "+(i+1)+"º palabra de entre 3 y caracteres: ");
                
                palabra[i] = leer.nextLine();
                
                
            } while (palabra[i].length()>5 || palabra[i].length()<3 );
            
        }
        
        for (int i=0; i<5; i++){
            
            do{
                fila = (int)(Math.random()*20);
            
            } while (bandera[fila]);
                    
            bandera[fila]=true;
            
            columna = (int)(Math.random()*(20 - palabra[i].length() + 1));
            
            for (int j=0;j<palabra[i].length();j++){
                
                sopa [fila][columna+j] = palabra[i].substring(j,j+1);
                
            }
            
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                if ("".equals(sopa[i][j])){
                    
                    sopa[i][j]= String.valueOf((int)(Math.random()*10));
                }
                
            }
            
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                System.out.print(sopa[i][j]+" ");
                
            }
 
            System.out.println("");
            
        }
                      
    }
    
}

