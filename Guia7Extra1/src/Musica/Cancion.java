/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Musica;

/**
 *
 * @author Adrian H
 */
public class Cancion {
    private String titulo;
    private String autor;

    // Constructor vacío
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    // Constructor con parámetros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

