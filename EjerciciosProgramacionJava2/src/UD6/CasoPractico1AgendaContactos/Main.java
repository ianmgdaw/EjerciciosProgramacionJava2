/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.CasoPractico1AgendaContactos;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 21:11:05
 */
public class Main {

    public static void main(String[] args) {

        // 
        Agenda agenda = new Agenda();

        // Variables auxiliares
        int opcion;     // opcion del menú
        String n, c, t; // nombre, correo y teléfono
        String buscar;  // término a buscar
        int pos;        // posicion
        int[] vpos;     // vector de posiciones
        Agenda agendaEncontrados; // agenda auxiliar para búsquedas

        // Bucle principal
        do {
            opcion = menu();

            switch (opcion) {
                case 1: // Ver contactos
                    agenda.imprimirTodos();
                    break;

                case 2: // Añadir contacto

                    // Pedimos datos del nuevo contacto
                    System.out.print("¿Nombre? ");
                    n = pedirString();
                    System.out.print("¿Teléfono? ");
                    t = pedirString();
                    System.out.print("¿Correo? ");
                    c = pedirString();

                    // Creamos contacto y lo añadimos a la agenda
                    Contacto contacto = new Contacto(n, t, c);
                    agenda.agregarContacto(contacto);
                    break;

                case 3: // Eliminar contacto

                    // Pedimos la posición del contacto a eliminar
                    System.out.print("¿ID de contacto a eliminar? ");
                    pos = pedirIntEnRango(0, agenda.getCuantos() - 1);

                    // Eliminamos el contacto
                    agenda.eliminarContacto(pos);
                    break;

                case 4: // Buscar por nombre
                    // Pedimos nombre a buscar
                    System.out.print("¿Nombre? ");
                    buscar = pedirString();

                    // Buscamos contactos. Los obtenemos en una agenda auxiliar e imprimimos
                    agendaEncontrados = agenda.buscarNombreV3(buscar);
                    agendaEncontrados.imprimirTodos();
                    break;

                case 5: // Buscar por teléfono
                    // Pedimos teléfono a buscar
                    System.out.print("¿Teléfono? ");
                    buscar = pedirString();

                    // Buscamos contactos. Los obtenemos en una agenda auxiliar e imprimimos
                    agendaEncontrados = agenda.buscarTelefono(buscar);
                    agendaEncontrados.imprimirTodos();
                    break;

                case 6: // Buscar por correo
                    // Pedimos correo a buscar
                    System.out.print("¿Correo? ");
                    buscar = pedirString();

                    // Buscamos contactos. Los obtenemos en una agenda auxiliar e imprimimos
                    agendaEncontrados = agenda.buscarTelefono(buscar);
                    agendaEncontrados.imprimirTodos();
                    break;

                case 7:
                    // Búsqueda global
                    System.out.print("¿Término a buscar globalmente? ");
                    buscar = pedirString();

                    // Buscamos contactos. Los obtenemos en una agenda auxiliar e imprimimos
                    agendaEncontrados = agenda.buscarGlobal(buscar);
                    agendaEncontrados.imprimirTodos();
                    break;
                case 8:
                    // Salir
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

            System.out.println("");
        } while (opcion != 8);
    }

    /**
     * FUNCIONES DEL MENÚ Y PEDIR DATOS AL USUARIO
     */
    // Muestra el menú y devuelve la opción elegida por el usuario
    public static int menu() {

        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
        System.out.print("¿Opción? ");

        int opcion = pedirIntEnRango(1, 8);

        return opcion;
    }

    // Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: No válido. Debe ser entre " + min + " y " + max);
                System.out.print("Vuelve a intentarlo: ");
            }
        } while (valor < min || valor > max);

        return valor;
    }

    // Pide al usuario un texto y lo devuelve
    public static String pedirString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
