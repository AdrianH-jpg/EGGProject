/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio6;

import Entidad.Curso;
import Service.CursoService;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso c = cs.crearCurso();
        cs.gananciaSemanal(c);
    }
    
}
