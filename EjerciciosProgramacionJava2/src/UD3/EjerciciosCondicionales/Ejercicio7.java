package UD3.EjerciciosCondicionales;


/*
7. Escribe un programa que lea tres números enteros y nos diga cuál es el mayor.
*/

import java.util.Scanner;

public class Ejercicio7{
    
    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe primer número: ");
        
        num1 = lector.nextInt();
        
        System.out.print("Escribe segundo número: ");
        
        num2 = lector.nextInt();
        
        System.out.print("Escribe tercer número: ");
        
        num3 = lector.nextInt();
        
        if ( num1 > num2 ) {
            if ( num1 > num3 ) {
                System.out.println("El número mayor es " + num1);
            }
            else {
                System.out.println("El número mayor es " + num3);
            }
        }
        else if ( num2 > num3 ) {
            System.out.println("El número mayor es " + num2);
        }
        else {
            System.out.println("El número mayor es " + num3);
        }
    }
}