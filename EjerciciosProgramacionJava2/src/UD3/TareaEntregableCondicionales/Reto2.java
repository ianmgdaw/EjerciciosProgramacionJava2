package UD3.TareaEntregableCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ian DAW
 */
public class Reto2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        //double resultado = 0;

        System.out.println("1. Sumar A+B");
        System.out.println("2. Restar A-B");
        System.out.println("3. Multiplicar A*B");
        System.out.println("4. Dividir A/B");
        System.out.println("5. Resto A%B");
        System.out.println("6. Exponencial A^B");
        System.out.println("7. Sen(X)");
        System.out.println("8. Cosen(X)");
        System.out.println("9. Tangente(X)");
        System.out.println("10. Salir");

        System.out.println("Selecciona una opción: ");
        int opcion = lector.nextInt();

        if (opcion >= 1 && opcion <= 6) {
            System.out.println("Escribe un número: ");
            num1 = lector.nextInt();
            System.out.println("Escribe otro número: ");
            num2 = lector.nextInt();
        } else if (opcion < 10) {
            System.out.println("Escribre un número: ");
            num1 = lector.nextInt();
        } else if (opcion == 10) {
            System.out.println("Salir...");
        } else {
            System.out.println("La opción no existe");
        }

        switch (opcion) {
            case 1:
                System.out.println("Sumar " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Restar " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicar " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Dividir " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case 5:
                System.out.println("Resto " + num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            case 6:
                System.out.println("Exponencial " + num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                break;
            case 7:
                System.out.println("Seno(" + num1 + ") = " + Math.sin(num1));
                break;
            case 8:
                System.out.println("Coseno(" + num1 + ") = " + Math.cos(num1));
                break;
            case 9:
                System.out.println("Tangente(" + num1 + ") = " + Math.atan(num1));
                break;
        }
    }
}
