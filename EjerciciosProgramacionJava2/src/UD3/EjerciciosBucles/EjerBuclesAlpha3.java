/*
 * 3. Escribe un programa que muestre los números enteros de A a B (valores que se le
 * piden al usuario) en pasos de dos. Por ejemplo, si A=5 y B=21, entonces mostraría 5,
 * 7, 9, 11... hasta 21.
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int a = lector.nextInt();

        System.out.print("Escribe otro número: ");
        int b = lector.nextInt();

        for (int i = a; i <= b; i += 2) {
            System.out.println(i);
        }
    }
}
