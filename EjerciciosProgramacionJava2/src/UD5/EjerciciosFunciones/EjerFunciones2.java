/*
 * Proyecto UD5 - Archivo EjerFunciones2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 18:48:23
 */
/*
2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor
de edad o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 */
public class EjerFunciones2 {

    public static boolean esMayorEdad(int a) {
        return a >= 18;
    }

    public static void main(String[] args) {
        int a;

        Scanner in = new Scanner(System.in);

        System.out.print("Escribe la edad: ");
        a = in.nextInt();

        if (esMayorEdad(a)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

    }
}
