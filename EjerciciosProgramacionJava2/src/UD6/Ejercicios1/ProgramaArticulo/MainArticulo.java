/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainArticulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios1.ProgramaArticulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:34:40
 */
public class MainArticulo {

    public static void main(String[] args) {

        Articulo art1 = new Articulo("TV", 100, 21, 10);

        //System.out.println(art1.imprimirArticulo());
        
        System.out.println(art1.getNombre() + " - Precio:" + art1.getPrecio() + "€ - IVA:" + art1.getIva() + "% - PVP:" + art1.pvp() + "€");
        System.out.println("");
        
        
        
        art1.setNombre("TV Xiaomi");
        art1.setIva(10);
        art1.setPrecio(200);
        System.out.println(art1.getNombre() + " - Precio:" + art1.getPrecio() + "€ - IVA:" + art1.getIva() + "% - PVP:" + art1.pvp() + "€");
        
        
        
        
        
        
        
        
    }
}
