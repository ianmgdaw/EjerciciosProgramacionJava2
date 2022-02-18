/*
 * Proyecto UD3 - Archivo EjerBuclesGamma1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;


/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:39:01
 */

/*
1.Escribe un programa que muestre por pantalla 9 líneas de texto con 10 números cada
una. En cada línea se mostrarán los números del 0 al 9.
 */
public class EjerBuclesGamma1 {

    public static void main(String[] args) {
        
        // Para cada fila i (de 0 a 9)
        for (int i = 0; i < 10; i++) {
            
            // Mostrar j (de 0 a 9)
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
