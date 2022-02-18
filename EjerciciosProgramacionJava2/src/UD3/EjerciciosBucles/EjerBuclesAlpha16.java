/*
 * Proyecto UD3 - Archivo EjerBuclesAlpha16.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:35:16
 */

/*
 * 16. Escribe un programa que pida 5 números al usuario y luego muestre por pantalla
 * cuántos eran positivos y cuántos negativos.
 */
public class EjerBuclesAlpha16 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int contPos = 0, contNeg = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Dime un numero: ");
            int num = lector.nextInt();

            if (num >= 0) {
                contPos = contPos + 1;
            } else {
                contNeg = contNeg + 1;
            }

        }

        System.out.println("Números positivos: " + contPos);
        System.out.println("Números negativos: " + contNeg);

    }
}
