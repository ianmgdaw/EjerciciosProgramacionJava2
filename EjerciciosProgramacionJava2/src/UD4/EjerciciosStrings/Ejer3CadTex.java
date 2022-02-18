package UD4.EjerciciosStrings;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer3CadTex.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 18:40:22
 */
/*
3. Crea un programa que pida dos cadenas de texto y luego las muestre en orden
alfabético (sin diferenciar entre mayúsculas y minúsculas).
*/

public class Ejer3CadTex {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe una frase: ");
        String s1 = lector.nextLine();
        
        System.out.print("Escribe otra frase: ");
        String s2 = lector.nextLine();
        
        int resultado = s1.compareToIgnoreCase(s2);
        
        if (resultado >= 1) {
            System.out.println(s1 + " > " + s2);
        } else if (resultado == 0) {
            System.out.println(s1 + " = " + s2);
        }
        else 
            System.out.println(s2 + " > " + s1);
        
    }
}
