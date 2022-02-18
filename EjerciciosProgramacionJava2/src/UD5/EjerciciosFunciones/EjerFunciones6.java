/*
 * Proyecto UD5 - Archivo EjerFunciones6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:15:44
 */
/*
6. Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
*/
public class EjerFunciones6 {
    public static double precioConIVA(double precio) {
        return precio * 1.21;
    }
    
    public static void main(String[] args) {
        double[] precios = new double [5];
        
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Escribe el precio sin IVA: ");
            precios[i] = in.nextDouble(); 
        }
        for (int i = 0; i < precios.length; i++) {
            System.out.println("El precio " + precios[i] + "€ con IVA: " + precioConIVA(precios[i]) + "€.");
        }
        
    }
}
