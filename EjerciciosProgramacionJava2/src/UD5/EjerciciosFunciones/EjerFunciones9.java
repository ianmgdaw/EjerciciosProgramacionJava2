/*
 * Proyecto UD5 - Archivo EjerFunciones9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:22:38
 */
/*
9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
más  elevado.   Impleméntalo   creando   únicamente   una   función   a   la   que   le   pasemos   dos
valores (no tres) y nos devuelva el máximo de los dos valores.
*/
public class EjerFunciones9 {
    public static int numMax(int n1, int n2, int n3) {
        int maximo = Math.max(n1, n2);
        return Math.max(maximo, n3);
    }
    
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        n1 = in.nextInt();
        System.out.print("Escribe otro número: ");
        n2 = in.nextInt();
        System.out.print("Escribe otro número: ");
        n3 = in.nextInt();

        System.out.println("El número mayor es " + numMax(n1, n2, n3));
    }
}
