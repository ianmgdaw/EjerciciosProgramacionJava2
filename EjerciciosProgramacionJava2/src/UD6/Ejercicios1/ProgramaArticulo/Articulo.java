/*
 * Proyecto EjerciciosProgramacionJava - Archivo Articulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaArticulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:34:28
 */
public class Articulo {
    
    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;
    private double pvp, ivaEnEuros;
    
    
    
    //CONSTRUCTOR
    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    } 
    
    public int getIva(){
        return iva;
    }
    
    public int getCuantosQuedan(){
        return cuantosQuedan;
    }
    

    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio){
        if (precio > 0) {
            this.precio = precio;
        } else
            System.err.println("ERROR: Precio");
    }
    
    public void setIva(int iva){
        if (iva > 0) {
            this.iva = iva;
        } else
            System.err.println("ERROR: IVA");
    }
    
    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan < 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else
            System.err.println("ERROR: Cuantos quedan");
    }
    
       
    //METODOS
    public double getPVP(){
        ivaEnEuros = ((precio * iva) / 100);
        pvp = precio + ivaEnEuros;
        return pvp;
    }
    
    public double getPVPDescuento(int d){
        
    }
    
    public String imprime(){
        return nombre + " - Precio:" + precio + "€ - IVA:" + iva + "% - PVP:" + getPVP() + "€";
    }
    
    
    
}
