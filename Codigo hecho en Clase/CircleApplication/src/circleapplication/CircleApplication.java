/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleapplication;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ercv1
 */
public class CircleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Circle> lista = new ArrayList<Circle>();
        char userResponse;
        do {
            System.out.print("Desea crear un circulo? (s/n):");
            userResponse = entrada.next().charAt(0);  //solo va a utiliza el primer caracter del string
            if (userResponse == 's') {
                System.out.print("Entrada un nuevo radio: ");
                double radio = entrada.nextDouble();
                Circle circulo = new Circle(radio);
                lista.add(circulo);
            }
        } while (userResponse == 's');
        {
            System.out.println("Los circulos se guardaron en: C:\\Users\\ercv1\\Desktop\\Circles.txt ");
            /**
             * for (Circle c:lista){ System.out.println("El radio es: " +
             * c.getRadius()); System.out.println("El area es: " + c.area());
             * System.out.println("La circunferencia es: " + c.circumference());
            System.out.println("*****************************************");
             */
            Formatter txtWritter = null;
            try {
                txtWritter = new Formatter("C:\\Users\\ercv1\\Desktop\\Circles.txt");
                txtWritter.format("Los circulos que se guardaron fueron");
                for (Circle c : lista) {
                    txtWritter.format("\n" + "El radio es: " + c.getRadius() + "\n");
                    txtWritter.format("El area es: " + c.area() + "\n");
                    txtWritter.format("La circunferencia es: " + c.circumference() + "\n");
                    txtWritter.format("*****************************************");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CircleApplication.class.getName()).log(Level.SEVERE, null, ex);
                /**
                 * por si no puede escribir en la ruta que lo ponga en el prompt
                 */
            } finally {
                txtWritter.close();
            }

        }

    }

}
