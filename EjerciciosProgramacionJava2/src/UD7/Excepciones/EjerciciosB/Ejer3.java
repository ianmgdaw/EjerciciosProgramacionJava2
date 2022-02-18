/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones.EjerciciosB;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 feb. 2022 18:55:21
 */
public class Ejer3 {
    public static void main(String[] args) {
        double[] v = new double[15];
        try {
            acceso(v, 16);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static double acceso(double[] v, int j) throws Exception {
        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new Exception("El indice " + j + " no existe en el vector");
            }
        } catch (Exception exc) {
            throw exc;
        }
    }
}
