package UD4.TareaEntregable;


import java.util.Scanner;

/*
 * Proyecto UD4TareaEntregable - Archivo CuadradoMagico.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 19 nov. 2021 11:11:55
 */
public class CuadradoMagico {

    public static void main(String[] args) {
        //Variables
        int[][] numeros;
        int[] sumaFil;
        int[] sumaCol;
        int n;
        boolean filIgual = false;
        boolean colIgual = false;

        //creamos scanner
        Scanner in = new Scanner(System.in);

        //pedimos N
        System.out.print("Dime N: ");
        n = in.nextInt();

        //creamos matriz
        numeros = new int[n][n];
        sumaFil = new int[n];
        sumaCol = new int[n];

        //pedimos valores de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Dime valor [" + i + "][" + j + "]: ");
                numeros[i][j] = in.nextInt();
            }
        }

        //Suma cada fila
        for (int i = 0; i < n; i++) {
            sumaFil[i] = 0;
            for (int j = 0; j < n; j++) {
                sumaFil[i] += numeros[i][j];
            }
            System.out.println("Suma fila " + i + ": " + sumaFil[i]);

        }
        //comprueba si las sumas de filas son iguales o no
        for (int i = 0; i < n ; i++) {
                if (sumaFil[i+1] == sumaFil[i]) {
                    filIgual = true;
                }
                else
                    filIgual = false;
        }
        
        //Suma cada columna
        for (int j = 0; j < n; j++) {
            sumaCol[j] = 0;
            for (int i = 0; i < n; i++) {
                sumaCol[j] += numeros[i][j];
            }
            System.out.println("Suma columna " + j + ": " + sumaCol[j]);

        }
        
        //comprueba si las sumas de columnas son iguales o no
        for (int i = 0; i < n ; i++) {
                if (sumaCol[i+1] == sumaCol[i]) {
                    colIgual = true;
                }
                else
                    colIgual = false;
        }

        //Es un cuadrado mágico o no.
        System.out.println("");
        if (filIgual && colIgual) {
            System.out.println("¡¡ Es un cuadrado mágico!!");
        } else {
            System.out.println("NO es un cuadrado mágico.");
        }

        /*
        //mostramos la matriz
        for (int i = 0; i < n; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
         */
    }
}
