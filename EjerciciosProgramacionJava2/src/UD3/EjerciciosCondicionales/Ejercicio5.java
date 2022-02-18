package UD3.EjerciciosCondicionales;


/*
5. Escribe un programa que lee dos números y los visualiza en orden ascendente.
*/

import java.util.Scanner;

public class Ejercicio5{
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        
        num1 = lector.nextInt();
        
        System.out.print("Escribe otro número: ");
        
        num2 = lector.nextInt();
        
        if ( num1 < num2 ) {
            System.out.println( num2 + " > " + num1);
        }
        
        else {
            System.out.println( num1 + " > " + num2);
        }
    }
}