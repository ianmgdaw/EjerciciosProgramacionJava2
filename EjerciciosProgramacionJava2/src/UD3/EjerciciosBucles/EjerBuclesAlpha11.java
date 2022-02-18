/*
 *11. Escribe   un   programa   que   pida   precios   al   usuario   hasta   que
introduza   un   número negativo, y muestre la suma total.
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha11 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int total = 0, precio;

        do {
            System.out.print("Escribe un precio: ");
            precio = lector.nextInt();
            if (precio >= 0) {
                total = total + precio;
            }

        } while (precio >= 0);

        System.out.println("Precio total: " + total);

    }
}
