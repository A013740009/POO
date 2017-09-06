/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguresModel;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author migue
 */
public class Circle extends Figure implements IMovable, IScalable {

    private int radius;
    
    public Circle(){
        radius = (new Random()).nextInt(60)+20;
    }
    
    @Override
    public void Show(Graphics g, Color color) {
        g.setColor(color);
        Point position = GetPosition();
        g.drawOval(position.x, position.y, 2*radius, 2*radius);
    }

    @Override
    public boolean Select(Point p) {
        Point position = GetPosition();
        int centerX = position.x+radius;
        int centerY = position.y+radius;
        
        double d = Math.sqrt(Math.pow(centerX-p.x, 2)+Math.pow(centerY-p.y, 2));
        
        return d <= radius;
    }

    @Override
    public void Move(int deltaX, int deltaY) {
        Point position = GetPosition();
        position.x+=deltaX;
        position.y+=deltaY;
        SetPosition(position);
    }

    @Override
    public void Scale(int percent) {
        radius += radius*percent/100;
    }
}
    

