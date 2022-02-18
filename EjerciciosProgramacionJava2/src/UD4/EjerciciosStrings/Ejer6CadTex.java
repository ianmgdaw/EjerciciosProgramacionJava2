package UD4.EjerciciosStrings;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer6CadTex.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:06:16
 */
/*
6. Crea un programa que pida al usuario introducir una  frase F  y una palabra P, y
muestre por pantalla:
◦Si F contiene P.
◦Si F empieza por P.
◦Si F termina por P.
 */
public class Ejer6CadTex {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = lector.nextLine();

        System.out.print("Escribe una palabra: ");
        String palabra = lector.nextLine();

        int contieneP = frase.indexOf(palabra);
        boolean empiezaP = frase.startsWith(palabra);
        boolean terminaP = frase.endsWith(palabra);
        
        if (contieneP != -1) {
            System.out.println("'" + frase + "' contiene " + palabra);
        }
        if (empiezaP) {
            System.out.println("'" + frase + "' empieza por " + palabra);
        }
        if (terminaP) {
            System.out.println("'" + frase + "' termina por " + palabra);
        }
        
    }

}