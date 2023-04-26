/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class CafeteraService {
    private Scanner leer = new Scanner(System.in);
    private Cafetera C = new Cafetera();
    public Cafetera llenarCafetera(){
        System.out.println("Ingrese la capacida de la cafetera");
        
        C.setCapacidadMáxima(leer.nextInt());
        C.setCantidadActual(C.getCapacidadMáxima());
        
        return C;
    }
    
    public Cafetera servirTaza(int T){
        if(C.getCantidadActual() == 0){
            System.out.println("La cafetera esta vacia, por favor llenela");
        }
        else if (T < C.getCantidadActual()){
            System.out.println("Sirviendo...");
            C.setCantidadActual(C.getCantidadActual()-T);
        }
        else{
            System.out.println("La cantidad actual de la cafetera es inferior a la taza");
            System.out.println("Sirviendo...");
            System.out.println("Se cargo " + C.getCantidadActual() + " de cafe a la taza");
            C.setCantidadActual(0);
        }
        return C;
    }
    public Cafetera vaciarCafetera(){
        C.setCantidadActual(0);
        return C;
    }
    
    public Cafetera agregarCafe(int cafe){
        if(C.getCapacidadMáxima()< C.getCantidadActual()+cafe){
            System.out.println("No se puede agregar mas cafe del que puede contener la cafetera");
            System.out.println("El maximo a ingresar es " + (C.getCapacidadMáxima()-C.getCantidadActual()));
        }
        else{
            System.out.println("Se agrego correctamente el cafe");
            C.setCantidadActual(C.getCantidadActual()+cafe);
        }
        return C;
    }
}
