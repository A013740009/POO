/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directionla.point.proyect;
import java.util.Scanner;
/**
 *
 * @author A01378838
 */
public class DirectionlaPointProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e1 = new Scanner(System.in);
        System.out.print("Entre el valor de x: ");
        int x = e1.nextInt();
        System.out.print("Entre el valor de y: ");
        int y = e1.nextInt();
        System.out.print("Entre el valor de z: ");
        float z = e1.nextFloat();
        
        
        PuntoDirector p1;
        p1 = new PuntoDirector(3, 5, 5.4f); //el sistema detecta automaticamente que es un double por lo que se le pone la "f"
        PuntoDirector p2;
        p2= new PuntoDirector(3, 3, 6.4f);
        PuntoDirector p3;
        p3= new PuntoDirector(x, y, z);
        
        
        System.out.println(p1.toString()); //aunque no ponga variable.toString java lo busca automaticamnete siempre y cuando empiece con
        System.out.println(p2.toString()); // minuscula el toString
        p1=p2;
        System.out.println(p1.toString()); //cuando p1 referencia el mismo caho de memoria que p2 p1 y p2 valen lo mismo
        System.out.println(p2.toString()+'\n');
        System.out.println(p3.toString());
    }
    
}
