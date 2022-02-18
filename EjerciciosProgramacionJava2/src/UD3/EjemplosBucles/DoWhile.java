/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD3.EjemplosBucles;

import java.util.Scanner;

/**
 *
 * @author a044774858e
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota, total = 0;

        do {
            System.out.println("Dime una nota: ");
            nota = in.nextInt();
            total += nota;
        } while (nota != 0);

        System.out.println("Total: " + total);
    }
}
