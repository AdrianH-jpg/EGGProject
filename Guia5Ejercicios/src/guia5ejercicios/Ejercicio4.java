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
public class Ejercicio4 {
    public static void main(String[] args) {
        Random r = new Random();

        int[][] vectorA = new int[4][4];
        int[][] vectorB = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int a = r.nextInt(100);
                vectorA[i][j] = a;
                vectorB[j][i] = a;
            }
        }
        System.out.println("Vector A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[ " + vectorA[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("Vector B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[ " + vectorB[i][j] + " ]");
            }
            System.out.println("");
        }
    }
}
