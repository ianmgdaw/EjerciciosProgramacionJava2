package UD3.EjerciciosCondicionales;


/*
4. Escribe un programa que pida un número y me dice si es positivo o negativo.
Consideraremos el cero como positivo.*/

import java.util.Scanner;

public class Ejercicio4{
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        
        num = lector.nextInt();
        
        if ( num >= 0) {
            System.out.println("El número es positivo.");
        }
        
        else {
            System.out.println("El número es negativo.");
        }
        
    }
}