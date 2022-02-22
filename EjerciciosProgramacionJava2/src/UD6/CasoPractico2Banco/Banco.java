/*
 * Proyecto EjerciciosProgramacionJava - Archivo Banco.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.CasoPractico2Banco;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 31 ene. 2022 16:36:31
 */
public class Banco {

    private Cuenta[] cuentas;
    private int cuantos;

    //Constructor
    public Banco(int cuantasCuentas) {
        cuentas = new Cuenta[cuantasCuentas];
        this.cuantos = 0;
    }
    //Getters - Setters

    //Otras funciones
    public void mostrarTodos() {
        for (int i = 0; i < cuantos; i++) {
            System.out.print(i + ": ");
            cuentas[i].verCuenta();
        }
    }

    public void mostrarMorosos() {

        Banco morosos = new Banco(cuantos);

        for (int i = 0; i < cuantos; i++) {
            if (cuentas[i].getSaldo() < 0) {
                morosos.agregarCuenta(cuentas[i]);
            }
        }
        morosos.mostrarTodos();
    }

    public boolean agregarCuenta(Cuenta c) {

        boolean encontrado = false;

        for (int i = 0; i < cuantos; i++) {

            if (c.getNombre().equals(cuentas[i].getNombre())) {
                encontrado = true;
            }
        }

        if (cuantos >= cuentas.length) {
            System.err.println("Agenda llena. La cuenta no se ha agregado.");
            return false;
        } else if (encontrado == true) {
            System.err.println("Ya existe una cuenta con este nombre.");
            return false;
        } else {
            this.cuentas[cuantos] = c;
            cuantos++;
            return true;
        }
    }

    public boolean eliminarCuenta(int pos) {
        if (cuantos <= 0 || pos < 0) {
            System.err.println("Agenda vacía. El contacto no se ha eliminado.");
            return false;
        } else {
            for (int i = pos; i < cuentas.length - 1; i++) {
                cuentas[i] = cuentas[i + 1];
            }
            cuantos--;
            return true;
        }
    }

    public Banco buscarCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Qué nombre buscas?");
        String busqueda = leer.nextLine();
        int cuantosEncontrados = 0;

        Banco be = new Banco(this.cuentas.length);

        for (int i = 0; i < cuantos; i++) {

            if (cuentas[i].getNombre().toUpperCase().contains(busqueda.toUpperCase())) {
                cuantosEncontrados++;
                be.agregarCuenta(cuentas[i]);
            }
        }
        if (cuantosEncontrados == 0) {
            System.out.println("No hay cuentas con mora.");
        }
        return be;
    }

    public Cuenta elegirCuenta() {
        mostrarTodos();
        System.out.println("\nElige una");
        return cuentas[Main.rango(0, cuantos)];
    }

    public int elegirCuentaInt() {
        mostrarTodos();
        System.out.println("\nElige una");
        return Main.rango(0, cuantos);
    }

    public void ingresar(double dinero, Cuenta c) {
        c.ingresar(dinero);
        System.out.println("Operación realizada con éxito.\n");
    }

    public boolean retirar(double dinero, Cuenta c) {
        if (c.retirar(dinero) == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double dinero, Cuenta origen, Cuenta destino) {
        if (origen.retirar(dinero) == true) {
            origen.retirar(dinero);
            destino.ingresar(dinero);
            return true;
        } else {
            return false;
        }
    }
}
