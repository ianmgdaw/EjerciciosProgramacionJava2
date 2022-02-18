/*
 * Proyecto UD3 - Archivo EjerBuclesBeta8.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 13:32:44
 */

/*
8.Escribe un programa que muestre los N primeros números de la secuencia de 
fibonacci. N es un valor que introduce el usuario. Recuerda que la secuencia de 
fibonacci comienza por 1, 1, y a continuación cada valor es la suma de los dos valores
anteriores: 1, 1, 2, 3, 5, 8, 13... El valor N lo introduce el usuario.
*/
public class EjerBuclesBeta8 {
    public static void main(String[] args) {
        // Variables
        int n, anterior2 = 1, anterior1 = 1, actual;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos N
        System.out.print("Dime N: ");
        n = in.nextInt();
        
        // Mostramos los dos primeros números (si procede)
        if (n >= 1)
            System.out.print("1");
        if (n >= 2)
            System.out.print(",1");
        
        // Bucle desde 3 hasta N. Mostramos secuencia de Fibonacci
        for (int i = 3; i <= n; i++) {
            // Número actual de Fibonacci (suma de los 2 anteriores)
            actual = anterior1 + anterior2;
            System.out.print("," + actual);
            // El anterior1 pasa a ser el anterior2
            anterior2 = anterior1;
            // El actual pasa a ser el anterior1
            anterior1 = actual;   
        }
        
        // Mostramos línea en blanco
        System.out.println("");
    }
}
