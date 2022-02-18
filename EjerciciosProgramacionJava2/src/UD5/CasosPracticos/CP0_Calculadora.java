/*
 * Proyecto EjerciciosProgramacionJava - Archivo CP0_Calculadora.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD5.CasosPracticos;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 23 nov. 2021 17:59:54
 */
public class CP0_Calculadora {

    // Muestra el menú, pide al usuario valor rango 1-9 y devuelve la opción elegida. =======================
    public static int muestraMenu() {
        System.out.println("1. Suma (A + B)\n" +
        "2. Resta (A - B)\n" +
        "3. Multiplicación (A * B)\n" +
        "4. División (A / B)\n" +
        "5. Área de un rectángulo (Base x Altura)\n" +
        "6. Área de un triángulo equilátero (Base x Altura / 2)\n" +
        "7. Área de un círculo (Pi x R²)\n" +
        "8. Seno, Coseno y Tangente (de X)\n" +
        "9. Salir.");
        Scanner in = new Scanner(System.in);
        System.out.print("Elige una opción: ");
        int opcion = in.nextInt();
        return opcion;
    }
    //========================================================================================================

    // Realiza la operación del menú indicada en 'int opcion' (1 sumar, 2 restar, etc.) ======================
    public static void realizaOperacion(int opcion) {
        switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            case 5:
                areaRectangulo();
                break;
            case 6:
                areaTrinagulo();
                break;
            case 7:
                areaCiculo();
                break;
            case 8:
                calculaSinCosTan();
                break;
        }
    }
    //========================================================================================================
    
    // Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango, devuelve el valor =
    public static int pedirIntEnRango(int min, int max) {
        Scanner in = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Dime un valor entre " + min + " y " + max + ": ");
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: Valor no válido.");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    //========================================================================================================

    // Pide A y B, calcula la suma y la muestra ==============================================================
    public static void suma() {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime A: ");
        int a = in.nextInt();
        System.out.print("Dime B: ");
        int b = in.nextInt();
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }
    //========================================================================================================

    // Pide A y B, calcula la resta y la muestra =============================================================
    public static void resta() {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime A: ");
        int a = in.nextInt();
        System.out.print("Dime B: ");
        int b = in.nextInt();
        int resultado = a - b;
        System.out.println("Resultado: " + resultado);
    }
    //=======================================================================================================

    // Pide A y B, calcula la mult y la muestra =============================================================
    public static void mult() {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime A: ");
        int a = in.nextInt();
        System.out.print("Dime B: ");
        int b = in.nextInt();
        int resultado = a * b;
        System.out.println("Resultado: " + resultado);
    }
    //=======================================================================================================

    // Pide A y B, calcula la div y la muestra ==============================================================
    public static void div() {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime A: ");
        int a = in.nextInt();
        System.out.print("Dime B: ");
        int b = in.nextInt();
        if (b != 0) {
            double resultado = (double) a / (double) b;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("ERROR: No puedo dividir por cero.");
        }
    }
    //========================================================================================================

    // Pide Base y Altura en rango 0-1Millon, calcula area rectangulo y lo muestra ===========================
    public static void areaRectangulo() {
        int base = pedirIntEnRango(0, 1000000);
        int altura = pedirIntEnRango(0, 1000000);
        int resultado = base * altura;
        System.out.println("Resultado: " + resultado);
    }
    //========================================================================================================

    // Pide Base y Altura en rango 0-1Millon, calcula area triangulo y lo muestra ============================
    public static void areaTrinagulo() {
        int base = pedirIntEnRango(0, 1000000);
        int altura = pedirIntEnRango(0, 1000000);
        double resultado = base * altura / 2.0;
        System.out.println("Resultado: " + resultado);
    }
    //========================================================================================================

    // Pide Radio en rango 0-1Millon, calcula area ciculo y lo muestra =======================================
    public static void areaCiculo() {
        int radio = pedirIntEnRango(0, 1000000);
        double resultado = Math.PI * radio * radio;
        System.out.println("Resultado: " + resultado);
    }
    //========================================================================================================

    // Pide X en rango -360 a 360, calcula y muestra Sin, Cos y Tan de X =====================================
    public static void calculaSinCosTan() {
        int x = pedirIntEnRango(-360, 360);
        System.out.println("Sin: " + Math.sin(x));
        System.out.println("Cos: " + Math.cos(x));
        System.out.println("Tan: " + Math.tan(x));
    }
    //========================================================================================================

    // Main principal
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = muestraMenu();
            realizaOperacion(opcion);
            System.out.println("");
        } while (opcion != 9);
    }

}
