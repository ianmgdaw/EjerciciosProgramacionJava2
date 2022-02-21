/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Ejer3Main.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.Excepciones.EjerciciosC;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 13:33:27
 */
public class Ejer3Main {

    public static void main(String[] args) {

        try {
            //Creamos varios objetos de tipo Gato
            Ejer3Gato g1 = new Ejer3Gato("Tito", 6);
            Ejer3Gato g2 = new Ejer3Gato("Susi", 3);
            Ejer3Gato g3 = new Ejer3Gato("Bruna", 2);

            //Mostramos datos de los gatos
            System.out.println("GATOS:");
            g1.imprimir();
            g2.imprimir();
            g3.imprimir();

            //Modificamos sus datos
            g1.setNombre("Titito");
            g1.setEdad(10);
            g2.setNombre("Su");
            g3.setEdad(-5);

            //Mostramos datos de los gatos
            System.out.println("GATOS:");
            g1.imprimir();
            g2.imprimir();
            g3.imprimir();
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
        System.out.println("Fin de programa");

    }

}
