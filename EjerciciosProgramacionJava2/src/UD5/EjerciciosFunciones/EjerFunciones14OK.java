/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones14OK.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 12:31:26
 */
/*14.Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá
recibir   dos   parámetros:   el   carácter   que   se   desea   imprimir   y   el   número   de   líneas   del
triángulo.
*/
public class EjerFunciones14OK {
    public static void imprimirtriangulo(char a, int linea) {
        //para cada linea
        for (int i = 1; i <= linea; i++) {

            // Imprimimos espacios
            for (int j = i - 1; j < linea - 1; j++) {
                System.out.print(" ");
            }

            // Imprimimos el char pasado como argumento
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(a);
            }

            // Nueva línea
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int lineas;
        char car;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el caracter: ");
        car = in.next().charAt(0);
        System.out.print("Introduce el número de lineas: ");
        lineas = in.nextInt();
        
        imprimirtriangulo(car, lineas);
        
        System.out.println();
    }
}
