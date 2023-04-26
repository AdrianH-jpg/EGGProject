/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceCuentaBancaria {
    
    private Scanner leer = new Scanner(System.in);
    private CuentaBancaria CB = new CuentaBancaria();
    
    public CuentaBancaria crearCuenta(){

        System.out.println("Ingrese el numero de cuenta");
        CB.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese el DNI del cliente");
        CB.setDniCliente(leer.nextInt());
        
        System.out.println("Ingrese el saldo de la cuenta");
        CB.setSaldoActual(leer.nextDouble());
        
        return CB;
        
    }
    
    public CuentaBancaria ingresar(double saldo){
        CB.setSaldoActual(CB.getSaldoActual()+saldo);
        return CB;
    }
    
    public CuentaBancaria retirar(double retiro){
        if(CB.getSaldoActual()<retiro){
            System.out.println("El monto maximo a retirar es: " + CB.getSaldoActual());
            System.out.println("Se ah retirado con exito: " + CB.getSaldoActual());
            CB.setSaldoActual(0);
            
        }
        else{
            System.out.println("Se ah retirado con exito: " + retiro);
            CB.setSaldoActual(CB.getSaldoActual()-retiro);
            System.out.println("Su nuevo saldo es de: " + CB.getSaldoActual());
        }
        
        return CB;
    }
    
    public CuentaBancaria extraccionRapida(double retiro){
        if((CB.getSaldoActual()*0.20)<retiro){
            System.out.println("El monto maximo a retirar es: " + (CB.getSaldoActual()*0.20));
        }
        else{
            System.out.println("Se ah retirado con exito: " + retiro);
            CB.setSaldoActual(CB.getSaldoActual()-retiro);
            System.out.println("Su nuevo saldo es de: " + CB.getSaldoActual());
        }
        
        return CB;
    }
    
    public CuentaBancaria consultarSaldo(){
         System.out.println("El saldo de la cuenta es: " + CB.getSaldoActual());
         return CB;
    }
    public CuentaBancaria consultarDatos(){
         System.out.println("El numero de la cuenta es: " + CB.getNumeroCuenta());
         System.out.println("El DNI del cliente es: " + CB.getDniCliente());
         System.out.println("El saldo de la cuenta es: " + CB.getSaldoActual());
         return CB;
    }
}
