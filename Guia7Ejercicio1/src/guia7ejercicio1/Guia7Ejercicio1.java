/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;
import Biblioteca.Libro;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l = new Libro();
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro");
       
        l.setISBN(Leer.nextLine());
        System.out.println("Ingrese el titulo del libro");
        l.setTitulo(Leer.nextLine());
        System.out.println("Ingrese el nombre del autor del libro");
        l.setAutor(Leer.nextLine());
        System.out.println("Ingrese la cantidad de paginas del libro");
        l.setnPaginas(Leer.nextInt());
        
        System.out.println(l.toString());
        
    }
    
}
