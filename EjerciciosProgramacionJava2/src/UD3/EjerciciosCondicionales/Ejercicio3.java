package UD3.EjerciciosCondicionales;


/*
3. Escribe un programa que pida 2 números enteros y muestre el mayor.
*/
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        
        num1 = lector.nextInt();
        
        System.out.print("Escribe otro número: ");
        
        num2 = lector.nextInt();
        
        if ( num1 > num2) {
            System.out.println("El número mayor es " + num1);
        }
        
        else {
            System.out.println("El número mayor es " + num2);
        }
    }
}