package UD4.EjerciciosVectores;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer3Vect.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 nov. 2021 22:21:01
 */
/*
3. Crea un programa que pida diez números reales por teclado, los almacene en un
array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla
*/
public class Ejer3Vect {
    public static void main(String[] args) {
        double[] vec = new double[10];
        
        
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < vec.length; i++) {
            System.out.print("Introduce un número real: ");
            vec[i] = lector.nextInt();
        }
        
        for (int i = 0; i < vec.length; i++) {
            
        }
        
        
    }
}
