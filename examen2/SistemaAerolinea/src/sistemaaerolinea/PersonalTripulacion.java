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
public abstract class PersonalTripulacion {

    String nombre;

    public PersonalTripulacion(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Este personal tiene nombre: " + nombre;
    }
}
