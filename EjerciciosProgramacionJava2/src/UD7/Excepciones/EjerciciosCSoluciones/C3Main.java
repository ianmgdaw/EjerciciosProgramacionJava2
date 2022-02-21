package UD7.Excepciones.EjerciciosCSoluciones;


public class C3Main {

    public static void main(String[] args) {

        try {
            // Creamos varios objetos de tipo Gato
            C3Gato g1 = new C3Gato("Cati", 5);
            C3Gato g2 = new C3Gato("Miau", 3);
            C3Gato g3 = new C3Gato("Milú", 2);

            // Mostramos datos de los gatos
            System.out.println("GATOS:");
            g1.imprimir();
            g2.imprimir();
            g3.imprimir();

            // Modificamos sus datos
            g1.setNombre("Gatito");
            g1.setEdad(10);
            g2.setNombre("Do"); // Lanza excepción
            g3.setEdad(-5); // Lanza excepción

            // Mostramos datos de los gatos
            System.out.println("GATOS:");
            g1.imprimir();
            g2.imprimir();
            g3.imprimir();

        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Fin del programa");

    }
}
