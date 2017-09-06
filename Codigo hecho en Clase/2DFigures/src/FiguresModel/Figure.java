/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguresModel;

import java.awt.Color;      //seleccionar el oolor con el que vas a pintar
import java.awt.Graphics;   //con esto pintas lo que quieras 
import java.awt.Point;

/**
 *
 * @author migue
 */
public abstract class Figure{
    
    private Point position = null;  //para decir que no tiene nada adentro
    
    public Figure(Point position){
        this.position = position;
    }
    
    public abstract void Show(Graphics g, Color color); /*como es parte de una clase general no puede saber que las figuras como se vana
                                                          se vana mostrar ya que el cuadrado el ciruclo y el Triangulo se muestran diferente*/
    public abstract boolean Select(Point p);

    public void SetPosition(Point position) {
        this.position = position;
    }

    public Point GetPosition() {
        return position;
    }    
}
