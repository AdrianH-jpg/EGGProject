/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forma;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */


public class Rectángulo {
    private int base;
    private int altura;

    // Constructor con todos los atributos pasados por parámetro
    public Rectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Constructor sin los atributos pasados por parámetro
    public Rectángulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Métodos get y set
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método para crear el rectángulo con los datos dados por el usuario
    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        int base = scanner.nextInt();
        System.out.print("Introduce la altura del rectángulo: ");
        int altura = scanner.nextInt();
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular la superficie del rectángulo
    public int calcularSuperficie() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    public int calcularPerimetro() {
        return (base + altura) * 2;
    }

    // Método para dibujar el rectángulo mediante asteriscos
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

