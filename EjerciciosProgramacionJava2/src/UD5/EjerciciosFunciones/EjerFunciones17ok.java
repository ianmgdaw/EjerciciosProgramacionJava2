/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones17ok.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 13:30:12
 */
/*
17.Realiza   un   programa   que   nos   pida   números   enteros   hasta   que   se   introduzca   el   0,
diciéndonos, para  cada número  introducido si es primo  o no. Hay que recordar que un
número es primo si es divisible por si mismo y por 1. El 1 no es primo por convenio. Se
debe crear una función que pasándole un número entero devuelva si es primo o no.
 */
public class EjerFunciones17ok {

    public static boolean esPrimo(int n) {
        //Si es 1, 0 o negativo => NO ES PRIMO
        if (n <= 1) {
            return false;
        }
        //desde 2 hasta < n/2
        for (int i = 2; i <= n / 2; i++) {
            //Si n es divisible por i => NO ES PRIMO
            if (n % i == 0) {
                return false;
            }
        }
        //Si la función llega hasta aquí es porque n> y en el for no se ha encontrado
        // un nº divisible => SÍ ES PRIMO
        return true;
    }

    public static void main(String[] args) {
        int numero;
        boolean primo;

        Scanner in = new Scanner(System.in);

        //Bucle infinito
        while (true) {
            //Pedimos numero
            System.out.print("Introduce un número (0 para terminar): ");
            numero = in.nextInt();

            //Si es cero terminamos el bucle (si no, continuamos)
            if (numero == 0) {
                break;
            }

            //Calculamos si es primo
            primo = esPrimo(numero);

            //Mostramos mensaje
            if (primo) {
                System.out.println("Es primo.");
            } else {
                System.out.println("No es primo.");
            }
        }

    }

}
