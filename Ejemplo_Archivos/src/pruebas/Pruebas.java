/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ercv1
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Formatter txtWritter = null;
        try {
            txtWritter = new Formatter("C:\\Users\\ercv1\\Desktop\\myfile.txt");
            txtWritter.format("Hola mi nombre es Eric" + "\n");
            txtWritter.format("hola men!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
            /**
             * por si no puede escribir en la ruta que lo ponga en el prompt
             */
        } finally {
            txtWritter.close();

        }
        Scanner txtReader = new Scanner(Paths.get("C:\\Users\\ercv1\\Desktop\\myfile.txt"));
        try {
            while (txtReader.hasNext()) {
                String line = txtReader.nextLine();
                /*si hay una coma, lo que este antes de la coma lo toma como valor de "value "*/
                String[] value = line.split(",");
                System.out.println(line);
            }
            txtReader.close();
        } catch (Exception e) {
        }

    }

}
