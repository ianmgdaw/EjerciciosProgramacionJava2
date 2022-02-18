/*
 * Proyecto UD3 - Archivo EjerBuclesBeta6.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 13:16:54
 */

/*
6.Escribe un programa que calcule y muestre el valor de A elevado a B (valores que 
introduce el usuario) sin hacer uso de la clase Math. Es decir, mediante un bucle que 
paso a paso multiplica A tantas veces como B.
*/

public class EjerBuclesBeta6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, mult=1;
        
        System.out.println("Dime un número: ");
        num1 = lector.nextInt();

        System.out.println("Dime otro número: ");
        num2 = lector.nextInt();
        
        for (int i = 1; i <= num2; i++) {
            mult *= num1;
        }
        
        System.out.println(num1 + "^" + num2 + " = " + mult);
        
    }
}
