/*
 * 4. Escribe un programa que muestre los números enteros de A a B (valores que se le
 * piden   al   usuario)   en   orden   inverso.   Es   decir,   debe   empezar   por   B   (el   mayor)   y
 * terminar por A (el menor).
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int a = lector.nextInt();

        System.out.print("Escribe otro número: ");
        int b = lector.nextInt();

        for (int i = b; i >= a; i--) {
            System.out.println(i);
        }
    }
}
