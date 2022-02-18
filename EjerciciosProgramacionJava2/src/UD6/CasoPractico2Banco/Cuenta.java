/*
 * Proyecto EjerciciosProgramacionJava - Archivo Cuenta.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.CasoPractico2Banco;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 31 ene. 2022 16:36:38
 */
public class Cuenta {

    //ATRIBUTOS
    private String titular;
    private double saldo;

    //CONSTRUCTOR
    public Cuenta(String titular, double saldo) {
        if (saldo >= 0) {
            this.titular = titular;
            this.saldo = saldo;
        } else {
            System.err.println("ERROR: No se puede crear una cuenta con saldo negativo.");
        }
    }

    //GETTERS/SETTERS
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //MÉTODOS
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.err.println("ERROR: No se puede crear una cuenta con cantidad negativa.");
        }
    }

    public void retirarDinero(double cantidad) {
        if ((saldo + 100) >= cantidad) {
            if (cantidad > 0) {
                saldo -= cantidad;
            } else {
                System.err.println("El saldo es inferior a la cantidad a retirar");
            }
        }
    }

    public String getAll() {
        return (titular + "  Saldo: " + saldo);
    }

    public void imprimir() {
        System.out.println(getAll());
    }

}
