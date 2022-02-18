/*
 * Proyecto EjerciciosProgramacionJava - Archivo CP1_AppContactos.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.CasosPracticos;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 11:48:57
 */
public class CP1_AppContactos {

    public static int MAX = 100; // Nº maximo de contactos
    public static int cuantos = 0; //Números de contactos existes 
    public static String[] nombres = new String[MAX];
    public static String[] telefonos = new String[MAX];
    public static String[] correos = new String[MAX];
    public static int[] posiciones = new int[MAX];
    
    // Muestra el menú, pide al usuario valor rango 1-8 y devuelve la opción elegida. ============================
    public static int menu() {
        System.out.println("1. Ver contactos.\n"
                + "2. Agregar contacto.\n"
                + "3. Eliminar contacto.\n"
                + "4. Buscar por nombre.\n"
                + "5. Buscar por teléfono.\n"
                + "6. Buscar por correo.\n"
                + "7. Búsqueda global.\n"
                + "8. Salir.");
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("Elige una opción: ");
        int opcion = in.nextInt();
        return opcion;
    }
    //============================================================================================================

    //Realizar la operación del menú indicada en 'int opcion' ====================================================
    public static void realizaOperacion(int opcion) {
        switch (opcion) {
            case 1:
                mostrarContactos(posiciones);
                break;
            case 2:
                añadirContactos();
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
        }
    }
    //============================================================================================================

    // Comprobar si hay contactos, sino sale un mensaje "No hay contactos"
    public static void hayContactos(int cuantos) {
        if (cuantos < 0) {
            System.out.println("");
            System.out.println("No hay contactos.");
            System.out.println("");
        }
    }
    //============================================================================================================

    // Buscar la lista de contactos
    public static void añadirContactos() {
        if (cuantos < MAX) {
            Scanner in = new Scanner(System.in);
            System.out.print("Escribe nombre: ");
            nombres[cuantos] = in.nextLine();
            System.out.print("Escribe número de telefono: ");
            telefonos[cuantos] = in.nextLine();
            System.out.print("Escribe el correo electrónico: ");
            correos[cuantos] = in.nextLine();
            cuantos++;
        } else {
            System.out.println("¡¡ERROR: La lista de contactos está completo!!");
        }
    }
    //============================================================================================================

    // Mostrar la lista de contactos
    public static void mostrarContactos(int[] posiciones) {
        System.out.println("LISTA DE CONTACTOS");
        System.out.println("");
        if (cuantos > 0) {
            for (int i = 0; i < cuantos; i++) {
                System.out.println(i + ". Nombre: " + nombres[i] + "  Telf: " + telefonos[i] + "  Mail: " + correos[i]);
            }
        } else {
            System.out.println("");
            System.out.println("No hay contactos");
            System.out.println("");
        }
        System.out.println("");
    }
    //============================================================================================================

    public static void main(String[] args) {
        //Variables y matrices
        int opcion;
        
        do {
            opcion = menu();
            realizaOperacion(opcion);
            System.out.println("");
        } while (opcion != 8);

    }
}
