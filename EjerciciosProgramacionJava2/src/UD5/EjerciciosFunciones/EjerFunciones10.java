/*
 * Proyecto UD5 - Archivo EjerFunciones10.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:34:00
 */
/*
10.Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y
nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días.
Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no.
*/
public class EjerFunciones10 {
    public static boolean testFecha(int dia, int mes, int año) {
        if (dia < 1 || dia > 30) {
           return false;
        }
        else if (mes < 1 || mes > 12) {
            return false;
        }
        else
            return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, año;
        
        System.out.print("Escribe día: ");
        dia = in.nextInt();
        System.out.print("Escribe mes: ");
        mes = in.nextInt();
        System.out.print("Escribe año: ");
        año = in.nextInt();
        
        if (testFecha(dia,mes,año)) {
            System.out.println("La fecha es correcta.");
        }
        else
            System.out.println("La fecha no es correcta.");
    }
    
}
