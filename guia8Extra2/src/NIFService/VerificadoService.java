/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFService;

import NIF.Verificador;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class VerificadoService {
    private Scanner leer = new Scanner(System.in);
    private Verificador V = new Verificador();
    
    String[] vec = new String[23];
    
    


    
    public Verificador crearNif(){
        System.out.println("Ingrese su numero de DNI");
        V.setDNI(leer.nextInt());
        int resultado = V.getDNI() % 23;
        
        vec[0] = "T";
        vec[1] = "R";
        vec[2] = "W";
        vec[3] = "A";
        vec[4] = "G";
        vec[5] = "M";
        vec[6] = "Y";
        vec[7] = "F";
        vec[8] = "P";
        vec[9] = "D";
        vec[10] = "X";
        vec[11] = "B";
        vec[12] = "N";
        vec[13] = "J";
        vec[14] = "Z";
        vec[15] = "S";
        vec[16] = "Q";
        vec[17] = "V";
        vec[18] = "H";
        vec[19] = "L";
        vec[20] = "C";
        vec[21] = "K";
        vec[22] = "E";
        System.out.println(resultado);
        for (int i = 0; i <= 22; i++) {
            if(resultado==i){
                V.setLetra(vec[i]);
            }
        }
        return V;
    }
    
    public String mostrar(){
        String cadena;
        cadena = ("El NIF es : " + V.getDNI() + " - " + V.getLetra());
        return cadena;
    }
}
