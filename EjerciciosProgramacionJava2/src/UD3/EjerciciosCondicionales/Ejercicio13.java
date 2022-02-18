package UD3.EjerciciosCondicionales;

/*
13. Escribe un programa que lea la temperatura en centígrados (entero) del día e imprima
el tipo de clima de acuerdo a la siguiente lista:
◦ Temperatura menor que 10 => Frío
◦ Temperatura entre 10 y 19 => Templado
◦ Temperatura entre 20 y 29 => Caluroso
◦ Temperatura mayor que 29 => Tropical
*/

import java.util.Scanner;

public class Ejercicio13{
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int grados;
        String clima;

        System.out.println("Escribe la temperatura: ");
        grados = lector.nextInt();
        
        if ( grados < 10 ) {
            clima = "Frío";
        }
        else if ( grados <= 19 ) {
            clima = "Templado";
        }
        else if ( grados <= 29 ) {
            clima = "Caluroso";
        }
        else {
            clima = "Tropical";
        }
        
        System.out.println(clima);
        
    }
}
