/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.CasoPractico2Banco;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 31 ene. 2022 16:36:20
 */
public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco(100);
        int opcion;
        do {        
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("== VER CUENTAS ==");
                    banco.mostrarTodos();
                    break;
                case 2:
                    System.out.println("== INGRESAR DINERO ==");
                    banco.ingresar(pedirDouble(), banco.elegirCuenta());
                    break;
                case 3:
                    System.out.println("== RETIRAR DINERO ==");
                    banco.retirar(pedirDouble(), banco.elegirCuenta());
                    break;
                case 4:
                    System.out.println("== TRANSFERIR DINERO ==");
                    banco.transferir(pedirDouble(), banco.elegirCuenta(), banco.elegirCuenta());
                    break;
                case 5:
                    System.out.println("== AGREGAR CUENTA ==");
                    banco.agregarCuenta(crearCuenta(pedirString(), pedirDouble()));
                    break;
                case 6:
                    System.out.println("== ELIMINAR CUENTA ==");
                    banco.eliminarCuenta(banco.elegirCuentaInt());
                    break;
                case 7:
                    System.out.println("== BUSCAR CUENTA POR NOMBRE ==");
                    banco.buscarCuenta();
                    break;
                case 8:
                    System.out.println("== MOSTRAR MOROSOS ==");
                    banco.mostrarMorosos();
                    break;
                case 9:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
            
        } while (opcion != 9);
        
    }
    
    public static int rango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.err.println("Entrada inválida. Introduce un número entre " + min + " y " + max);
            }
        } while (valor < min || valor > max);

        return valor;
    }
    public static int menu(){
        System.out.println("1. Ver cuentas");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Transferir dinero");
        System.out.println("5. Agregar cuenta");
        System.out.println("6. Eliminar cuenta");
        System.out.println("7. Buscar cuenta");
        System.out.println("8. Mostrar morosos");
        System.out.println("9. Salir");
        
        int opcion = rango(1,9);
        return opcion;
    }
    public static Cuenta crearCuenta(String nombre, double saldo){
        Cuenta c = new Cuenta(nombre, saldo);
        return c;
    }
    public static String pedirString(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    public static double pedirDouble(){
        Scanner leer = new Scanner(System.in);
        System.out.print("\nCantidad a ingresar: ");
        double d = leer.nextDouble();
        return d;
    }   
    
    
}

