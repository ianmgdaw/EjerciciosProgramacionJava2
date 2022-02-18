package UD4.EjerciciosStrings;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer5CadTex.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:31:54
 */

/*
5. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me
mima” dirá que hay:
 */
public class Ejer5CadTex {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int letraA = 0, letraE = 0, letraI = 0, letraO = 0, letraU = 0;
        
        System.out.print("Escribe una frase: ");
        String texto = lector.nextLine();
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            
            char letra = texto.charAt(i);
            
            if (letra == 'a') {
                letraA++;
            }
            if (letra == 'e') {
                letraE++;
            }
            if (letra == 'i') {
                letraI++;
            }
            if (letra == 'o') {
                letraO++;
            }
            if (letra == 'u') {
                letraU++;
            }

        }

        System.out.println("Nº de A: " + letraA);
        System.out.println("Nº de E: " + letraE);
        System.out.println("Nº de I: " + letraI);
        System.out.println("Nº de O: " + letraO);
        System.out.println("Nº de U: " + letraU);
    }
}
