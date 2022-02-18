/*
 * Proyecto UD5 - Archivo EjerFunciones3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 18:54:56
 */
/*
3. Escribe un programa que pida dos números enteros por teclado y muestre por pantalla
cual es el mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
 */
public class EjerFunciones3 {

    public static int minimo(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        a = in.nextInt();
        System.out.print("Escribe otro número: ");
        b = in.nextInt();

        System.out.println("El número menor es " + minimo(a, b));

    }
}
