/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad 
de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java Substring(), Length(), equals().
*/
public class Ejercicio7 {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        String cadena = "12345";
        int correctas = 0;
        int incorrectas = 0;
//        System.out.println(cadena.substring(cadena.length()-1,cadena.length()));
        do{
            System.out.println("Ingrese cadenas de caracteres de un maximo de 5, deben iniciar con X y terminar con O.");
            System.out.println("Si desea finalizar el proceso debe enviar &&&&&");
            cadena = leer.nextLine();
            
            if(cadena.length()<= 5)
            {
                if(cadena.substring(0,1).equalsIgnoreCase("x") || cadena.substring(cadena.length()-1,cadena.length()).equalsIgnoreCase("o")){
                    correctas++;
                }
                else{
                    incorrectas++;
                }
            } 
            else
            {
                incorrectas++;
            }
            
        }while(!cadena.equals("&&&&&"));
        System.out.println("Cantidad de cadenas correctas: " + correctas + " cantidad de cadenas incorrectas: " + incorrectas);
    }
}
