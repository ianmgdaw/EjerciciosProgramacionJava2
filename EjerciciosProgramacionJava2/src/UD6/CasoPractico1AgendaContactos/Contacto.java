/*
 * Proyecto EjerciciosProgramacionJava - Archivo Contacto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.CasoPractico1AgendaContactos;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 24 ene. 2022 21:10:48
 */
public class Contacto {
    
    //ATRIBUTOS
    private String nombre, telefono, correo;

    //CONSTRUCTOR
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    //GETTERS / SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //METODOS
    
    // Imprime la información del contacto
    public void imprimir() {
        System.out.println(getAll());
    }
    
    // Devuelve un String con la información del contacto
    public String getAll() {
        return (nombre + " " + telefono + " " + correo);
    }
}
