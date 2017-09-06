/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directionla.point.proyect;

/**
 *
 * @author A01378838
 */
public class PuntoDirector {
    private int x;
    private int y;  // se pone private para emcapsular la variable, esconde su estructura y que sea mas senciilo utilizarlo
    private float direction;
    
    public void setx(int x){this.x=x;}
    public void sety(int y){this.y=y;}
    public void setdirection(int r){this.direction=r;}
    
    public int getx(){return x;}
    public int gety(){return y;}
    public float getdirection(){return direction;}
    
    //crear metodo constructor
    public PuntoDirector(int x, int y, float direction){
        this.x=x;
        this.y=y;
        this.direction=direction;
    }
    
    public String toString(){
        String resultado = "Punto Director: "+ x +";"+ y + ";"+direction;
        return resultado;
    }          
}
