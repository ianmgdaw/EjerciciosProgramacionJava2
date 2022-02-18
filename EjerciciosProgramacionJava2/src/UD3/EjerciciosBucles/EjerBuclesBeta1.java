/*
 * Proyecto UD3 - Archivo EjerBuclesBeta1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:51:00
 */

/*
 * 1.Escribe un programa que muestre la tabla de multiplicar del número que indique el 
 * usuario.
 */
public class EjerBuclesBeta1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Dime un numero para multiplicar: ");
        int num = lector.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + num + " = " + i * num);
        }

    }
}
