/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones.EjerciciosB;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 feb. 2022 18:58:03
 */
public class Ejer4 {
    public static void main(String[] args) {
        double[] v = new double[15];
        acceso(v, 16);
    }

    public static double acceso(double[] v, int j) throws Exception {
        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j
                        + " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}
