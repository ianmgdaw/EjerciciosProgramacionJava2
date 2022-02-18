package UD3.EjerciciosCondicionales;

/*
10. Escribe un programa que pida introducir dos números decimales y luego muestre el
valor de su suma, resta, producto y división. Se deberá evitar dividir por cero.
*/

import java.util.Scanner;

public class Ejercicio10{
    
    public static void main(String[] args) {
        
        double num1, num2;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe primer número: ");
        
        num1 = lector.nextDouble();
        
        System.out.print("Escribe otro número: ");
        
        num2 = lector.nextDouble();
        
        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        
        if ( num2 != 0) {
            double division = num1 / num2;
            System.out.println("División: " + division);
        }
        else {
            System.out.println("No se puede dividir por 0.");
        }
    }
}
