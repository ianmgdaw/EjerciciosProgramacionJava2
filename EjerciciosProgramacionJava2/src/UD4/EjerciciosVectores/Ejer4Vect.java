package UD4.EjerciciosVectores;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer4Vect.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 nov. 2021 22:27:09
 */
/*
4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
array   y   luego   muestre   por   separado   la   suma   de   todos   los   valores   positivos   y
negativos.
*/
public class Ejer4Vect {
    public static void main(String[] args) {
        int[] vec = new int[20];
        int sumaPos = 0;
        int sumaNeg = 0;

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce un número real: ");
            vec[i] = lector.nextInt();
            if (vec[i] < 0) {
                sumaNeg += vec[i];
            }
            if (vec[i] >= 0) {
                sumaPos += vec[i];
            }
        }
        
        System.out.println("La suma de los números positivos: " + sumaPos);
        System.out.println("La suma de los números negativos: " + sumaNeg);
    }
}
