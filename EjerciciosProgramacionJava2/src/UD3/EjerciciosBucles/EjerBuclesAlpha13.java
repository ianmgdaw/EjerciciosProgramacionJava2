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
 * @date 25 oct. 2021 19:37:39
 */

/* 13. Escribe un programa que muestre los números pares entre A y B (valores que se le
* piden al usuario).
*/
public class EjerBuclesAlpha13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int num1, num2;

        System.out.print("Escribe un número: ");
        num1 = lector.nextInt();

        System.out.print("Escribe otro número: ");
        num2 = lector.nextInt();

        for (int i = num1; i <= num2; i++) {
            if ((i%2) == 0) {
                System.out.println(i);
            }
            
        }
        
    }
}
