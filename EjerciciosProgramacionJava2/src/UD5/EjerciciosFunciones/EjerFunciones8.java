/*
 * Proyecto UD5 - Archivo EjerFunciones8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:44:14
 */
/*
8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N,
el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las
funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 */
public class EjerFunciones8 {

    public static int suma1aN(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static int producto1aN(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static double intermedio1aN(int n) {
        double total = ((n+1) / 2.0);
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Escribe N: ");
        n = in.nextInt();

        System.out.println("La suma de enteros de 1 a " + n + ": " + suma1aN(n));
        System.out.println("El producto de enteros de 1 a " + n + ": " + producto1aN(n));
        System.out.println("El valor intermedio entre 1 a " + n + ": " + intermedio1aN(n));

    }

}
