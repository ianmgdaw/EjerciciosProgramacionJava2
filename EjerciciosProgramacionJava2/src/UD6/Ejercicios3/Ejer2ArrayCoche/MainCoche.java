/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainCoche.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios3.Ejer2ArrayCoche;

import UD6.Ejercicios3.Ejer2ArrayCoche.Coche.modalidadSeguro;
import UD6.Ejercicios3.Ejer2ArrayCoche.Coche.tipoCoche;
import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 20 ene. 2022 19:26:24
 */
public class MainCoche {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //CREAR ARRAY
        Coche[] arrayCoche = new Coche[3];

        for (int i = 0; i < arrayCoche.length; i++) {

            System.out.println("Coche " + i);

            System.out.print("Modelo: ");
            String modelo = lector.nextLine();
            lector.nextLine();

            System.out.print("Color: ");
            String color = lector.nextLine();

            System.out.print("¿Pintura metalizada? true o false: ");
            boolean pinturaMetalizada = lector.nextBoolean();

            System.out.print("Matrícula: ");
            String matricula = lector.nextLine();

            lector.nextLine();
            System.out.print("Año de fabricación: ");
            int anyoFabricacion = lector.nextInt();

            System.out.print("Tipo de coche (1. Mini, 2. Utilitario, 3. Familiar, 4. Deportivo): ");
            int tipoInt = lector.nextInt();
            tipoCoche tipo = null;
            switch (tipoInt) {
                case 1:
                    tipo = tipoCoche.MINI;
                    break;
                case 2:
                    tipo = tipoCoche.UTILITARIO;
                    break;
                case 3:
                    tipo = tipoCoche.FAMILIAR;
                    break;
                case 4:
                    tipo = tipoCoche.DEPORTIVO;
                    break;
            }

            System.out.print("Modalidad de seguro (1. Terceros, 2. Todo riesgo): ");
            int modalidadInt = lector.nextInt();
            modalidadSeguro seguro;
            if (modalidadInt == 1) {
                seguro = modalidadSeguro.TERCEROS;
            } else {
                seguro = modalidadSeguro.TODO_RIESGO;
            }
            System.out.println("");

            arrayCoche[i] = new Coche(modelo, color, pinturaMetalizada, matricula, anyoFabricacion, tipo, seguro);

        }

        for (int i = 0; i < arrayCoche.length; i++) {
            arrayCoche[i].imprime();
        }

        //VARIABLES
        int contMetalizada = 0;
        int antiguo = 0;
        int segTercero = 0;
        int segTodo = 0;

        //CREAR ARRAY
        Coche[] arrayCoche = new Coche[3];

        for (int i = 0; i < arrayCoche.length; i++) {

            System.out.println("Coche " + i);

            System.out.print("Modelo: ");
            String modelo = lector.nextLine();
            lector.nextLine();

            System.out.print("Color: ");
            String color = lector.nextLine();

            System.out.print("¿Pintura metalizada? true o false: ");
            boolean pinturaMetalizada = lector.nextBoolean();

            System.out.print("Matrícula: ");
            String matricula = lector.nextLine();

            lector.nextLine();
            System.out.print("Año de fabricación: ");
            int anyoFabricacion = lector.nextInt();

            System.out.print("Tipo de coche (1. Mini, 2. Utilitario, 3. Familiar, 4. Deportivo): ");
            int tipoInt = lector.nextInt();
            tipoCoche tipo = null;
            switch (tipoInt) {
                case 1:
                    tipo = tipoCoche.MINI;
                    break;
                case 2:
                    tipo = tipoCoche.UTILITARIO;
                    break;
                case 3:
                    tipo = tipoCoche.FAMILIAR;
                    break;
                case 4:
                    tipo = tipoCoche.DEPORTIVO;
                    break;
            }

            System.out.print("Modalidad de seguro (1. Terceros, 2. Todo riesgo): ");
            int modalidadInt = lector.nextInt();
            modalidadSeguro seguro;
            if (modalidadInt == 1) {
                seguro = modalidadSeguro.TERCEROS;
            } else {
                seguro = modalidadSeguro.TODO_RIESGO;
            }
            System.out.println("");

            arrayCoche[i] = new Coche(modelo, color, pinturaMetalizada, matricula, anyoFabricacion, tipo, seguro);

        }

        for (int i = 0; i < arrayCoche.length; i++) {
            arrayCoche[i].imprime();
            if (arrayCoche[i].getPintura()) {
                contMetalizada++;
            }
            if (arrayCoche[i].getAnyoFabricacion() < 2000) {
                antiguo++;
            }
            if (arrayCoche[i].getSeguro() == modalidadSeguro.TERCEROS) {
                segTercero++;
            } else {
                segTodo++;
            }
        }

        //PRINTLN
        System.out.println("Coches con pintura metalizada: " + contMetalizada);
        System.out.println("Coches fabricados antes de año 2000: " + antiguo);
        System.out.println("Seguro todo riesgo: " + segTodo);
        System.out.println("Seguro terceros: " + segTercero);

    }
}
