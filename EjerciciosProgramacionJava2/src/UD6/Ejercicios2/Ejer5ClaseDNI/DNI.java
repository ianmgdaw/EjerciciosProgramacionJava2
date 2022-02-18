/*
 * Proyecto EjerciciosProgramacionJava - Archivo DNI.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer5ClaseDNI;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 13:43:26
 */
public class DNI {

    private int dni;

    //SETTERS
    public void setDNI(int dni) {
        this.dni = dni;
    }

    //GETTERS
    public int getDNI() {
        return dni;
    }

    public char getLetra() {
        char[] letra = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letra[dni % 23];
    }

    public String getNIF() {
        return Integer.toString(getDNI()) + getLetra();
    }

    //METODOS
    public void imprime() {
        System.out.println(getNIF());
    }

}
