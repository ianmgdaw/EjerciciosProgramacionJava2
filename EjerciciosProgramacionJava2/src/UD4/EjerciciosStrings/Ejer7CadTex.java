package UD4.EjerciciosStrings;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer7CadTex.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:46:12
 */
/*
7. Crea un programa que pida al usuario introducir una frase F, una palabra P1 y otra
palabra P2. Luego, mostrará F sustituyendo todas las ocurrencias de P1 por P2.
*/
public class Ejer7CadTex {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe una frase: ");
        String frase = lector.nextLine();

        System.out.print("Escribe una palabra: ");
        String palabra1 = lector.nextLine();
        
        System.out.print("Escribe otra palabra: ");
        String palabra2 = lector.nextLine();
        
        String frase2 = frase.replaceAll(palabra1,palabra2);
        
        System.out.println(frase2);
    }
}
