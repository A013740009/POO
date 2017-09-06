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
public class HuellaDP extends Huella{
    
    private int valor_ident;

    public HuellaDP(int valor_ident, int cantidad) {
        super(cantidad);
        this.valor_ident = valor_ident;
    }

    public int getValor_ident() {
        return valor_ident;
    }

    public void setValor_ident(int valor_ident) {
        this.valor_ident = valor_ident;
    }

    @Override
    public String toString() {
        return "Valor identificado"+ valor_ident + '}';
    }
    
    
}
