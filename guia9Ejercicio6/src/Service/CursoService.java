/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class CursoService {
    private Scanner leer = new Scanner(System.in);

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        leer.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i+1) + ": ");
            alumnos[i] = leer.nextLine();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        System.out.print("Ingrese nombre del curso: ");
        String nombre = leer.next();
        System.out.print("\nIngrese turno del curso T(tarde) - M(mañana): ");
        String turno = leer.next();
        System.out.print("\nIngrese horas al día que se dicta el curso: ");
        int horas = leer.nextInt();
        System.out.print("\nIngrese días a la semana que se dicta el curso: ");
        int dias = leer.nextInt();
        System.out.print("\nIngrese precio por hora del curso: ");
        double precio = leer.nextDouble();

        return new Curso(nombre, turno, horas, dias, precio, cargarAlumnos());
    }

    public void gananciaSemanal(Curso c) {
        System.out.println("La ganancia semanal del curso " + c.getNombreCurso() + " es:");
        System.out.print(c.getHorasDia()*c.getDiasSemana()*c.getPrecioHora()*5);
    }
}