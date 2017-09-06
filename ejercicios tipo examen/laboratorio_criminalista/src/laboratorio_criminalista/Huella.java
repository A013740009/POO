/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_criminalista;

/**
 *
 * @author Rigo Felix
 */
public  abstract class Huella {
    
    private int cantidad;
    

    public Huella(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Huella{" + "cantidad=" + cantidad + '}';
    }
    
    
    
}
