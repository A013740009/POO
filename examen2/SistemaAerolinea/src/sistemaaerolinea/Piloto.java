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
public class Piloto extends PersonalTripulacion {

    private int cantidadCertificados;

    public Piloto(int cantidadCertificados, String nombre) {
        super(nombre);
        this.cantidadCertificados = cantidadCertificados;
    }

    public int getCantidadCertificados() {
        return cantidadCertificados;
    }

    public void setCantidadCertificados(int cantidadCertificados) {
        this.cantidadCertificados = cantidadCertificados;
    }

    @Override
    public String toString() {
        return "El piloto tiene " + cantidadCertificados+" certificados" +"y se llama "+super.toString();
    }
}
