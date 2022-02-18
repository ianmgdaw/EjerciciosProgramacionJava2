/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainPersona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios1.ProgramaPersona;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:13:41
 */
public class MainPersona {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String n, a, d;
        int e;

        System.out.println("Persona 1");
        System.out.print("Nombre: ");
        n = lector.nextLine();
        System.out.print("Apellidos: ");
        a = lector.nextLine();
        System.out.print("Edad: ");
        e = lector.nextInt();
        lector.nextLine();
        System.out.print("DNI: ");
        d = lector.nextLine();

        Persona p1 = new Persona(d, n, a, e);

        p1.imprime();
        System.out.println("Mayor de edad: " + p1.esMayorEdad());
        System.out.println("Jubilado: " + p1.esJubilado());
        

    }
}
