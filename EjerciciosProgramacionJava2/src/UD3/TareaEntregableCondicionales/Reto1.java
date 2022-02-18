package UD3.TareaEntregableCondicionales;
import java.util.Scanner;

/**
 * @author a044774858e
 */
public class Reto1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int riesgoInicial = 5, numFactores = 0;
        double riesgoFinal = 0, multiFactores;
        boolean resultado = false;

        System.out.println("Si lo tiene escribir 'true', sino 'false'.");

        System.out.println("¿Presión arterial alta?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 15;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Colestrol elevado?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 15;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Tiene diabetes?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 10;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Tiene Obesidad?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 10;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Tabaquismo?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 10;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Inactividad física?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 10;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Sexo masculino?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 5;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Familiares con enfermedades del corazón?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 5;
            numFactores = numFactores + 1;
            resultado = false;
        }

        System.out.println("¿Edad superior a 55 años?: ");
        resultado = lector.nextBoolean();
        if (resultado == true) {
            riesgoInicial = riesgoInicial + 5;
            numFactores = numFactores + 1;
            resultado = false;
        }

        //Efecto multiplicador según el nº de factores de riesgo.
        switch (numFactores) {
            case 2:
                multiFactores = 1.25;
                break;
            case 3: case 4:
                multiFactores = 1.5;
                break;
            case 5: case 6:
                multiFactores = 1.75;
                break;
            case 7: case 8:
                multiFactores = 2.0;
                break;
            case 9:
                multiFactores = 2.5;
                break;
            default:
                multiFactores = 1;
        }

        riesgoFinal = riesgoInicial * multiFactores;

        System.out.println("Riesgo inicial: " + riesgoInicial);
        System.out.println("Efecto multiplicador: x" + multiFactores);
        System.out.println("Riesgo final: " + riesgoFinal);
    }
}
