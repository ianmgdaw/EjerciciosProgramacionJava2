package UD3.EjerciciosCondicionales;

/*
15. Escribe programa que pida las 3 notas (números enteros) de un alumno y luego
muestre su nota final, calculada como la nota media expresada como un entero y
redondeada al valor entero más próximo. Téngase en cuenta también que si alguna
de las 3 notas es inferior a 5 la nota final debe ser como máximo un 4.
 */

/**
 *
 * @author Ian Molina
 */
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Creamos el Scanner
        Scanner lector = new Scanner(System.in);
        
        //Variables
        int nota1, nota2, nota3;
        double notaMedia;
        int notaRedondeada;
        int notaFinal;
        
        
        //Pedir las notas
        System.out.println("Escribe la nota de 1ª evaluación: ");
        nota1 = lector.nextInt();
        System.out.println("Escribe la nota de 2ª evaluación: ");
        nota2 = lector.nextInt();
        System.out.println("Escribe la nota de 3ª evaluación: ");
        nota3 = lector.nextInt();
        
        //Calculamos nota media y redondeada
        notaMedia = (nota1 + nota2 + nota3) / 3.0;
        notaRedondeada = (int) Math.round(notaMedia);
        
        //Calculamos nota final
        if (nota1 < 5 || nota2 < 5 || nota3 < 5)
            notaFinal = Math.min(notaRedondeada, 4);
        else
            notaFinal = notaRedondeada;
                
        // Mostramos
        System.out.println("Nota media     : " + notaMedia);
        System.out.println("Nota redondeada: " + notaRedondeada);
        System.out.println("Nota final     : " + notaFinal);
    }
}
