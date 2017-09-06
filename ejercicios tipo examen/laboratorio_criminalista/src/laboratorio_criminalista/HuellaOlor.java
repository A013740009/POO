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
public class HuellaOlor extends Huella{
    
    private String fechaVen;

    public HuellaOlor(String fechaVen, int cantidad) {
        super(cantidad);
        this.fechaVen = fechaVen;
    }

    public String getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }

    @Override
    public String toString() {
       return "Fecha de vencimiento"+ fechaVen + '}';
        }        
    
    
    
    
}
