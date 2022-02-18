package UD3.TrabajoStarWars;


import java.util.Scanner;

/*
 * Proyecto StarWarsCodigosSecretos - Archivo StartWars.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 19:14:33
 */
public class StartWars {

    public static void main(String[] args) {
        //VARIABLES
        int sumatorio = 0, productorio = 1, fact = 1, esPrimo = 1, mult = 0;

        Scanner lector = new Scanner(System.in);

        // INICIO
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa\n"
                + "Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\n"
                + "en una nave imperial robada en una misión secreta para infiltrarse\n"
                + "en otra estrella de la muerte que el imperio está construyendo\n"
                + "para destruirla. (Presiona Intro para continuar)");
        lector.nextLine();

        // ================== NIVEL 1 ===========================
        //Números aleatorios
        int S1, S2;
        S1 = (int) (1 + Math.random() * (10 - 1 + 1));
        S2 = (int) (20 + Math.random() * (30 - 20 + 1));

        //Operación
        for (int i = S1; i <= S2; i++) {
            sumatorio += i;
        }

        System.out.println("=== NIVEL 1 ===");
        System.out.println("Los problemas empiezan cuando deben realizar un salto\n"
                + "hiperespacial hasta el sistema estelar " + S1 + " en el sector " + S2 + ", pero el\n"
                + "control de navegación está estropeado y el computador tiene\n"
                + "problemas para calcular parte de las coordenadas de salto.\n"
                + "Chewbacca, piloto experto, se da cuenta que falta el cuarto\n"
                + "número de la serie. Recuerda de sus tiempos en la academia de\n"
                + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                + "nº del sistema y el nº del sector (ambos inclusive). ¿Qué debe\n"
                + "introducir?");

        //System.out.println("****** SOLUCIÓN: " + sumatorio);

        //Leer respuesta del nivel 1
        int respuesta = lector.nextInt();

