/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author Adrian H
 */

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas.
*/
public class Libro {
    int  ISBN;
    String Titulo;
    String Autor;
    int nPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int nPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.nPaginas = nPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    @Override
    public String toString() {
        return "Libro: " + "\n" + "ISBN: " + ISBN + "\n" + "Titulo: " + Titulo + "\n" + "Autor: " + Autor + "\n" + "Num Paginas: " + nPaginas;
    }
    
    
    
    
    
    
    
}
