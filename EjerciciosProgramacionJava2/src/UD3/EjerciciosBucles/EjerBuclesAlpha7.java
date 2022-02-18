/*
 * 7. Escribe un programa que muestre por pantalla la suma de todos los números desde A
 * hasta B (valores que se le piden al usuario).
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;


/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha7 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int total = 0, a, b;     
        
        System.out.print("Escribe un número: ");
        a = lector.nextInt();

        System.out.print("Escribe otro número: ");
        b = lector.nextInt();
        
        for (int i = a; i < b; i++) {
            total = total + i;
            System.out.println(total);
        }
        
    }
}
