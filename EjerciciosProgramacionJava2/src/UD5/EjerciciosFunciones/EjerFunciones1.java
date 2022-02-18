/*
 * Proyecto UD5 - Archivo EjerFunciones1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 nov. 2021 21:18:58
 */
/*
1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 */
public class EjerFunciones1 {

    public static double multiplicado(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        int a, b;

        Scanner in = new Scanner(System.in);

        System.out.print("Dime un número: ");
        a = in.nextInt();

        System.out.print("Dime un otro número: ");
        b = in.nextInt();

        System.out.println("Resultado: " + multiplicado(a, b));
    }
}
