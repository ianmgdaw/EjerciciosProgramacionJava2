package UD4.EjerciciosVectores;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer5Vect.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 nov. 2021 22:45:50
 */
/*
5. Crea un programa que pida veinte números reales por teclado, los almacene en un
array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
valores.
 */
public class Ejer5Vect {

    public static void main(String[] args) {
        int[] vec = new int[20];
        int suma = 0;
        double media;

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce un número real: ");
            vec[i] = lector.nextInt();
            suma += vec[i];
        }
        media = suma / 20;
        System.out.println("La media es: " + media);
    }
}
