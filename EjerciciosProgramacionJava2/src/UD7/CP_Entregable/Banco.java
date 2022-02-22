/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Banco.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.CP_Entregable;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 16:47:14
 */
public class Banco {

    //Atributos
    private Cuenta[] cuentas;
    private int cuantos;

    //Constructor
    public Banco(int cuantasCuentas) {
        cuentas = new Cuenta[cuantasCuentas];
        this.cuantos = 0;
    }

    //Otros metodos
    public void mostrarTodos() {
        for (int i = 0; i < cuantos; i++) {
            System.out.print(i + ": ");
            cuentas[i].verCuenta();
        }
    }

    public void mostrarMorosos() throws Exception {

        Banco morosos = new Banco(cuantos);

        for (int i = 0; i < cuantos; i++) {
            if (cuentas[i].getSaldo() < 0) {
                morosos.agregarCuenta(cuentas[i]);
            }
        }
        morosos.mostrarTodos();
    }

    public boolean agregarCuenta(Cuenta c) throws Exception {

        boolean encontrado = false;

        for (int i = 0; i < cuantos; i++) {
            if (c.getNombre().equals(cuentas[i].getNombre())) {
                encontrado = true;
            }
        }

        if (cuantos >= cuentas.length) {
            throw new Exception("Agenda llena. La cuenta no se ha agregado.");
        } else if (encontrado == true) {
            throw new Exception("Ya existe una cuenta con este nombre.");
        } else {
            this.cuentas[cuantos] = c;
            cuantos++;
            return true;
        }

    }
    
    public boolean eliminarCuenta(int pos) throws Exception {
        if (cuantos <= 0 || pos < 0) {
            throw new Exception("Agenda vacía. El contacto no se ha eliminado.");
            return false;
    }
    

}
