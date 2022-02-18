/*
 * Proyecto UD3 - Archivo EjerBuclesBeta5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:32:58
 */

/*
 * 5.Escribe un programa que sume independientemente los pares y los impares de los 
 * números comprendidos entre A y B (valores que introduce el usuario), y luego 
 * muestre por pantalla ambas sumas.
 */
public class EjerBuclesBeta5 {

    public static void main(String[] args) {
        int num1, num2, pares = 0, impares = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("Dime un número: ");
        num1 = lector.nextInt();

        System.out.println("Dime otro número: ");
        num2 = lector.nextInt();

        for (int i = num1; i <= num2; i++) {
            if ((i % 2) == 0) {
                pares += i;
            } else {
                impares += i;
            }

        }

        System.out.println("Suma de pares: " + pares);
        System.out.println("Suma de impares: " + impares);

    }
}
