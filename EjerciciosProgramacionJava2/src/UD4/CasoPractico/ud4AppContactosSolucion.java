package UD4.CasoPractico;

/*
 * Proyecto EjerciciosProgramacionJava - Archivo ud4AppContactosSolucion.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
import java.util.Scanner;

package ud4CasoPractico;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 5 dic. 2021 12:52:29
 */
public class ud4AppContactosSolucion {

    public static void main(String[] args) {
        
        int MAX = 100;
        int cuantos = 0;
        String[] nombres   = new String[MAX];
        String[] telefonos = new String[MAX];
        String[] correos   = new String[MAX];
        
        int opcion;
        boolean salir = false;
        
        Scanner in = new Scanner(System.in);
        
        do {
        
            System.out.println("1. Ver contactos");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Salir");
            
            System.out.print("Elige opción: ");
            opcion = in.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("LISTA DE CONTACTOS:");
                    for (int i = 0; i < cuantos; i++) {
                        System.out.println(i + ". Nombre: " + nombres[i]
                                + "   Telf: " + telefonos[i]
                                + "   Mail: " + correos[i]);
                    }
                    break;
                    
                case 2:
                    if (cuantos < MAX) {
                        in.nextLine();
                        System.out.print("Dime nombre: ");
                        nombres[cuantos] = in.nextLine();
                        System.out.print("Dime teléfono: ");
                        telefonos[cuantos] = in.nextLine();
                        System.out.print("Dime correo: ");
                        correos[cuantos] = in.nextLine();
                        cuantos++;
                    }
                    else {
                        System.out.println("ERROR: Vector lleno");
                    }
                    break;
                    
                case 3:
                    System.out.print("Dime el nº de contacto a borrar: ");
                    int borrar = in.nextInt();
                    if (borrar >= 0 && borrar < cuantos) {
                        for (int i = borrar + 1; i < cuantos; i++) {
                            nombres[i-1] = nombres[i];
                            telefonos[i-1] = telefonos[i];
                            correos[i-1] = correos[i];
                        }
                        cuantos--;
                        System.out.println("Contacto " + borrar + " borrado");
                    }
                    else {
                        System.out.println("ERROR: No existe ese contacto");
                    }
                    break;
                    
                case 4:
                    in.nextLine();
                    System.out.print("Dime el nombre a buscar: ");
                    String buscar = in.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < cuantos; i++) {
                        if (nombres[i].toUpperCase().indexOf(buscar.toUpperCase()) != -1) {
                            System.out.println(i + ". Nombre: " + nombres[i]
                                + "   Telf: " + telefonos[i]
                                + "   Mail: " + correos[i]);
                            encontrado = true;
                        }
                    }
                    
                    if (!encontrado)
                        System.out.println("No se han encontrado contactos");
                    break;
                    
                case 5:
                    salir = true;
                    break;
            }
            
            System.out.println("");
        
        } while(!salir);
        
        
        
    }

}
