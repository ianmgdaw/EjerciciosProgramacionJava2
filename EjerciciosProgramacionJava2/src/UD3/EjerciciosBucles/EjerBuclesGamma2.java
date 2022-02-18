/*
 * Proyecto UD3 - Archivo EjerBuclesGamma2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3.EjerciciosBucles;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:45:51
 */
/*
2.Escribe un programa que muestre por pantalla 9 líneas de texto con 10 números cada
una. La primera línea tendrá el 1 diez veces, la siguiente el 2 diez veces, la siguiente 
el 3 diez veces... hasta la última línea que tendrá el 9 diez veces.
*/
public class EjerBuclesGamma2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
