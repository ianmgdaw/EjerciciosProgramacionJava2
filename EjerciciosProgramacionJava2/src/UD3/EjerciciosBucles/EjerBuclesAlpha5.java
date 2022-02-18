/*
 * 5. Escribe un programa que muestre los números enteros de A a B (valores que se le
 * piden al usuario) en orden inverso y en pasos de 2. Por ejemplo, si A=20 y B=-10,
 * entonces mostrará 20, 18, 16... hasta -10
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int a = lector.nextInt();

        System.out.print("Escribe otro número: ");
        int b = lector.nextInt();

        for (int i = a; i >= b; i -= 2) {
            System.out.println(i);
        }
    }
}
