/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer1Colores.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6E.EjerciciosArrayList;

import java.util.ArrayList;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 feb. 2022 20:43:27
 */
public class Ejer1Colores {

    public static void main(String[] args) {

        //1. Crear un ArrayList de cadenas de texto
        ArrayList<String> colores = new ArrayList();

        //2. Añadir varios String
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");

        //3. Recorrer el ArrayList y mostrar por pantalla
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(i + ". " + colores.get(i));
        }
        System.out.println("================================");

        //4. Añadir dos colores más al final de la lista (Negro y Cyan).
        colores.add("Negro");
        colores.add("Cyan");

        for (int i = 0; i < colores.size(); i++) {
            System.out.println(i + ". " + colores.get(i));
        }
        System.out.println("================================");

        //5. Añadir dos colores más en la 1ª y 2ª posición (Amarillo y Magenta).
        colores.add(1, "Amarillo");
        colores.add(2, "Magenta");

        for (int i = 0; i < colores.size(); i++) {
            System.out.println(i + ". " + colores.get(i));
        }
        System.out.println("================================");

        //6. Eliminar los colores de la 3ª y 4ª posición (Rojo y Azul).
        colores.remove(3);
        colores.remove(4);

        //7. Volver a mostrar todos los colores por pantalla
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(i + ". " + colores.get(i));
        }
        System.out.println("================================");

    }
}
