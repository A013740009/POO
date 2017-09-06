/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaaerolinea;

import java.util.ArrayList;

/**
 *
 * @author Eric Gómez Vázquez--A01378838
 */
public class Vuelo {

    private String codigo;
    private String origen;
    private String destino;
    private ArrayList<PersonalTripulacion> personal;

    public Vuelo(String codigo) {
        this.codigo = codigo;
        personal = new ArrayList<PersonalTripulacion>();
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public ArrayList<PersonalTripulacion> getPersonal() {
        return personal;
    }

    public void agregarPersonalTripulacion(PersonalTripulacion personalTripulacion) {
        personal.add(personalTripulacion);
    }

   
    @Override
    public String toString() {
        String info = "Codigo del Vuelo: " + codigo + "\n";
        info += "Origen del vuelo es: " + origen + "\n";
        info += "Destino del vuelo: " + destino + "\n";
        for (PersonalTripulacion i : personal) {
            info += i.toString() + "\n";
        }
        return info;
    }
}
