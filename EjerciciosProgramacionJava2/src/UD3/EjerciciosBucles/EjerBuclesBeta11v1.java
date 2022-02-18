/*
 * Proyecto UD3 - Archivo EjerBuclesBeta11v1.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 13:45:59
 */

/*
11. Escribe un programa que dada una cantidad de euros que el usuario introduce por 
teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para 
alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que 
indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el 
programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete 
de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el 
mínimo número de billetes posible).
 */
public class EjerBuclesBeta11v1 {

    public static void main(String[] args) {
        // Variables
        int euros;
        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos X
        System.out.print("Dime euros: ");
        euros = in.nextInt();

        // ¿Billetes de 500?
        while (euros >= 500) {
            euros -= 500;
            b500++;
        }

        // ¿Billetes de 200?
        while (euros >= 200) {
            euros -= 200;
            b200++;
        }

        // ¿Billetes de 100?
        while (euros >= 100) {
            euros -= 100;
            b100++;
        }

        // ¿Billetes de 50?
        while (euros >= 50) {
            euros -= 50;
            b50++;
        }

        // ¿Billetes de 20?
        while (euros >= 20) {
            euros -= 20;
            b20++;
        }

        // ¿Billetes de 10?
        while (euros >= 10) {
            euros -= 10;
            b10++;
        }

        // ¿Billetes de 5?
        while (euros >= 5) {
            euros -= 5;
            b5++;
        }

        // Mostramos billetes necesarios
        System.out.println("Para " + euros + " euros es necesario:");
        System.out.println("Billetes de 500: " + b500);
        System.out.println("Billetes de 200: " + b200);
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 50 : " + b50);
        System.out.println("Billetes de 20 : " + b20);
        System.out.println("Billetes de 10 : " + b10);
        System.out.println("Billetes de 5  : " + b5);
    }
}
