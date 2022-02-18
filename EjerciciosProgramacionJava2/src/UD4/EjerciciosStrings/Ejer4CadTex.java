package UD4.EjerciciosStrings;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo Ejer4CadTex.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:08:50
 */
/*
4. Crea   un   programa   que   pida   por  teclado   tres  cadenas  de   texto:  nombre   y  dos
apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
 */
public class Ejer4CadTex {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String s1 = lector.nextLine();

        System.out.print("Escribe tu 1º apellido: ");
        String s2 = lector.nextLine();

        System.out.print("Escribe tu 2º apellido: ");
        String s3 = lector.nextLine();

        String cad1 = s1.substring(0, 3);
        String cad2 = s2.substring(0, 3);
        String cad3 = s3.substring(0, 3);

        String mayus = cad1.toUpperCase() + cad2.toUpperCase() + cad3.toUpperCase();

        System.out.println(mayus);
    }
}
