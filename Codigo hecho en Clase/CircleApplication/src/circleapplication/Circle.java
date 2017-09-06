/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleapplication;

/**
 *
 * @author ercv1
 */
public class Circle {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    public double circumference() {
        return Math.PI * 2 * r;
    }

    public double getRadius() {
        return r;
    }
   
    @Override
    public String toString() {
        return "El radio del circulo es: " + r;
    }
}
