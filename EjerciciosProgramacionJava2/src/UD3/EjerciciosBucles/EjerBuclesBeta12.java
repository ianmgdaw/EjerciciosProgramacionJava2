/*
 * Proyecto UD3 - Archivo EjerBuclesBeta12.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 13:56:29
 */

/*
12. Escribe un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador
intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez 
hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al
número que ha pensado).
*/
public class EjerBuclesBeta12 {
    public static void main(String[] args) {
        // Variables
        int num, min = 1, max = 100;
        boolean acertado = false;
        char c;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Bucle en el que intentamos adivinar el número una y otra vez
        do {
            // Número a preguntar
            num = (min + max) / 2;

            // Preguntamos al usuario
            System.out.print("¿Es el " + num + "? ");
            System.out.println("(s)Sí (+)Es mayor (-)Es menor");
            c = in.nextLine().charAt(0);

            switch (c) {
                // Acertado
                case 's':
                    System.out.println("¡He acertado!");
                    acertado = true;
                    break;
                // El número es mayor
                case '+':
                    min = num;
                    break;
                // El número es menor
                case '-':
                    max = num;
                    break;
                // Otro
                default:
                    System.out.println("Aviso: Respuesta incorrecta");
            }
        } while (!acertado);
    }
}
