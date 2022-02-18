/*
 * Proyecto UD3 - Archivo EjerBuclesGamma4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 17:26:10
 */
/*
4.Escribe un programa que pida al usuario un número entero X y muestre todas las 
tablas de multiplicar desde 1 hasta X.
 */
public class EjerBuclesGamma4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = lector.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
            System.out.println("**********");
        }

    }
}
