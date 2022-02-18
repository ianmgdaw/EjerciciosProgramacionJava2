/*
 * Proyecto EjerciciosProgramacionJava - Archivo EjerFunciones18ok.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.EjerciciosFunciones;
import java.util.Scanner;
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 13:44:38
 */
/*
18.El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número
de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12:
"N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello
se deberá crear una función a la que se le pase el número y devuelva la letra.
Ejemplo: para el DNI 56321122 el NIF es ‘X’.
*/
public class EjerFunciones18ok {
    public static char calculaDNI(int dni) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letra.charAt(dni % 23);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce nº de DNI: ");
        int dni = in.nextInt();
        char letra = calculaDNI(dni);
        System.out.println("La letra del DNI es: " + letra);
    }
}
