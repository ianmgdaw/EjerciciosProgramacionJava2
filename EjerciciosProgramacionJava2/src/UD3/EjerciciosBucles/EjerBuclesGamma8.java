/*
 * Proyecto UD3 - Archivo EjerBuclesGamma8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3.EjerciciosBucles;


import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 20:35:25
 */

/*
9.Escribe un programa que pida al usuario un número entero X y luego muestre por 
pantalla un triángulo de asteriscos como en el ejemplo de abajo. Para X = 5:
    * 
   **
  ***  
 ****
*****
*/
public class EjerBuclesGamma8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int a = lector.nextInt();
        
        // Para cada fila i
        for (int i = 1; i <= a; i++) {
            
            // ¿Cuantos espacios hay que mostrar en la fila i?
            int espacios = a - i;
            
            // Mostrar espacios
            for (int j = 1; j <= espacios ; j++) {
                System.out.print(" ");
            }
            
            // Mostrar asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
