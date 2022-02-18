/*
 * Proyecto UD3 - Archivo EjerBuclesBeta10.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 13:40:44
 */

/*
10.Escribe un programa que pregunte un número X al usuario y diga si es primo o no. 
Más información: https://es.wikipedia.org/wiki/N%C3%BAmero_primo
*/
public class EjerBuclesBeta10 {
    public static void main(String[] args) {
        // Variables
        int x;
        boolean esPrimo = true;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos X
        System.out.print("Dime X: ");
        x = in.nextInt();
        
        // Un número es primo si SOLO es divisible entre 1 y sí mismo.
        // Por lo tanto, un número NO será primo si es divisible entre algún
        // número entre 2 y X-1 (realmente basta con comprobar hasta X/2).
        for (int i = 2; i <= x/2; i++) {
            if ((x % i)==0)
                esPrimo = false;
        }
        
        // Mostramos si es primo o no
        if (esPrimo)
            System.out.println(x + " SÍ es primo");
        else
            System.out.println(x + " NO es primo");
    }
}
