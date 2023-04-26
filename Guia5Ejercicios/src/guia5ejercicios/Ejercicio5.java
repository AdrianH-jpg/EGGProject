/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicios;

import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Random r = new Random();

        int[][] vectorA = new int[3][3];
        int[][] vectorB = new int[3][3];
        
        vectorA[0][0]=0;
        vectorA[0][1]=-2;
        vectorA[0][2]=4;
        vectorA[1][0]=2;
        vectorA[1][1]=0;
        vectorA[1][2]=2;
        vectorA[2][0]=-4;
        vectorA[2][1]=-2;
        vectorA[2][2]=0;
        
        vectorB[0][0]=0;
        vectorB[0][1]=2;
        vectorB[0][2]=-4;
        vectorB[1][0]=-2;
        vectorB[1][1]=0;
        vectorB[1][2]=-2;
        vectorB[2][0]=4;
        vectorB[2][1]=2;
        vectorB[2][2]=0;
        
        Boolean e = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(vectorA[i][j] != (vectorB[i][j] * -1)){
                    e = false;
                  
                }

            }
            if(e==false){
                break;
            }
        }
        if(e){
            System.out.println("Las matrices son antisimétricas ");
        }else{
            System.out.println("Las matrices no son antisimétricas ");
        }
    }
}
