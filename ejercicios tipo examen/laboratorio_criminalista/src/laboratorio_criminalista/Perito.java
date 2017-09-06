/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_criminalista;

import java.util.ArrayList;

/**
 *
 * @author Rigo Felix
 */
public class Perito {

    private String nombre;
    private int año;
    private ArrayList<Caso> casos;

    public Perito(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
        casos = new ArrayList<Caso>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public ArrayList<Caso> getCaso() {
        return casos;
    }

    public void añadirCaso(Caso caso) {
        casos.add(caso);
    }

    @Override
    public String toString() {
        String info = "Nombre del Perito: " + nombre + "\n";
        info += "\n Anno de alta del perito: " + año + "\n";
        info += "\n Información de los casos del perito: \n";
        for (Caso c : casos) {
            info += c.toString() + "\n";
        }
        return info;
    }

}
