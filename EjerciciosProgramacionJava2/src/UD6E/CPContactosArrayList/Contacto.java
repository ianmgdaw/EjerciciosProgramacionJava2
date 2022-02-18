/*
 * Proyecto EjerciciosProgramacionJava - Archivo Contacto.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6E.CPContactosArrayList;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 13 feb. 2022 20:08:13
 */
public class Contacto {

    // ==================== Atributos ====================
    String nombre;
    String telefono;
    String correo;

    // ==================== Constructor ====================
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // ==================== Getters y Setters ====================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // ==================== Metodos ====================
    // Devuelve un String con la información del contacto
    public String getAll() {
        return (nombre + " " + telefono + " " + correo);
    }

    // Imprime la información del contacto
    public void imprimir() {
        System.out.println(getAll());
    }

}
