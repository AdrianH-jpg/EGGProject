/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1b;
import Biblioteca.Libro;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN ");
        l1.setISBN(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese titulo del libro ");
        l1.setTitulo(leer.nextLine());
        System.out.println("Ingrese nombre del autor ");
        l1.setAutor(leer.nextLine());
        System.out.println("Ingrese cantidad de paginas del libro ");
        l1.setnPaginas(leer.nextInt());
        
        System.out.println(l1.toString());
    }
    
}
