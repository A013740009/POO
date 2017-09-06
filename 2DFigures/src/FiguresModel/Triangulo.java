/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguresModel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.util.Random;

/**
 *
 * @author ercv1
 */
public class Triangulo extends Figure implements IMovable, IRotable {
     private int sideLength;

    private double rotationAngle = 0;
    
    private Polygon rotatedRectangle = null;

    public Triangulo() {
        sideLength = (new Random()).nextInt(140) + 20;
    }

    @Override
    public void Show(Graphics g, Color color) {
        g.setColor(color);
        Point position = GetPosition();
        Rectangle r = new Rectangle(-sideLength/2, -sideLength/2, sideLength, sideLength);
        
        double sine = Math.sin(rotationAngle);
        double cosine = Math.cos(rotationAngle);
        
        int x1 = (int) Math.round(r.x*cosine-r.y*sine)+position.x;
        int y1 = (int) Math.round(r.x*sine+r.y*cosine)+position.y;
        
        int x2 = (int) Math.round((r.x+sideLength)*cosine-r.y*sine)+position.x;
        int y2 = (int) Math.round((r.x+sideLength)*sine+r.y*cosine)+position.y;
        
        int x3 = (int) Math.round((r.x+sideLength)*cosine-(r.y+sideLength)*sine)+position.x;
        int y3 = (int) Math.round((r.x+sideLength)*sine+(r.y+sideLength)*cosine)+position.y;
       
        
        rotatedRectangle = new Polygon(new int[]{x1,x2,x3}, new int[]{y1,y2,y3}, 3);
        g.drawPolygon(rotatedRectangle);
    }
    @Override
    public boolean Select(Point p) {
        return rotatedRectangle.contains(p);
    }

    @Override
    public void Rotate(double angle) {
        rotationAngle += angle;
    }

    @Override
    public void Move(int deltaX, int deltaY) {
        Point position = GetPosition();
        position.x+=deltaX;
        position.y+=deltaY;
        SetPosition(position);
    }
}