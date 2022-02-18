/*
 * Proyecto EjerciciosProgramacionJava - Archivo Persona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios1.ProgramaPersona;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:13:57
 */
public class Persona {

    private String dni, nombre, apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    // GETTERS ==============================================
    public String getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // SETTERS ===============================================
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    //METODOS ==============================================
    
    public String imprimirSiEsMayorEdad() {
        if (edad >= 18) {
            return "es mayor de edad.";
        } else {
            return "no es mayor de edad.";
        }
    }
    
    public void imprime() {
        System.out.println(getNombre() + " " + getApellidos() + " con DNI " + getEdad() + " " + imprimirSiEsMayorEdad());
    }
    
    public boolean esMayorEdad() {
        return edad >= 18;
    }
    
    public boolean esJubilado() {
        return edad >= 65;
    }
    
    //public int diferenciaEdad(Persona p) {

    //}

}
