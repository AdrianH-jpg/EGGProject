/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra4;

import Banca.Cuenta;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Guia7Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Juan Perez", 1000.0);
        Scanner leer = new Scanner(System.in);
//        cuenta.retirar_dinero(500.0);
//        cuenta.retirar_dinero(700.0);
          do{
              System.out.println("Bienvenido " + cuenta.getTitular() + "\n" + "cuanto desea retirar?");
              cuenta.retirar_dinero(leer.nextDouble());
              
          }while(cuenta.getSaldo() != 0);
    }
    
}
