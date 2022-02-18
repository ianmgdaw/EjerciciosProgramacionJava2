package UD3.EjerciciosCondicionales;

/*
8. Escribe un programa que pida dos números (A y B) y muestre un mensaje por
pantalla indicando si A es mútiplo de B.
*/

import java.util.Scanner;

public class Ejercicio8{
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe primer número: ");
        
        num1 = lector.nextInt();
        
        System.out.print("Escribe otro número: ");
        
        num2 = lector.nextInt();
        

        if ( num1 % num2 == 0 ) {
            System.out.print("El número " + num1 + " es múltiplo de " + num2);
        }
        else {
            System.out.print("El número " + num1 + " no es múltiplo de " + num2);
        }
    }
}
