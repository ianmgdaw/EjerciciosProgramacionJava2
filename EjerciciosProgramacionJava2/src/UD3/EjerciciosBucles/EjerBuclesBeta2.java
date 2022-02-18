/*
 * Proyecto UD3 - Archivo EjerBuclesBeta2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:59:11
 */

/*
* 2.Escribe un programa que calcule y muestre la suma y el producto (multiplicación) de 
* los 10 primeros números naturales.
 */
public class EjerBuclesBeta2 {

    public static void main(String[] args) {
        int suma = 0, prod = 1;

        for (int i = 1; i < 10; i++) {
            suma += i;
            prod *= i;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + prod);
    }
}
