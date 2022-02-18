package UD3.EjerciciosCondicionales;


/*
1. Escribe un programa que pide la edad por teclado y muestre el mensaje de “Eres
mayor de edad” si lo somos.
*/
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int edad;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe una edad: ");
        
        edad = lector.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
    }
}