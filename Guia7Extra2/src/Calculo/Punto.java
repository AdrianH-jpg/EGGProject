/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Punto {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Método para crear los puntos ingresados por el usuario
    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.print("x1: ");
        x1 = scanner.nextDouble();
        System.out.print("y1: ");
        y1 = scanner.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.print("x2: ");
        x2 = scanner.nextDouble();
        System.out.print("y2: ");
        y2 = scanner.nextDouble();
    }

    // Método para calcular y devolver la distancia entre los dos puntos
    public double calcularDistancia() {
         return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
    }

    // Getters y setters
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }


}
