/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainAsignatura.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios3.Ejer1ArrayAsignatura;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 20 ene. 2022 19:01:32
 */
public class MainAsignatura {

    public static void main(String[] args) {

        //CREAR ARRAY
        Asignatura[] arrayAsignatura = new Asignatura[5];

        //CREAR ASIGNATURAS
        arrayAsignatura[0] = new Asignatura("Matemáticas", 1025, 2);
        arrayAsignatura[1] = new Asignatura("Tecnología", 1028, 2);
        arrayAsignatura[2] = new Asignatura("Informática", 1006, 3);
        arrayAsignatura[3] = new Asignatura("Biología", 1862, 3);
        arrayAsignatura[4] = new Asignatura("Física y Química", 2340, 2);

        //IMPRIMIR ASIGNATURAS
        for (int i = 0; i < arrayAsignatura.length; i++) {
            arrayAsignatura[i].imprime();
        }

    }
}
