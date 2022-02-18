/*
 * Proyecto EjerciciosProgramacionJava - Archivo Punto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaPunto;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:01:48
 */
public class Punto {

    private int x, y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    
    //METODOS =====================================================
    
    public void imprime() {
        System.out.println("(" + x + "," + y + ")");
    }
    
    
    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }
    
    
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    /*
    public int distancia(int p) {
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    */
    
    
}

