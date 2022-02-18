/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones20ok.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 13:57:20
 */
/*
20.Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una
función que reciba un número entero como parámetro e imprima su tabla de multiplicar.
*/
public class EjerFunciones20ok {
    public static void tabla_multiplicar(int n) {
        System.out.println("Tabla de multiplicar del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            tabla_multiplicar(i);
        }
    }
}
