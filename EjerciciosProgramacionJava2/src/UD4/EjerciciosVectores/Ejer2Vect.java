package UD4.EjerciciosVectores;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer2Vect.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 nov. 2021 22:16:05
 */
/*
2. Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego muestre la suma de todos los valores.
 */
public class Ejer2Vect {

    public static void main(String[] args) {
        int[] vec = new int[10];
        int suma = 0;

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número real: ");
            vec[i] = lector.nextInt();
            suma += vec[i];
        }

        System.out.println("La suma es: " + suma);
    }
}
