package UD4.EjerciciosMatrices;

/*
 * Proyecto UD4 - Archivo EjerMatrices1.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 12:58:03
 */
/*
1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del
1 al 25 y luego muestre la matriz por pantalla.
 */
public class EjerMatrices1 {

    public static void main(String[] args) {
        //VARIABLES
        int[][] numeros = new int[5][5];
        int contador = 1;

        //RELLENAMOS LA MATRIZ CON LOS NÚMEROS DEL 1 AL 25
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = contador;
                contador++;
            }
        }

        //MOSTRAMOS LA MATRIZ
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
