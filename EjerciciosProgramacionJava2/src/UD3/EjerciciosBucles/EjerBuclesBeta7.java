/*
 * Proyecto UD3 - Archivo EjerBuclesBeta7.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 13:28:15
 */

/*
7.Escribe un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial: 0! = 1, 1! = 1, 2! = 2 * 1, 3! = 3 * 2* 1, N! = N * (N-1) * (N-2) * ... * 1
 */
public class EjerBuclesBeta7 {

    public static void main(String[] args) {
        int n, fact = 1;

        Scanner in = new Scanner(System.in);

        System.out.print("Dime N: ");
        n = in.nextInt();

        // Calculamos N! (el factorial de N)
        // Bucle i va desde N hasta 1, multiplicamos por i
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        System.out.println("N! es " + n + "! = " + fact);
    }
}
