
import java.awt.Point;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Creando puntos");
    
    // Creando un punto
    Point p1 = new Point(2,3);
    System.out.println("Información del punto 1: " + p1);
    
    // Creando otro punto
    Point p2 = new Point(2,3);
    System.out.println("Información del punto 2: " + p2);
    
    if (p1 == p2)   //no son lo mismo por que los objetos estan guardados en diferentes partes de la memoria
      System.out.println("Son iguales");
    else
      System.out.println("Son diferentes");
  }
}