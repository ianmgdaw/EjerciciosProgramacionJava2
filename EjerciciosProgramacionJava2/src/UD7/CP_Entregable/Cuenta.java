/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Cuenta.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.CP_Entregable;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 16:47:08
 */
public class Cuenta {

    //Atributos
    private String nombre;
    private double saldo;

    //Constructor 
    public Cuenta(String nombre, double saldo) throws CuentaException {
        setNombre(nombre);
        setSaldo(saldo);
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws CuentaException {
        if (saldo < -100) {
            throw new CuentaException("El saldo de la cuenta no puede ser inferior a 100€.");
        }
        this.saldo = saldo;
    }

    //Otros metodos
    public void verCuenta() {
        System.out.println(this.nombre + "\t" + this.saldo);
        System.out.println("");
    }

    public void ingresar(double dinero) throws CuentaException {
        if (dinero < 0) {
            throw new CuentaException("No se puede ingresar dinero negativo.");
        } else {
            this.saldo += dinero;
        }
    }

    public void retirar(double dinero) throws CuentaException {
        if ((this.saldo - dinero) < -100) {

            throw new CuentaException("La cuenta no puede tener un saldo inferior a -100€.");

        } else {
            System.out.println("La operación se ha realizado con éxito");
            this.saldo -= dinero;
        }
    }

}
