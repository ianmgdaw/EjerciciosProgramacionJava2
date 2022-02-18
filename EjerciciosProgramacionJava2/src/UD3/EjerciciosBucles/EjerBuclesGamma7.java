/*
 * Proyecto UD3 - Archivo EjerBuclesGamma6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 17:44:48
 */

/*
7.Escribe un programa que muestre por pantalla todas los horas, minutos y segundos 
de un día desde 0:0:0 hasta 23:59:59.
 */
public class EjerBuclesGamma7 {

    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    System.out.println(i + ":" + j + ":" + k);

                }
            }
            System.out.println("");
        }
    }
}
