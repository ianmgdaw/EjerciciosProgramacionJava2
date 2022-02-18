/*
 * Proyecto UD3 - Archivo EjerBuclesAlpha15.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:20:24
 */

/* 15. Escribe un programa que pida 5 números al usuario y luego muestre por pantalla si
 * alguno era negativo y si alguno era mayor que 99.
 */
public class EjerBuclesAlpha15 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        boolean mayor99 = false, neg = false;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Dime un numero: ");
            int num = lector.nextInt();

            if ((num % 2) == 0) {
                neg = true;
            }

            if (num > 99) {
                mayor99 = true;
            }
        }

        if (neg) {
            System.out.println("Alguno era negativo");
        } else {
            System.out.println("Ninguno era negativo");
        }

        if (mayor99) {
            System.out.println("Alguno era mayor que 99");
        } else {
            System.out.println("Ninguno era mayor que 99");
        }
    }
}
