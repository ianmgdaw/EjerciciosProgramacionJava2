/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Ejer5Entrenamiento.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.Excepciones.EjerciciosC;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 16:15:06
 */
public class Ejer5Entrenamiento {
    // Hace correr al corredor sin parar hasta que se agote
    public static void agotar(Ejer5Corredor c) {
        try {
            while (true)
                c.correr();
        } catch (Ejer5AgotadoException a) {
            System.out.println(a.getMessage());
        }

    }

    public static void main(String[] args) {
        Ejer5Corredor paco = new Ejer5Corredor(50);
        agotar(paco);
        paco.recargarEnergia(30);
        agotar(paco);
        paco.recargarEnergia(10);
        agotar(paco);
        System.out.println("Entrenamiento terminado");
    }
}
