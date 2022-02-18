package UD4.EjerciciosMatrices;


import java.util.Scanner;

/*
 * Proyecto UD4 - Archivo EjerMatrices3.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 13:37:24
 */
/*
3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
que cero, cuántos son menores que cero y cuántos son igual a cero.
*/
public class EjerMatrices3 {
    public static void main(String[] args) {
        //variables
        int [][] numeros;
        int n, m, mayor=0, menor=0, igual=0;
        
        //creamos scanner
        Scanner in = new Scanner(System.in);

        //pedimos N y M (tamaño de la matriz)
        System.out.print("Dime N: ");
        n = in.nextInt();
        System.out.print("Dime M: ");
        m = in.nextInt();

        //creamos la matriz
        numeros = new int[n][m];

        //pedimos valores de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Dime valor [" + i + "][" + j + "]: ");
                numeros[i][j] = in.nextInt();
            }
        }
    
        //mostramos la matriz
        for (int i = 0; i < n; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < m; j++) {
                System.out.print(numeros[i][j] + " ");
                if (numeros[i][j] > 0) {
                    mayor++;
                }
                else if (numeros[i][j] <0){
                    menor++;
                }
                else 
                    igual++;
            }
            System.out.println("");
            System.out.println("Numeros mayores de 0: " + mayor);
            System.out.println("Numeros menores de 0: " + menor);
            System.out.println("Numeros iguales 0: " + igual);
        }
    }
}
