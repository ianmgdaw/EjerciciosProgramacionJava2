/*
 * Proyecto UD5 - Archivo EjerFunciones7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD5.EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:32:43
 */
/*
7. Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
área y su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área
*/
public class EjerFunciones7 {
    public static double perimetroRectangulo(double ancho, double alto) {
        return (ancho*2)+(alto*2);
    }
    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }
    
    public static void main(String[] args) {
        double ancho, alto;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Escribe el ancho: ");
        ancho = in.nextDouble();
        System.out.print("Escribe el alto: ");
        alto = in.nextDouble();
        
        System.out.println("El perímetro: " + perimetroRectangulo(ancho,alto));
        System.out.println("El área: " + areaRectangulo(ancho,alto));
    }
}
