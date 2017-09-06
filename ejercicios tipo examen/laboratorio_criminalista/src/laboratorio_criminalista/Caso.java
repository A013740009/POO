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
public class Caso {
    
    private String codigo;
    private ArrayList <Huella> huellas = new ArrayList<Huella>();

    public Caso(String codigo) {
        this.codigo = codigo;        
    }
          
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Huella> getHuellas() {
        return huellas;
    }
    
    public  void  añadirHuella(Huella huella){
        huellas.add(huella);
        
    }

    @Override
    public String toString() {
        String info = "El caso tien un codigo " + codigo + " Con huellas= " + huellas + '}';
        for (Huella c : huellas) {
            info += c.toString() + "\n";
        }
        
        return info;
    }
    
    
    
}
