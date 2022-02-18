/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones19ok.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 13:53:24
 */
/*
19.Realiza un programa que permita comprobar si una terna de valores enteros (3 valores)
se ajusta a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los
valores x, y, z. Se deberá crear una función a la que se le pase x, y, z y devuelva si son
iguales o no.
Por ejemplo: 3 ² + 4 ² = 5 ².
*/
public class EjerFunciones19ok {
    public static boolean esPitagorica(int x, int y, int z) {
        return Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2);
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Vamos a comprobar si X² + Y² = Z²");
        System.out.print("Valor X: ");
        int x = teclado.nextInt();
        System.out.print("Valor Y: ");
        int y = teclado.nextInt();
        System.out.print("Valor Z: ");
        int z = teclado.nextInt();
        
        boolean pitagorica = esPitagorica(x, y, z);
        
        if (pitagorica) {
            System.out.println("Sí es pitagórica");
        }
        else {
            System.out.println("No es pitagórica");
        }
    }
}
