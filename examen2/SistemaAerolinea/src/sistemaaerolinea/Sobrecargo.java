/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaaerolinea;

/**
 *
 * @author Eric Gómez Vázquez--A01378838
 */
public class Sobrecargo extends PersonalTripulacion {

    private boolean esInternacional;
    
    
    public void setEsInternacional(boolean esInternacional) {
        this.esInternacional = esInternacional;
    }

    public boolean isEsInternacional() {
        return esInternacional;
    }

    public Sobrecargo(boolean esInternacional, String nombre) {
        super(nombre);
        this.esInternacional = esInternacional;
    }

    @Override
    public String toString() {
        return "la sobrecargo es internacional= "+ esInternacional+" y se llama "+super.toString();
    }
}
