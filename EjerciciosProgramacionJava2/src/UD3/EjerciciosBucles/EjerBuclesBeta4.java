/*
 * Proyecto UD3 - Archivo EjerBuclesBeta4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3.EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:19:16
 */

/*
 * 4.Escribe un programa que lea una secuencia de notas (valores enteros de 0 a 10) 
 * hasta que el usuario introduzca un -1, y luego muestre la suma total, la media y si 
 * alguna nota fué un 10.
*/
public class EjerBuclesBeta4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int suma=0, cont=0, nota;
        double media;
        boolean media10 = false;
        
        do {
            System.out.println("Escribe la nota: ");
            nota = lector.nextInt();
            
            if (nota >= 0) {
                suma += nota;     
                cont++;
            }
            if (nota == 10) {
                media10 = true;
            }
            
            
        } while (nota != -1);
        
        media = (double)suma / (double)cont;
        
        System.out.println("Suma : " + suma);
        System.out.println("Media: " + media);
        
        if (media10)
            System.out.println("Hubo algún diez");
        else
            System.out.println("No hubo diez");
        
    }
}
