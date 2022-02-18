/*
 * Proyecto EjerciciosProgramacionJava - Archivo Agenda.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6E.CPContactosArrayList;

import java.util.ArrayList;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 13 feb. 2022 20:07:55
 */
public class Agenda {

    // ==================== Atributos ====================
    private ArrayList<Contacto> contactos;
    private final int MAX = 100;
    private int cuantos;

    // ==================== Constructor ====================
    Agenda() {
        contactos = new ArrayList();
        cuantos = 0;
    }

    public int getCuantos() {
        return cuantos;
    }

    // ==================== GETTERS ====================
    ArrayList<Contacto> getContactos() {
        return contactos;
    }
    
    // Agrega un objeto tipo contacto a la agenda (lo añade al vector y cuantos++)
    void agregarContacto(Contacto c) {
        // Si la agendalength no está llena y no existe un contacto con ese nombre
        if (contactos.size() < MAX && !comprobarSiExiste(c.getNombre())) {
            contactos.add(c);
            cuantos++;
        } else {
            System.err.println("ERROR: No se ha podido agregar el contacto. Agenda llena.");
        }
    }

    // Elimina el contacto en la posición ‘pos’ (lo quita del vector y cuantos--)
    void eliminarContacto(int pos) {
        if (pos >= 0 && pos < contactos.size()) {
            contactos.remove(pos);
            cuantos--;
        } else {
            System.err.println("ERROR: No se ha podido eliminar el contacto. Posición fuera de rango.");
        }
    }

    // Comprueba si existe algún contacto que se llame exactamente como 'nombre'. Devuelve true/false.
    boolean comprobarSiExiste(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    // Devuelve una agenda con los contactos cuyo nombre contiene ‘str’
    Agenda buscarNombre(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyo nombre contiene 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los contactos cuyo teléfono contienen ‘str’
    Agenda buscarTelefono(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyo teléfono contiene 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getTelefono().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los contactos cuyo correo contienen ‘str’
    Agenda buscarCorreo(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyo correo contiene 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getCorreo().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los contactos cuyo nombre, teléfono o correo contienen ‘str’
    Agenda buscarGlobal(String str) {

        // Agenda temporal donde guardaremos los contactos encontrados
        Agenda at = new Agenda();

        // Recorremos 'contactos' buscando los contactos cuyos datos contienen 'str'
        // Guardaremos en la agenda 'a' los contactos que coincidan con la búsqueda
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getAll().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }

    // Imprime la información de todos los contactos
    void imprimirTodos() {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.print(i + " ");
            contactos.get(i).imprimir();
        }
    }

}