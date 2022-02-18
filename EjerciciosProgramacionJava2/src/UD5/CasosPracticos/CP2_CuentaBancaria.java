/*
 * Proyecto EjerciciosProgramacionJava - Archivo CP2_CuentaBancaria.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.CasosPracticos;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 26 nov. 2021 12:43:28
 */
public class CP2_CuentaBancaria {

    // Mostrar el menú================================================================
    public static int menu() {
        System.out.println("1. Ver cuentas.\n"
                + "2. Ingresar dinero.\n"
                + "3. Retirar dinero.\n"
                + "4. Agregar cuenta.\n"
                + "5. Eliminar cuenta.\n"
                + "6. Buscar cuenta.\n"
                + "7. Mostrar morosos.\n"
                + "8. Salir.");
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("Elige una opción: ");
        int opcion = in.nextInt();
        return opcion;
    }
    //================================================================================

    // Ejecutar la opcion seleccionada ===============================================
    public static void ejecutarOpcion(int opcion, String[] nombres, double[] saldos, int cuentas, boolean esMismaCuenta, int MAX) {
        switch (opcion) {
            case 1: //Ver cuentas
                mostrarCuentas(nombres, saldos, cuentas);
                break;
            case 2: // Ingresar dinero

                break;
            case 3: // Retirar dinero

                break;
            case 4: // Agregar cuenta
                añadirCuentas(nombres,saldos,cuentas,MAX,esMismaCuenta);
                break;
            case 5: // ELiminar cuenta

                break;
            case 6: // Buscar cuenta

                break;
            case 7: // Mostrar morosos

                break;
        }
    }
    //================================================================================

    //Mostrar cuentas(nombres y saldos)===============================================
    public static void mostrarCuentas(String[] nombres, double[] saldos, int cuentas) {  //NO FUNCIONAAAAA
        if (0 <= cuentas) {
            for (int i = 0; i < cuentas; i++) {
                System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
            }
        } else {
            System.out.println("No hay cuentas.");
        }
    }
    //================================================================================

    //Comprobar no hay misma cuenta
    public static boolean mismaCuenta(String[] nombres, int cuentas,String nom, boolean esMismaCuenta) {
        for (int i = 0; i < cuentas; i++) { //Comprueba si existe mismo nombre
            String nombre = nombres[i];
            if (nom.equalsIgnoreCase(nombres[i])) { // NO FUNCIONAAAAAA ---------------------------------------------------------------------------#########
                esMismaCuenta = true;
            }
        }
        return esMismaCuenta;
    }
    //================================================================================    
    
    //Añadir cuentas =================================================================
    public static void añadirCuentas(String[] nombres, double[] saldos, int cuentas, int MAX, boolean esMismaCuenta) {
        if (cuentas < MAX) {
            Scanner in = new Scanner(System.in);
            System.out.println("");
            System.out.print("Escribe el nombre: ");
            nombres[cuentas] = in.nextLine();
            String nom = nombres[cuentas];
            mismaCuenta(nombres, cuentas, nom, esMismaCuenta);
                if (!esMismaCuenta) {
                    System.out.print("Escribe el saldo: ");
                    saldos[cuentas] = in.nextDouble();
                    cuentas++;
                } else {
                    System.out.println("Existe la misma cuenta.");
                }
        } else {
            System.out.println("");
            System.out.println("Las cuentas están llenas.");
            System.out.println("");
        }
    }
    //================================================================================


    public static void main(String[] args) {
        //Varibles
        int opcion;
        int cuentas = 0;
        int MAX = 100;
        boolean esMismaCuenta = false;

        //VECTORES
        String[] nombres = new String[MAX];
        double[] saldos = new double[MAX];

        do {
            opcion = menu();
            ejecutarOpcion(opcion,nombres,saldos,cuentas,esMismaCuenta,MAX);
            System.out.println("");
        } while (opcion != 8);
    }

}
