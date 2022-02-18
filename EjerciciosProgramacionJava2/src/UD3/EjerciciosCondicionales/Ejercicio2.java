package UD3.EjerciciosCondicionales;


/*
2. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
mayor de edad” o el mensaje de “Eres menor de edad”.
*/
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int edad;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe una edad: ");
        
        edad = lector.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        
        else {
            System.out.println("Eres menor de edad.");
        }
    }
}