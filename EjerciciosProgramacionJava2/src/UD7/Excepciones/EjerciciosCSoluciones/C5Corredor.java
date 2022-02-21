package UD7.Excepciones.EjerciciosCSoluciones;

public class C5Corredor {

    private int energia;

    public C5Corredor(int e) {
        energia = e;
    }

    public int getEnergia() {
        return energia;
    }

    public void recargarEnergia(int e) {
        energia += e;
    }

    public void correr() throws C5AgotadoException {
        if (energia >= 10) {
            energia -= 10;
            System.out.println("Energia: " + energia);
        } else {
            C5AgotadoException x = new C5AgotadoException("Sin energía....  Plof!");
            throw x;
        }
    }

    // Main para realizar pruebas y comprobar que la clase Corredor funciona
    public static void main(String[] args) {
        //Creo corredor con una energia de 25
        C5Corredor pepe = new C5Corredor(25);
        System.out.println("Energia: " + pepe.energia);
        //Recargo energia en 5 y muestro por pantalla
        pepe.recargarEnergia(5);
        System.out.println("Energia: " + pepe.energia);
        //Corro hasta que se queda sin energia para comprobar que la excepción salta correctamente
        try {
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
            pepe.correr();
        } catch (C5AgotadoException a) {
            System.err.println(a.getMessage());
        }
    }
}
