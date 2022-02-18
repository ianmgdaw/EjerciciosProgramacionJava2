/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones13OK.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 12:14:45
 */
/*
13.Realiza   un   programa   que   calcule   el   porcentaje   de   descuento   que   nos   han   hecho   al
comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento
aplicado. Se debe crear una función a la que le pasemos ambos valores y nos devuelva
el descuento.
*/
public class EjerFunciones13OK {
    public static double descuento(double precioSinDescuento,double precioConDescuento) {
        return 100 * (1.0 - (precioConDescuento / precioSinDescuento));
    }
    
    public static void main(String[] args) {
        double precioSinDescuento, precioConDescuento, porc_dto;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Precio original: ");
        precioSinDescuento = in.nextDouble();
        System.out.print("Precio tras descuento: ");
        precioConDescuento = in.nextDouble();
        
        porc_dto = descuento(precioSinDescuento, precioConDescuento);
        
        System.out.printf("Descuento : %.2f%%", porc_dto);
    }
}
