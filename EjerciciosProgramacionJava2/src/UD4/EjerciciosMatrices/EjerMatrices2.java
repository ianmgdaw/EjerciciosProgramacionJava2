package UD4.EjerciciosMatrices;

/*
 * Proyecto UD4 - Archivo EjerMatrices2.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 13:18:48
 */
/*
2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
pantalla.
 */
public class EjerMatrices2 {

    public static void main(String[] args) {
        int[][] numeros = new int[10][10];

        //Rellenamos la matriz con las tablas de multiplicadar
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (i + 1) * (j + 1);
            }
        }

        //Mostramos la matriz.
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Tabla del " + (i + 1) + ": ");
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
