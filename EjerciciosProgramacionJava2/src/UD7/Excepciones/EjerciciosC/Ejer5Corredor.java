/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Ejer5Corredor.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.Excepciones.EjerciciosC;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 16:14:49
 */
public class Ejer5Corredor {

    private int energia;

    public Ejer5Corredor(int e) {
        energia = e;
    }

    public int getEnergia() {
        return energia;
    }
        
    public void recargarEnergia(int e) {
        energia += e;
    }
    
    public void correr() throws Ejer5AgotadoException {
        if (energia >= 10) {
            energia -= 10;
            System.out.println("Energia: " + energia);
        } else {
            Ejer5AgotadoException x = new Ejer5AgotadoException("Sin energía... Plof!");
            throw x;
        }
    }
    
    // Main para realizar pruebas y comprobar que la clase Corredor funciona
    public static void main(String[] args) {
        //Creo corredor con una energia de 25
        Ejer5Corredor pepe = new Ejer5Corredor(25);
        System.out.println("Energia: " + pepe.energia);
        //Recargo energia en 5 y muestro por pantalla
        pepe.recargarEnergia(5);
        System.out.println("Energia: " + pepe.energia);
        //Corro hasta que se queda sin energia para comprobar que la excepción salta correctamente
        try {
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
        } catch (Ejer5AgotadoException a) {
            System.err.println(a.getMessage());
        }
    }
    
    
    
}
