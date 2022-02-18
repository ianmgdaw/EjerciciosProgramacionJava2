package UD4.EjerciciosVectores;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer7Vect.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 nov. 2021 23:03:27
 */
/*
7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que
contenga todos los valores desde P hasta Q, y lo muestre por pantalla
*/
public class Ejer7Vect {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int P = lector.nextInt();
        
        System.out.print("Escribe otro número: ");
        int Q = lector.nextInt();
        
        int pos = 0;
        
        
        for (int i = P; i <= Q; i++) {
            pos ++;
        }
        
        System.out.println("Posiciones: " + pos);
        
        int[] vec = new int[pos];

        for (int i = 0; i < N; i++) {
            
        }

        for (int i = 0; i < ; i++) {
            System.out.print(vec[i] + ", ");
        }
        
    }
}
