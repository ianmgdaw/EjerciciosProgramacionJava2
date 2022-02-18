/*
 * Proyecto UD3 - Archivo EjerBuclesGamma5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 17:35:35
 */

/*
5.Haz una copia del programa del ejercicio anterior y modifícalo para mostrar al final la 
suma de todas las multiplicaciones de las tablas de multiplicar. Por ejemplo, para X=1 
la suma es 55, para X=2 la suma es 165 y para X=3 la suma es 330.
 */
public class EjerBuclesGamma5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = lector.nextInt();
        int suma = 0;
        int mult;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                mult = i * j;
                System.out.println(i + " x " + j + " = " + mult);
                suma += mult;
            }
            System.out.println();
            System.out.println("Suma: " + suma);
            System.out.println("**********");
        }
    }
}
