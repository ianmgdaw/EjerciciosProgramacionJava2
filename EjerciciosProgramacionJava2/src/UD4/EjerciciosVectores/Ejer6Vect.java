package UD4.EjerciciosVectores;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer6Vect.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 nov. 2021 22:53:34
 */
/*
. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
N, escriba M en todas sus posiciones y lo muestre por pantalla.
 */
public class Ejer6Vect {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce la longitud del vector: ");
        int N = lector.nextInt();

        int[] vec = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Introduce un número: ");
            vec[i] = lector.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(vec[i] + ", ");
        }
    }
}