        // ================== NIVEL 2 ===========================
        // Comprueba si la respuesta del nivel 1 correcta o no. 
        if (respuesta == sumatorio) { //si es correcta sigue nivel 2

            //Números aleatorios
            int P1, P2;
            P1 = (int) (1 + Math.random() * (7 - 1 + 1));
            P2 = (int) (8 + Math.random() * (12 - 8 + 1));

            //Operación
            for (int i = P1; i <= P2; i++) {
                productorio *= i;
            }

            System.out.println("=== NIVEL 2 ===");
            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n"
                    + "lo lejos la estrella de la muerte. Como van en una nave imperial\n"
                    + "robada se aproximan lentamente con la intención de pasar\n"
                    + "desapercibidos. De  repente suena el comunicador. “Aquí agente\n"
                    + "de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + ". No están\n"
                    + "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n"
                    + "comunicador e improvisa.  Eh... tenemos un fallo en el... eh...\n"
                    + "condensador de fluzo... Solicitamos permiso para atracar y\n"
                    + "reparar la nave”. El agente, que no se anda con tonterías,\n"
                    + "responde “Proporcione código de acceso o abriremos fuego”. Han\n"
                    + "Solo ojea rápidamente el manual del piloto que estaba en la\n"
                    + "guantera y da con la página correcta. El código es el productorio\n"
                    + "entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                    + "¿Cuál es el código?");

            // System.out.println("****** SOLUCIÓN: " + productorio);

        } else { //si no es correcta pues se acaba el juego
            System.out.println("\nEse no era el código correcto... La misión ha sido un fracaso... :(:(:(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                    + "intentarlo!\n");
            System.out.println("Gracias por jugar");
            System.exit(0);

        }

        //Leer respuesta del nivel 2
        int respuesta2 = lector.nextInt();

        // ================== NIVEL 3 ===========================
        // Comprueba si la respuesta del nivel 2 correcta o no. 
        if (respuesta2 == productorio) { //si es correcta sigue nivel 3

            //Números aleatorios
            int N;
            N = (int) (50 + Math.random() * (100 - 50 + 1));
            double N2 = N / 10;
            // Operación
            int NRedondeando = (int) Math.floor(N2);

            for (int i = NRedondeando; i >= 1; i--) {
                fact *= i;
            }

            System.out.println("=== NIVEL 3 ===");
            System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de\n"
                    + "la muerte, se equipan con trajes de soldados imperiales que\n"
                    + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                    + "deben averiguar en qué nivel de los " + N + " existentes se encuentra el\n"
                    + "reactor principal. Se dirigen al primer panel computerizado que\n"
                    + "encuentran y la Princesa Leia intenta acceder a los planos de la\n"
                    + "nave pero  necesita introducir una clave de acceso. Entonces\n"
                    + "recuerda la información que le proporcionó Lando Calrissian “La\n"
                    + "clave de acceso a los planos de la nave es el factorial de N/10\n"
                    + "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
                    + "¿Cual es el nivel correcto?");

            //System.out.println("****** SOLUCIÓN: " + fact);
            
        } else { //si no es correcta pues se acaba el juego
            System.out.println("\nEse no era el código correcto... La misión ha sido un fracaso... :(:(:(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                    + "intentarlo!\n");
            System.out.println("Gracias por jugar");
            System.exit(0);
        }

        //Leer respuesta del nivel 3
        int respuesta3 = lector.nextInt();

        // ================== NIVEL 4 ===========================       
        // Comprueba si la respuesta del nivel 4 correcta o no. 
        if (respuesta3 == fact) { //si es correcta sigue nivel 4

            //Números aleatorios
            int P;
            P = (int) (10 + Math.random() * (100 - 10 + 1));

            //Operación
            for (int i = 2; i <= P / 2; i++) {
                if ((P % i) == 0) {
                    esPrimo = 0;
                } else {
                    esPrimo = 1;
                }
            }

            System.out.println("=== NIVEL 4 ===");
            System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y\n"
                    + "encuentran la puerta acorazada que da al reactor principal. R2D2\n"
                    + "se conecta al panel de acceso para intentar hackear el sistema y\n"
                    + "abrir la puerta. Para desencriptar la clave necesita verificar si el\n"
                    + "número " + P + " es primo o no. Si es primo introduce un 1, si no lo es\n"
                    + "introduce un 0.");

            //System.out.println("****** SOLUCIÓN: " + esPrimo);

        } else { //si no es correcta pues se acaba el juego
            System.out.println("\nEse no era el código correcto... La misión ha sido un fracaso... :(:(:(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                    + "intentarlo!\n");
            System.out.println("Gracias por jugar");
            System.exit(0);
        }

        //Leer respuesta del nivel 4
        int respuesta4 = lector.nextInt();

        // ================== NIVEL 5 ===========================       
        // Comprueba si la respuesta del nivel 5 correcta o no.
        if (respuesta4 == esPrimo) {

            //Números aleatorios
            int M, S;
            int multM = 1, multS = 1;
            M = (int) (5 + Math.random() * (10 - 5 + 1));
            S = (int) (5 + Math.random() * (10 - 5 + 1));

            //Operaciones
            for (int i = 1; i <= M; i++) {
                multM *= i;
            }
            for (int i = 1; i <= S; i++) {
                multS *= i;
            }
            mult = multM + multS;

            System.out.println("=== NIVEL 5 ===");
            System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n"
                    + "coloque la bomba, programe el temporizador y salir de allí\n"
                    + "corriendo. Necesita programarlo para que explote en exactamente\n"
                    + M + " minutos y  " + S + " segundos, el tiempo suficiente para escapar antes\n"
                    + "de que explote pero sin que el sistema de seguridad anti-\n"
                    + "explosivos detecte y desactive la bomba. Pero el temporizador\n"
                    + "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n"
                    + "minutos y segundos al sistema Zordgiano hay que sumar el\n"
                    + "factorial de " + M + " y el factorial de " + S + ". ¿Qué valor debe introducir?");

            // System.out.println("****** SOLUCIÓN: " + mult);

        } else { //si no es correcta pues se acaba el juego
            System.out.println("\nEse no era el código correcto... La misión ha sido un fracaso... :(:(:(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                    + "intentarlo!\n");
            System.out.println("Gracias por jugar");
            System.exit(0);
        }

        //Leer respuesta del nivel 5
        int respuesta5 = lector.nextInt();

        // ================== GANAR ===========================       
        // Comprueba si la respuesta del nivel 5 correcta o no.
        if (respuesta5 == mult) {
            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n"
                    + "temporizador y empiezan a sonar las   alarmas. Salen de allí\n"
                    + "corriendo, no hay tiempo que perder. La nave se convierte  en un\n"
                    + "hervidero de soldados de arriba a abajo y entre el caos que les\n"
                    + "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n"
                    + "medida que se alejan observan por la ventana la imagen de la\n"
                    + "colosal estrella de la muerte explotando en el silencio del espacio,\n"
                    + "desapareciendo para siempre junto a los restos del malvado\n"
                    + "imperio.\n"
                    + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n"
                    + "Enhorabuena ;D");
            System.out.println("Gracias por jugar");
            
        } else { //si no es correcta pues se acaba el juego
            System.out.println("\nEse no era el código correcto... La misión ha sido un fracaso... :(:(:(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                    + "intentarlo!\n");
            System.out.println("Gracias por jugar");
            System.exit(0);
        }

    }
}
