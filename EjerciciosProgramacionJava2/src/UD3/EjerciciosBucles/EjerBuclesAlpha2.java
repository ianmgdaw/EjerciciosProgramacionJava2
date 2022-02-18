/*
 * 2. Escribe un programa que muestre los números enteros de A a B (valores que se le
 * piden al usuario).
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int a = lector.nextInt();

        System.out.print("Escribe otro número: ");
        int b = lector.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
