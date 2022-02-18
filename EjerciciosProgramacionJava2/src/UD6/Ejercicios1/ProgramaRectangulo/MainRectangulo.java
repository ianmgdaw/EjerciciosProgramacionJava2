/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainRectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios1.ProgramaRectangulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:18:11
 */
public class MainRectangulo {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(0,0,5,5);

        //r1.imprimir();
        //r1.setX1Y1(2,3);
        //r1.setX2Y2(5,10);
        
        r1.imprimir();
        
        r1.setAll(0,0,5,4);
        
        r1.imprimir();

    }
}
