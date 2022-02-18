/*
 * Proyecto EjerciciosProgramacionJava - Archivo Coche.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer2ClaseCoche;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 16 ene. 2022 17:23:04
 */
public class Coche {
    
    public enum TipoCoche {MINI, UTILITARIO, FAMILIAR, DEPORTIVO}

    public enum ModalidadSeguro {TERCEROS, TODO_RIESGO}
    
    private String modelo, color, matricula;
    private boolean metalizada;
    private int anyoFabricacion;
    private TipoCoche tipo;
    private ModalidadSeguro modalidad;

    

    public Coche(String modelo, String color, boolean metalizada, String matricula, TipoCoche tipo, int anyoFabricacion, ModalidadSeguro modalidad) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.tipo = tipo;
        this.anyoFabricacion = anyoFabricacion;
        this.modalidad = modalidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean getMetalizada() {
        return metalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public TipoCoche getTipoCoche() {
        return tipo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public ModalidadSeguro getModalidadSeguro() {
        return modalidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipoCoche(TipoCoche tipo) {
        this.tipo = tipo;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public void setModalidadSeguro(ModalidadSeguro modalidad) {
        this.modalidad = modalidad;
    }
    
    public void imprimir() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Pintura metalizada: " + getMetalizada());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Tipo de coche: " + getTipoCoche());
        System.out.println("Año de fabricación: " + getAnyoFabricacion());
        System.out.println("Modalidad del seguro: " + getModalidadSeguro());
        System.out.println("");
    }

}
