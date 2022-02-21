package UD7.Excepciones.EjerciciosCSoluciones;


import java.util.Scanner;

public class C2v2 {

    // Comprueba si la dirección es válida. Lanza una excepción si no lo es.
    public static void enviarMensaje(String dir) throws Exception {
        // Comprueba la dirección mediante expresiones regulares
        if (!dir.matches("\\w+@\\w+\\.\\w+")) {
            throw new Exception("Email incorrecto:" + dir);
        } else {
            System.out.println("¡Email correcto!");
        }
    }

    // Comprueva direcciones una y otra vez hasta que se introduza una cadena vacía
    public static void main(String[] args) {

        String dir;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce direcciones de correo a comprobar. Cadena vacía para terminar.");

        do {
            System.out.print("Direccion de correo: ");
            dir = lector.nextLine();
            try {
                enviarMensaje(dir);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (dir.length() != 0);
    }
}
