/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguresModel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author migue
 */
public abstract class Figure implements I2DFigure{
    
    private Point position;
    
    @Override
    public abstract void Show(Graphics g, Color color);

    @Override
    public abstract boolean Select(Point p);

    @Override
    public void SetPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point GetPosition() {
        return position;
    }
    
}
