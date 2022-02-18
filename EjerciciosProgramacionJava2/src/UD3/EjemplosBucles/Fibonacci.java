package UD3.EjemplosBucles;

/**
 *
 * @author a044774858e
 */
public class Fibonacci {
    public static void main(String[] args) {

        // inicializo con los primeros valores de fibonacci
        int actual, ant1 = 1, ant2 = 1;

        // muestro los dos primeros valores de fibonacci
        System.out.println(ant1);
        System.out.println(ant2);

        // calculo y muestro del 3º al 10 de fibonacci
        for (int i = 3; i <= 10; i++) {
        
            // calculo valor i de fibonacci y lo muestro
            actual = ant1 + ant2;
            System.out.println(actual);

            //me guardo el anterior, y el anterior del anterior
            //que usaré en la siguiente iteración
            ant2 = ant1;
            ant1 = actual;

        }
    }
}
