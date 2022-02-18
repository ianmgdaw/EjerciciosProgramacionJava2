/*
 * Proyecto UD3 - Archivo EjerBuclesBeta13.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 13:59:40
 */

/*
13. Escribe un programa que pida un número entero al usuario (int) y luego muestre la 
suma de sus cifras. Por ejemplo, dado el número 35 su suma es 8, dado el número 
719 su suma es 17, y dado el 1002 su suma es 3
*/
public class EjerBuclesBeta13 {
    public static void main(String[] args) {
        // Variables
        int n, suma = 0;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos X
        System.out.print("Dime un número: ");
        n = in.nextInt();

        // Bucle que calcula la suma de las cifras de n
        while (n > 0) {
            // Sumamos la cifra más a la derecha
            suma += (n % 10);
            // Quitamos la cifra más a la derecha
            n = n / 10;
        }

        // Mostramos suma de cifras
        System.out.println("Suma de cifras: " + suma);
    }
}
