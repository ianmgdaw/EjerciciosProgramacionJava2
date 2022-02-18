/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones15OK.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 12:53:26
 */
/*
15.Escribe  un  programa  que  cree  un array  de  tamaño  100 con  los primeros  100  números
naturales. Luego muestra la suma total y la media. Implementa una función que calcule la
suma de un array y otra que calcule la media de un array.
*/
public class EjerFunciones15OK {
    public static int suma_vector(int[] v) {
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma;
    }
    public static double media_vector (int[] v) {
        return (double)suma_vector(v) / (double)v.length;
    }
    
    public static void main(String[] args) {
        int array[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println("Suma: " + suma_vector(array));
        System.out.println("Media: " + media_vector(array));
    }
}
