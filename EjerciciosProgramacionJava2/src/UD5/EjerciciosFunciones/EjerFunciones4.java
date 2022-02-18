/*
 * Proyecto UD5 - Archivo EjerFunciones4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:02:42
 */
/*
4. Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
*/
public class EjerFunciones4 {
    public static int dimeSigno(int a) {
        if (a > 0) {
            return 1;
        }
        else if (a < 0) {
            return -1;
        }
        else 
            return 0;
    }
    
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Dime un número: ");
        a = in.nextInt();
        
        System.out.println(dimeSigno(a));
    }
}
