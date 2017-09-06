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
public class HuellaTrazologica extends Huella {
    
    private String superficie;

    public HuellaTrazologica(String superficie, int cantidad) {
        super(cantidad);
        this.superficie = superficie;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Superfice de las huellas " + superficie ;
    }
    
    
    
}
