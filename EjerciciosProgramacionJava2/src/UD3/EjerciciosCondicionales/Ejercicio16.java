package UD3.EjerciciosCondicionales;

/*
Escribe un programa en el que el usuario intenta adivinar el valor que saldrá al “tirar”
un dado de 6 caras. Se le pedirá el valor al usuario, y luego se mostrará un número
aleatorio entre 1 y 6. Por ultimo, se mostrará un mensaje indicando si el usuario
acertó o no.
 */

/**
 *
 * @author Ian Molina
 */
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        // Variables
        int numero;
        int dado;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos número
        System.out.print("¿Qué número saldrá en el dado?: ");
        numero = in.nextInt();
        
        // Tiramos un dado
        dado = (int)(1 + Math.random() * 6);
        System.out.println("Tiro el dado y sale un... " + dado);
        
        // Mostramos si acertó o no
        if (numero == dado)
            System.out.println("¡Acertaste!");
        else
            System.out.println("Fallaste :(");
        
    }
}
