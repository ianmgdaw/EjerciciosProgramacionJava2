/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainCuentaCorriente.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer3ClaseCuentaCorriente;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 ene. 2022 19:24:07
 */
public class MainCuentaCorriente {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("ES4885694712", 500.50);
        CuentaCorriente cuenta2 = new CuentaCorriente("ES9625001417", 1000);

        cuenta1.imprimir();
        cuenta2.imprimir();

        cuenta1.ingresar(200.50);
        cuenta2.retirar(1000.00);

        cuenta1.imprimir();
        cuenta2.imprimir();

    }
}
