/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Ejer3Gato.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.Excepciones.EjerciciosC;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 13:35:28
 */
public class Ejer3Gato {

    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public Ejer3Gato(String nombre, int edad) throws Exception {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("ERROR: El nombre debe tener al menos 3 carácteres.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("ERROR: La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("El gato se llama " + this.getNombre() + " y tiene " + this.getEdad() + " años de edad.");
    }
}
