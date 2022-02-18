package UD3.EjerciciosCondicionales;

/*
14. Escribe un programa que pida cuantas mujeres y hombres hay en un aula y muestre
el porcentaje de mujeres y hombres que hay. También mostrará un mensaje
indicando si hay más mujeres, o más hombres o si hay los mismos.
*/

import java.util.Scanner;

public class Ejercicio14{
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int chicas, chicos, total, porcentChicos, porcentChicas;
        
        System.out.println("Chicas: ");
        chicas = lector.nextInt();
        
        System.out.println("Chicos: ");
        chicos = lector.nextInt();
        
        total = chicas + chicos;
        
        porcentChicos = (chicos * 100) / total;
        porcentChicas = (chicas * 100) / total;
        
        System.out.println("Chicas: " + porcentChicas + "%");
        System.out.println("Chicos: " + porcentChicos + "%");
        
        if ( chicas > chicos ) {
            System.out.println("Hay mas chicas");
        } 
        else if ( chicos > chicas ) {
            System.out.println("Hay mas chicos");    
        } 
        else {
            
            System.out.println("Son iguales");
        }
    }
}
