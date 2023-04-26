/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra2;

import NIFService.VerificadoService;

/**
 *
 * @author Adrian H
 */
public class Guia8Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VerificadoService VS = new VerificadoService();
        
        VS.crearNif();
        System.out.println(VS.mostrar());
    }
    
}
