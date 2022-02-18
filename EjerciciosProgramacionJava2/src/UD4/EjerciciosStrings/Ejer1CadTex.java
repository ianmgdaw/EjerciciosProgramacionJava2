package UD4.EjerciciosStrings;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer1CadTex.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 18:22:08
 */
/* 
1. Crea un programa que pida una cadena de texto y luego la muestre tanto en
mayúsculas como en minúsculas.
 */
public class Ejer1CadTex {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String s = lector.nextLine();

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

    }
}
