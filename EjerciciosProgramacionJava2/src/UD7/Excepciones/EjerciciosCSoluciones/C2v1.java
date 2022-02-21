package UD7.Excepciones.EjerciciosCSoluciones;


public class C2v1 {

    // Comprueba si la dirección es válida. Lanza una excepción si no lo es.
    public static void enviarMensaje(String dir) throws Exception {

        int longitud = dir.length();
        int arroba = dir.indexOf("@");
        int punto = dir.indexOf(".");

        if (arroba < punto - 1 && punto < longitud - 1 && arroba != -1 && punto != -1) {
            System.out.println("E-MAIL CORRECTO: " + dir);
        } else {
            if (longitud == 0) {
                throw new Exception("El email " + dir + " debe tener uno o más caracteres");
            }
            if (arroba == -1) {
                throw new Exception("El email " + dir + " debe tener una @");
            }
            if (punto == -1) {
                throw new Exception("El email " + dir + "  debe tener un . para indicar el dominio");
            }
            if (arroba >= longitud - 1) {
                throw new Exception("El email " + dir + " La @ debe contener carácteres después");
            }
            if (punto >= longitud - 1) {
                throw new Exception("El email " + dir + " El . debe contener carácteres después");
            }
            if (arroba >= punto - 1) {
                throw new Exception("El email " + dir + " La @ debe estar antés del . con algun caracter intermedio");
            }
        }
    }

    // Probando varias direcciones de correo.
    // Comentar líneas que lanzan excepción para comprobarlas todas
    public static void main(String[] args) {
        try {
            enviarMensaje("lionel@gmail.com");
            enviarMensaje("lionelgmail.com");
            enviarMensaje("lionel@gmailcom");
            enviarMensaje("lionel.gmail@com");
            enviarMensaje("lionel@gmailcom.");
            enviarMensaje("");
            enviarMensaje("lionel@.hola");
            enviarMensaje("lionel@hola.");
            enviarMensaje(null);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
