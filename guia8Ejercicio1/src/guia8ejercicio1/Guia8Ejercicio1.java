/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1;
import Service.ServiceCuentaBancaria;
import java.util.Scanner;
import Entidad.CuentaBancaria;
/**
 *
 * @author Adrian H
 */
public class Guia8Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
       Scanner leer = new Scanner(System.in);
       ServiceCuentaBancaria SCB = new ServiceCuentaBancaria();
       System.out.println("Bienvenido cree su cuenta");
       CuentaBancaria CB = SCB.crearCuenta();
        System.out.println(CB.getNumeroCuenta());
        System.out.println(CB.getDniCliente());
        System.out.println(CB.getSaldoActual());
       do{
       System.out.println("Ingrese una opcion: \n 1 ingresar \n 2 retirar \n 3 Extraccion Rapida \n 4 Consultar Saldo \n 5 Consultar Datos \n 6 Salir");
       opc = leer.nextInt();
       switch(opc){
           case 1:
               System.out.println("Cantidad a ingresar: ");
               SCB.ingresar(leer.nextDouble());
               break;
           case 2:
               System.out.println("Cantidad a retirar: ");
               SCB.retirar(leer.nextDouble());
               break;
           case 3:
               System.out.println("Ingrese cantidad a retirar (recuerde que solo es un maximo del 20%): ");
               SCB.extraccionRapida(leer.nextDouble());
               break;
           case 4:
               SCB.consultarSaldo();
               break;
           case 5:
               SCB.consultarDatos();
               break;
           default:
               break;
       }
       }while(opc != 6);
       
        System.out.println(CB.toString());
    }
    
}
