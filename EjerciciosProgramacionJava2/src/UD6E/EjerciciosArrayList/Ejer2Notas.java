/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer2Notas.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6E.EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 feb. 2022 21:06:28
 */
public class Ejer2Notas {

    public static void main(String[] args) {
        
        int nota = 0;
        int suspendidos = 0;
        int aprobados = 0;
        double media = 0.0;
        boolean hay10 = false;
        boolean hay0 = false;
        
        ArrayList<Integer> notas = new ArrayList();
        
        Scanner lector = new Scanner(System.in);
                
        do {
            System.out.print("Escribe una nota: ");
            nota = lector.nextInt();
            
            if (nota >= 0 && nota <= 10) {
                notas.add(nota);
            } else {
                System.err.println("La nota debe ser entre 0 y 10.");
            }
        } while (nota != -1);
        
        
        //Mostrar
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < 5) {
                suspendidos++;
            }
            if (notas.get(i) >= 5) {
                aprobados++;
            }
            if (notas.get(i) == 0) {
                hay0 = true;
            }
            if (notas.get(i) == 10) {
                hay10 = true;
            }
            media += notas.get(i);
            System.out.println("Nota " + i + ": " + notas.get(i));
        }
        media = media / notas.size();
        
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);
        if (hay0) {
            System.out.println("Hay algún 0.");
        } else {
            System.out.println("No hay algún 0.");
        }
        if (hay10) {
            System.out.println("Hay algún 10.");
        } else {
            System.out.println("No hay algún 10.");
        }
        System.out.println("Nota media: " + media);
        
    }
}
