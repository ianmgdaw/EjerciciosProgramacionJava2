package UD4.EjerciciosVectores;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer7VectOK.java - Companía DAW
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
public class Ejer7VectOK {
    public static void main(String[] args) {
        //VARIABLES
        int p, q, cuantos;
        int [] numeros;
        
        // CREAMOS SCANNER
        Scanner lector = new Scanner(System.in);
        
        //PEDIMOS P Y Q
        System.out.println("Dime P: ");
        p = lector.nextInt();
        System.out.println("Dime Q: ");
        q = lector.nextInt();
        
        // Calculamos cuantos valores hay desde P hasta Q
        cuantos = q - p + 1;
        
        // Creamos el array de tamaño 'cuantos'
        numeros = new int[cuantos];
        
        // Insertamos los valores desde P hasta Q
        for (int i = 0; i < cuantos; i++) {
            numeros[i] = p + i;
        }
        
        // Mostramos los numeros
        for (int i = 0; i < cuantos; i++) {
            System.out.println("Numero " + i + ": " + numeros[i]);
        }
    }
}
