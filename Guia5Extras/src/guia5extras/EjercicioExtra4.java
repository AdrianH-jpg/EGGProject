/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extras;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class EjercicioExtra4 {
    public static void main(String[] args) {
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        double[] [] matriz = new double[10][5];
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 5; j++) {
                matriz[i][j]= (Math.random()*10);
            }
            matriz[i][4] = (matriz[i][0] * 0.1 + matriz[i][1] * 0.15 + matriz[i][2] * 0.25 + matriz[i][3] * 0.5);
            
            if(matriz[i][4] < 7){
                cont++;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(df.format(matriz[i][j]) + " ");
            }
            System.out.println("");
            
        }
        System.out.println("Cantidad de aprobados: " + (10-cont));
        System.out.println("Cantidad de desaprobados: " + cont);
    }
}
