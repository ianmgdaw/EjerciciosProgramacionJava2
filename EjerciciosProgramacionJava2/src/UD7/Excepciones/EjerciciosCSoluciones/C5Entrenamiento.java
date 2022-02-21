package UD7.Excepciones.EjerciciosCSoluciones;

public class C5Entrenamiento {

    // Hace correr al corredor sin parar hasta que se agote
    public static void agotar(C5Corredor c) {
        try {
            while (true)
                c.correr();
        } catch (C5AgotadoException a) {
            System.out.println(a.getMessage());
        }

    }

    public static void main(String[] args) {
        C5Corredor paco = new C5Corredor(50);
        agotar(paco);
        paco.recargarEnergia(30);
        agotar(paco);
        paco.recargarEnergia(10);
        agotar(paco);
        System.out.println("Entrenamiento terminado");
    }
}
