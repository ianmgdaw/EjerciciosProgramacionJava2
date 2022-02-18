/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainCuentaCorriente.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios3.Ejer3ArrayCuentaCorriente;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 ene. 2022 19:00:36
 */
public class MainCuentaCorriente {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int opcion;

        //CREAR ARRAY
        CuentaCorriente[] cuenta = new CuentaCorriente[5];

        cuenta[0] = new CuentaCorriente(001, 1000);
        cuenta[1] = new CuentaCorriente(152, 2000);
        cuenta[2] = new CuentaCorriente(273, 3000);
        cuenta[3] = new CuentaCorriente(487, 4000);
        cuenta[4] = new CuentaCorriente(973, 5000);

        do {
            System.out.println("MENÚ");
            System.out.println("1. Ver cuentas");
            System.out.println("2. Ingresar");
            System.out.println("3. Retirar");
            System.out.println("4. Transferencia");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = lector.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1: //VER CUENTAS
                    for (int i = 0; i < cuenta.length; i++) {
                        cuenta[i].imprime();
                    }
                    break;
                case 2: //INGRESAR
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción no existe");
            }

        } while (opcion != 5);

        
        
        
        
    }
}
