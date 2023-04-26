/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

/**
 *
 * @author Adrian H
 */
public class EjercicioExtra12 {
    public static void main(String[] args){
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    if(Integer.toString(i).equals("3"))
                    {
                        System.out.print("E");
                    }
                    else{
                        System.out.print(i);
                    }
                    System.out.print(" - ");
                    if(Integer.toString(j).equals("3"))
                    {
                        System.out.print("E");
                    }
                    else{
                        System.out.print(j);
                    }
                    System.out.print(" - ");
                    if(Integer.toString(k).equals("3"))
                    {
                        System.out.print("E");
                    }
                    else{
                        System.out.print(k);
                    }
                    System.out.println("");
                }
            }
        }
    }
}
