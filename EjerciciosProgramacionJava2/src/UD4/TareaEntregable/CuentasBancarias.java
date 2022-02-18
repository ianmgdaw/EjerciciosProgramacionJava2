package UD4.TareaEntregable;


import java.util.Scanner;

/*
 * Proyecto UD4TareaEntregable - Archivo CuentasBancarias.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 20:31:54
 */
public class CuentasBancarias {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //VARIABLES
        boolean salir = false;
        int opcion;
        int cuentas = 0;
        int MAX = 100;

        //VECTORES
        String[] nombres = new String[MAX];
        double[] saldos = new double[MAX];

        do {
            System.out.println("");
            System.out.println("1. Ver cuentas.");
            System.out.println("2. Ingresar dinero.");
            System.out.println("3. Retirar dinero.");
            System.out.println("4. Agregar cuenta.");
            System.out.println("5. Eliminar cuenta.");
            System.out.println("6. Buscar cuenta.");
            System.out.println("7. Mostrar morosos.");
            System.out.println("8. Salir");

            System.out.print("Elige una opción: ");
            opcion = lector.nextInt();
            //lector.nextLine();

            switch (opcion) {
                case 1: // VER CUENTAS
                    if (cuentas > 0) {
                        System.out.println("");
                        System.out.println("LISTA DE CUENTAS");
                        System.out.println("");
                        for (int i = 0; i < cuentas; i++) {
                            System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("No hay cuentas");
                        System.out.println("");
                    }
                    break;
                case 2: // INGRESAR DINERO
                    if (cuentas > 0) {
                        System.out.println("");
                        System.out.print("¿Qúe cuenta para ingresar?: ");
                        int cuentaIngreso = lector.nextInt();
                        System.out.print("La cantidad a ingresar: ");
                        double ingreso = lector.nextDouble();
                        saldos[cuentaIngreso] += ingreso;
                    } else {
                        System.out.println("");
                        System.out.println("No hay cuentas");
                        System.out.println("");
                    }
                    break;
                case 3: // RETIRAR DINERO
                    if (cuentas > 0) {
                        System.out.println("");
                        System.out.print("¿Qúe cuenta para retirar?: ");
                        int cuentaRetiro = lector.nextInt();
                        System.out.print("La cantidad a retirar: ");
                        double retiro = lector.nextDouble();
                        saldos[cuentaRetiro] = (saldos[cuentaRetiro]) - (retiro);
                    } else {
                        System.out.println("");
                        System.out.println("No hay cuentas");
                        System.out.println("");
                    }
                    break;
                case 4: // AGREGAR CUENTA
                    if (cuentas < MAX) {
                        System.out.println("");
                        lector.nextLine();
                        System.out.print("Escribe el nombre: ");
                        nombres[cuentas] = lector.nextLine();
                        System.out.print("Escribe el saldo: ");
                        saldos[cuentas] = lector.nextDouble();
                        cuentas++;
                    } else {
                        System.out.println("");
                        System.out.println("Las cuentas están llenas.");
                        System.out.println("");
                    }
                    break;
                case 5: // ELIMINAR CUENTA
                    if (cuentas > 0) {
                        System.out.println("");
                        System.out.print("¿Qué cuenta quieres eliminar?: ");
                        int borrar = lector.nextInt();
                        for (int i = borrar + 1; i < cuentas; i++) {
                            nombres[i - 1] = nombres[i];
                            saldos[i - 1] = saldos[i];
                        }
                        cuentas--;
                    } else {
                        System.out.println("");
                        System.out.println("No hay cuentas");
                        System.out.println("");
                    }
                    break;
                case 6: // BUSCAR CUENTA
                    if (cuentas > 0) {
                        System.out.println("");
                        lector.nextLine();
                        System.out.print("Escribe un nombre: ");
                        String busca = lector.nextLine();
                        busca = busca.toLowerCase();

                        for (int i = 0; i < cuentas; i++) {
                            String nombre = nombres[i];
                            nombre = nombre.toLowerCase();
                            int N = nombre.indexOf(busca);
                            if (N != -1) {
                                System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                            }
                        }
                    } else {
                        System.out.println("");
                        System.out.println("No hay cuentas");
                        System.out.println("");
                    }
                    break;
                case 7: // MOSTRAR MOROSOS
                    if (cuentas > 0) {
                        System.out.println("");
                        System.out.println("LISTA DE MOROSOS");
                        System.out.println("");
                        for (int i = 0; i < cuentas; i++) {
                            if (saldos[i] < 0) {
                                System.out.println(i + ". " + nombres[i] + "  Saldo: " + saldos[i] + " €");
                            }
                        }
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("No hay cuentas");
                        System.out.println("");
                    }
                    break;
                case 8: // SALIR
                    salir = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("La opción no existe.");
                    System.out.println("");
            }

        } while (!salir);

    }
}
