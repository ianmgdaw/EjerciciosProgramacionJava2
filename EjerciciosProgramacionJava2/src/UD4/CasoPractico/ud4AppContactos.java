package UD4.CasoPractico;

import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo ud4AppContactos.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:23:17
 */
public class ud4AppContactos {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        //Variables
        boolean salir = false;
        int opcion;
        int cuantos = 0;
        int MAX = 100;
        //Vectores
        String[] nombres = new String[MAX];
        int[] telefonos = new int[MAX];
        String[] correos = new String[MAX];

        do {

            System.out.println("1. Ver contacto.");
            System.out.println("2. Agregar contacto.");
            System.out.println("3. Eliminar contacto.");
            System.out.println("4. Buscar contacto.");
            System.out.println("5. Salir");

            System.out.print("Elige una opción: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("LISTA DE CONTACTOS");
                    System.out.println("");
                    if (cuantos > 0) {
                        for (int i = 0; i < cuantos; i++) {
                            System.out.println(i + ". Nom bre: " + nombres[i] + "  Telf: " + telefonos[i] + "  Mail: " + correos[i]);
                        }
                    } else {
                        System.out.println("");
                        System.out.println("No hay contactos");
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                case 2:
                    if (cuantos < MAX) {

                        lector.nextLine();
                        System.out.print("Escribe nombre: ");
                        nombres[cuantos] = lector.nextLine();
                        System.out.print("Escribe número de telefono: ");
                        telefonos[cuantos] = lector.nextInt();
                        lector.nextLine();
                        System.out.print("Escribe el correo electrónico: ");
                        correos[cuantos] = lector.nextLine();
                        cuantos++;
                    } else {
                        System.out.println("ERROR: Vectores están llenos.");
                    }

                    break;
                case 3:
                    if (cuantos > 0) {
                        System.out.println("¿A quién quieres borrar contacto?");
                        for (int i = 0; i < cuantos; i++) {
                            System.out.println(i + ". Nombre: " + nombres[i]);
                        }
                    } else {
                        System.out.println("");
                        System.out.println("No hay contactos");
                        System.out.println("");
                    }
                    System.out.print("Escribe el número para borrarlo: ");
                    int borrar = lector.nextInt();
                    for (int i = borrar + 1; i < cuantos; i++) {
                        nombres[i - 1] = nombres[i];
                        telefonos[i - 1] = telefonos[i];
                        correos[i - 1] = correos[i];
                    }
                    cuantos--;
                    break;
                case 4:
                    
                    break;
                case 5:
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