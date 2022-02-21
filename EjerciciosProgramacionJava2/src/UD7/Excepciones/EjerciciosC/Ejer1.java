/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.Excepciones.EjerciciosC;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 feb. 2022 20:36:33
 */
public class Ejer1 {

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int num;

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Introduce un número positivo: ");
                num = lector.nextInt();
                imprimePositivo(num);
                
                System.out.print("Introduce un número negativo: ");
                num = lector.nextInt();
                imprimeNegativo(num);
                
                
            } catch (InputMismatchException e) {
                System.err.println("Valor introducido incorrecto.");
                lector.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("ERROR: número negativo.");
        }

        System.out.println("El número positivo es: " + p);

    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("ERROR: número positivo.");
        }

        System.out.println("El númeo negativo es: " + n);
    }
}
