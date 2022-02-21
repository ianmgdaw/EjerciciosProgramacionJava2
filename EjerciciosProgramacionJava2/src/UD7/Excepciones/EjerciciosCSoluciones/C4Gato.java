package UD7.Excepciones.EjerciciosCSoluciones;


public class C4Gato {

    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public C4Gato(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("ERROR: El nombre debe tener al menos 3 carácteres");
        }

        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("ERROR: La edad no puede ser negativa");
        }

        this.edad = edad;
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("El gato se llama " + this.getNombre() + " y tiene " + this.getEdad() + " años de edad");
    }

}
