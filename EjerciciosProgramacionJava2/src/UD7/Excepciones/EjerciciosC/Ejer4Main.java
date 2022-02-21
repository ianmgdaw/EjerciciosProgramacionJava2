/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Ejer3Main.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.Excepciones.EjerciciosC;

import java.util.*;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 13:33:27
 */
public class Ejer4Main {

    public static void main(String[] args) {

        //Creamos el ArrayList de tipo Gato
        ArrayList<Ejer4Gato> listaGatos = new ArrayList();
        Scanner lector = new Scanner(System.in);
        
        String nombre = "";
        int edad = 0;
        
        do {
            try {
                //Pedimos por teclado el nombre y la edad del gato
                System.out.println("Introduce los datos del gato " + listaGatos.size());
                System.out.print("Nombre: ");
                nombre = lector.nextLine();
                System.out.print("Edad: ");
                edad = lector.nextInt();
                lector.nextLine();
                
                //Creamos el objeto Gato
                Ejer4Gato g = new Ejer4Gato(nombre, edad);
                
                //Añadimos el objeto Gato al ArrayList
                listaGatos.add(g);
                
            } catch (Exception e) {
                System.err.println(e);
            }
        } while (listaGatos.size() < 5);
        
        //Imprime por pantalla la información de todos los gatos de la lista
        for (int i = 0; i < listaGatos.size(); i++) {
            System.out.println("Gato " + i + ": ");
            listaGatos.get(i).imprimir();
        }

    }

}
