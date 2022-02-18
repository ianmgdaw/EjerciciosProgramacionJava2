/*
 8. Escribe un programa que muestre por pantalla la multiplicación de todos los números
desde 1 hasta 10.
 */
package UD3.EjerciciosBucles;

/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha8 {
    public static void main(String[] args) {
        int mult = 1;
        for (int i = 1; i < 10; i++) {
            mult = mult * i;
            System.out.println(mult);
        }
    }
}
