/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones12OK.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 11:23:13
 */
/*
12.Realiza   un   programa   que   dado   un   valor   en   kilómetros   nos   lo   traduce   a   millas.   El
programa debe tener una función que reciba como parámetro una cantidad en kilómetros
y nos la devuelva en millas.
*/
public class EjerFunciones12OK {
    public static double kilometros_a_millas(double km) {
        return (km/1.60934);
    }
    
    public static void main(String[] args) {
        double millas, km;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        millas = in.nextDouble();
        
        km = kilometros_a_millas(millas);
        
        System.out.println("Kilómetros: " + km);
    }
}
