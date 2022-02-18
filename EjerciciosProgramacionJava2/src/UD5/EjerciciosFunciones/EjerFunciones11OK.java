/*
 * Proyecto UD5 - Archivo EjerFunciones11OK.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 22 nov. 2021 13:31:57
 */
/*
11.Realiza   un   programa   que   escriba   la   tabla   de   multiplicar   de   un   número   introducido   por
teclado. Para ello implementa una función que reciba como parámetro un número entero
y muestre por pantalla la tabla de multiplicar de dicho número.
*/
public class EjerFunciones11OK {
    public static void tabla_multiplicar(int num) {
        System.out.println("Tabla de multiplicar del " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.print("Escribe el número: ");
        num = in.nextInt();
        tabla_multiplicar(num);
    }
}
