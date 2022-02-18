/*
 * Proyecto UD3 - Archivo EjerBuclesBeta3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:06:13
 */

/*
    3.Escribe un programa que lea una secuencia de números hasta que se introduzca un 
    0, y luego muestre cuantos eran positivos y cuantos negativos.
 */
public class EjerBuclesBeta3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int contPos = 0, contNeg = 0, num;

        do {
            System.out.print("Dime un numero: ");
            num = lector.nextInt();

            if (num > 0) {
                contPos++;
            } else if (num < 0) {
                contNeg++;
            }

        } while (num != 0);

        System.out.println("Números positivos: " + contPos);
        System.out.println("Números negativos: " + contNeg);
    }
}
