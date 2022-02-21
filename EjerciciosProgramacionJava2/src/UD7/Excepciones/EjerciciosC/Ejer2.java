/*
 * Proyecto EjerciciosProgramacionJava2 - Archivo Ejer2.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7.Excepciones.EjerciciosC;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 12:00:52
 */
public class Ejer2 {

    public static void enviarMensaje(String dir) throws Exception {

        int longitud = dir.length();
        int arroba = dir.indexOf("@");
        int punto = dir.indexOf(".");

        if (arroba < punto - 1 && punto < longitud - 1 && arroba != -1 && punto != -1) {
            System.out.println("Email correcto: " + dir);
        } else {
            if (longitud == 0) {
                throw new Exception("El email " + dir + " debe tener uno o más caracteres.");
            }
            if (arroba == -1) {
                throw new Exception("El email " + dir + " debe tener una @");
            }
            if (punto == -1) {
                throw new Exception("El email " + dir + " debe tener un - para indicar el dominio");
            }
            if (arroba >= longitud - 1) {
                throw new Exception("El email " + dir + " la @ debe contener carácteres después");
            }
            if (punto >= longitud - 1) {
                throw new Exception("El email " + dir + " El . debe contener carácteres después");
            }
            if (arroba >= punto - 1) {
                throw new Exception("El email " + dir + " La @ debe estar antés del . con algun caracter intermedio");
            }

        }

    }

    public static void main(String[] args) {
        try {
            //enviarMensaje("ianmolinaguillo96@gmail.com");
            enviarMensaje("iangmail.com");
            //enviarMensaje("ian.molina.guillo96@gmailcom");
            //enviarMensaje("ian.molina.guillo96@gmailcom.");
            //enviarMensaje("");
            //enviarMensaje("ian.molina.guillo96@.com");
            //enviarMensaje("ian.molina.guillo96@gmail.");
            //enviarMensaje(null);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    
}
