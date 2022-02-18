/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainClaseAsignatura.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer1ClaseAsignatura;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 ene. 2022 16:45:13
 */
public class MainClaseAsignatura {

    public static void main(String[] args) {
        Asignatura valenciano = new Asignatura("Valenciano", 1023, 3);
        Asignatura matematicas = new Asignatura("Matemáticas", 1020, 3);
        Asignatura informatica = new Asignatura("Tecnología", 1029, 2);

        valenciano.imprimir();
        matematicas.imprimir();
        informatica.imprimir();

    }
}
