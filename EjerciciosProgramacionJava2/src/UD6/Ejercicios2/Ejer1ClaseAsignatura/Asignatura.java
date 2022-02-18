/*
 * Proyecto EjerciciosProgramacionJava - Archivo Asignatura.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer1ClaseAsignatura;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 ene. 2022 16:45:44
 */
public class Asignatura {

    private String nombre;
    private int codigo;
    private int curso;

    public Asignatura(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void imprimir() {
        System.out.println("Nombre: " + getNombre() + " Código: " + getCodigo() + " Curso: " + getCurso());
    }

}
