/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainReloj.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer4ClaseReloj;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 13:43:10
 */
public class MainReloj {

    public static void main(String[] args) {

        Reloj r0 = new Reloj(0, 0, 0);

        System.out.println("Reloj 0");
        r0.imprimeHora();
        r0.imprimeHora12();
        System.out.println("");

        Reloj r1 = new Reloj(10, 30, 15);

        System.out.println("Reloj 1");
        r1.imprimeHora();
        r1.imprimeHora12();
        r1.tick();
        r1.imprimeHora();
        r1.imprimeHora12();
        System.out.println("");

        Reloj r2 = new Reloj(10, 59, 59);

        System.out.println("Reloj 2");
        r2.imprimeHora();
        r2.imprimeHora12();
        r2.tick();
        r2.imprimeHora();
        r2.imprimeHora12();
        System.out.println("");

        Reloj r3 = new Reloj(23, 59, 59);

        System.out.println("Reloj 3");
        r3.imprimeHora();
        r3.imprimeHora12();
        r3.tick();
        r3.imprimeHora();
        r3.imprimeHora12();
        System.out.println("");

    }
}
