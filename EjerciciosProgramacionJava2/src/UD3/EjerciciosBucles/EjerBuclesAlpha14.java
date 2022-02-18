/*
 * Proyecto UD3 - Archivo $nameAndExt} - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:52:51
 */

/*14. Escribe un programa que pida 5 números al usuario y luego muestre por pantalla si
 *alguno era múltiplo de 10.
 */
public class EjerBuclesAlpha14 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        boolean mult10 = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Escribe un número: ");
            int num = lector.nextInt();
            if ((num % 10) == 0) {
                mult10 = true;
            }
        }

        if (mult10) {
            System.out.println("Alguno número era múltiplo de 10.");
        } else {
            System.out.println("Ninguno era múltiplo de 10.");
        }

    }
}
