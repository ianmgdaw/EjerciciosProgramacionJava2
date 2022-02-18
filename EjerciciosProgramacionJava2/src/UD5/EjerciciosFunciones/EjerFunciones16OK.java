/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones16OK.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 13:10:40
 */
/*
16.Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene
con valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array
con valores aleatorios.
 */
public class EjerFunciones16OK {

    public static void rellenaRandom(double[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = Math.random();
        }
    }

    public static void main(String[] args) {
        double vector[];
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce N: ");
        n = in.nextInt();

        vector = new double[n];
        rellenaRandom(vector);

        System.out.println(Arrays.toString(vector));

    }

}
