package UD3.EjerciciosCondicionales;

/*
11. Realiza un programa que pida el día de la semana (del 1 al 7) y muestre por pantalla
el día correspondiente (Lunes, martes...). Si introducimos otro número mostrará un
mensaje de error.
*/

import java.util.Scanner;

public class Ejercicio11{
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int d;
        String dia;
        
        System.out.print("Escribe el nº del día de la semana: ");
        d = lector.nextInt();
        
        switch (d) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Error";
        }
        
        System.out.print(dia);
        
    }
}
