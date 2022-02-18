/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainDNI.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer5ClaseDNI;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 13:43:37
 */
public class MainDNI {

    public static void main(String[] args) {

        DNI dni1 = new DNI();

        dni1.setDNI(52637485);
        dni1.imprime();
        System.out.println("");

        DNI dni2 = new DNI();

        dni2.setDNI(00324417);
        dni2.imprime();
        System.out.println("");

    }

}
