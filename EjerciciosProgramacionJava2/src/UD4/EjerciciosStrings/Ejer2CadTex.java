package UD4.EjerciciosStrings;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer2CadTex.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 18:34:04
 */

/*
2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
iguales o no, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
*/

public class Ejer2CadTex {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe una frase: ");
        String s1 = lector.nextLine();
        
        System.out.print("Escribe otra frase: ");
        String s2 = lector.nextLine();
        
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
    }
}
