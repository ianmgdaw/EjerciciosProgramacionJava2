/*
 * Proyecto EjerciciosProgramacionJava - Archivo CuentaCorriente.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer3ClaseCuentaCorriente;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 ene. 2022 19:23:54
 */
public class CuentaCorriente {

    private String numCuenta;
    private double saldo, cantidadIngreso, cantidadRetiro;

    //CONSTRUCTOR
    public CuentaCorriente(String numCuenta, double saldo) {
        setNumCuenta(numCuenta);
        setSaldo(saldo);
    }
    
    //GETTERS
    public String getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTERS
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.err.println("ERROR: No se puede ser saldo menos de 0€.");
        }
    }
    
    //METODOS
    public void ingresar(double cantidadIngreso) {
        if (cantidadIngreso > 0) {
            saldo += cantidadIngreso;
        } else {
            System.err.println("ERROR: No se puede ingresar menos de 0 €.");
        }
    }

    public boolean retirar(double cantidadRetiro) {
        if (saldo - cantidadRetiro >= 0) {
            saldo -= cantidadRetiro;
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimir(){
        System.out.println("Cuenta corriente: " + getNumCuenta());
        System.out.println("Saldo: " + getSaldo() + " €");
        System.out.println("");
    }

}
