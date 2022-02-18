/*
 * 10. Escribe un programa que pida 5 precios al usuario y muestre la suma total.
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author a044774858e
 */
public class EjerBuclesAlpha10 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int total = 0, precio;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Escribe un precio: ");
            precio = lector.nextInt();
            total = total + precio;
        }

        System.out.println("Precio total: " + total);

    }
}
