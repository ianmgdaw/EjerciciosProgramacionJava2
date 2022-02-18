package UD3.EjerciciosCondicionales;

/*
12. Realiza un programa que pida un número entero entre uno y doce e imprima el
número de días que tiene el mes correspondiente.
*/

import java.util.Scanner;

public class Ejercicio12{
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int m;
        String dias;
        
        System.out.print("Escribe el nº del mes: ");
        m = lector.nextInt();
        
        
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = "31";
                break;
            case 4: case 6: case 9: case 11:
                dias = "30";
                break;
            case 2:
                dias = "28";
                break;
            default:
                dias = "Error";
        }
        
        System.out.print(dias);
        
    }
}
