/*
 * Proyecto UD3 - Archivo EjerBuclesGamma9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 21:11:47
 */

/*
10. Escribe un programa que pida al usuario un número entero A y luego muestre por 
pantalla una pirámide de astericos de A alturas. Por ejemplo, para A = 5:
*/
public class EjerBuclesGamma9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int a = lector.nextInt();
        
        for (int i = 1; i <= a; i++) {
            
            for (int j = 1; j < i; j+=2) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        
    }
}
