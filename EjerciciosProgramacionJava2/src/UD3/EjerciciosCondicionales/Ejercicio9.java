package UD3.EjerciciosCondicionales;

/*
9.Escribe un programa que pida dos números (A y B) y muestre un mensaje por
pantalla indicando si alguno de ellos es múltiplo del otro.
*/

import java.util.Scanner;

public class Ejercicio9{
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Escribe primer número: ");
        
        num1 = lector.nextInt();
        
        System.out.print("Escribe otro número: ");
        
        num2 = lector.nextInt();
        

        if ( num1 % num2 == 0 || num2 % num1 == 0 ) {
            System.out.print("Uno de ellos es múltiplo del otro");
        }
        else {
            System.out.print("No son múltiplos");
        }
    }
}
