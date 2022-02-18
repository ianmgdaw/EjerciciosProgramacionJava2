/*
 * Proyecto UD5 - Archivo EjerFunciones5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:07:55
 */
/*
5. Escribe   un   programa   que   pida   un   valor   entero   en   millas   y   muestre   su   equivalente   en
kilómetros.   Recuerda   que   una   milla   son   1,60934   kilómetros.   Implementa   y   utiliza   la
función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
*/
public class EjerFunciones5 {
    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }
    
    public static void main(String[] args) {
        int millas;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Escribe millas: ");
        millas = in.nextInt();
        
        System.out.println(millas_a_kilometros(millas)+ " KM");
    }
    
}
