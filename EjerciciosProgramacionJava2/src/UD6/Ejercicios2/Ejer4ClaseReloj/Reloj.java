/*
 * Proyecto EjerciciosProgramacionJava - Archivo Reloj.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios2.Ejer4ClaseReloj;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 17 ene. 2022 13:42:55
 */
public class Reloj {

    private int segundos, minutos, horas;

    //CONSTRUCTOR
    public Reloj(int horas, int minutos, int segundos) {
        setReloj(horas, minutos, segundos);
    }

    //GETTERS
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //SETTERS
    public void setReloj(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        } else {
            System.err.println("ERROR: La hora no es correcta.");
        }

        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            System.err.println("ERROR: Los minutos no son correctos.");
        }

        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            System.err.println("ERROR: Los segundos no son correctos.");
        }
    }

    //METODOS
    public String dimeHora() {
        return Integer.toString(horas) + ":" + Integer.toString(minutos) + ":" + Integer.toString(segundos);
    }

    public String dimeHora12() {
        if (horas >= 0 && horas <= 12) {
            return Integer.toString(horas) + "AM" + ":" + Integer.toString(minutos) + ":" + Integer.toString(segundos);
        } else {
            return Integer.toString(horas - 12) + "PM" + ":" + Integer.toString(minutos) + ":" + Integer.toString(segundos);
        }
    }

    public void imprimeHora() {
        System.out.println(dimeHora());
    }

    public void imprimeHora12() {
        System.out.println(dimeHora12());
    }

    public void tick() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            horas = (horas + 1) % 24;
        }
    }

}
