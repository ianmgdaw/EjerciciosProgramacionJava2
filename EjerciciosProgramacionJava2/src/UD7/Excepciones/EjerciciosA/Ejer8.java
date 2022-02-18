/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones.EjerciciosA;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 feb. 2022 20:47:01
 */
public class Ejer8 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        try {
                
            System.out.print("Escribe un valor: ");
            int A = lector.nextInt();
            System.out.println("Valor introducido: " + A );
        } catch (InputMismatchException e) { 
            System.out.println("Valor introducido incorrecto");
        }
    }
}
