/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CriminalisticaGUI;

import java.util.ArrayList;
import java.util.Scanner;
import laboratorio_criminalista.Caso;
import laboratorio_criminalista.HuellaDP;
import laboratorio_criminalista.HuellaOlor;
import laboratorio_criminalista.HuellaTrazologica;
import laboratorio_criminalista.Perito;

/**
 *
 * @author Rigo Felix
 */
public class Laboratorio_criminalista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo o funcion

        ArrayList<Perito> peritos = new ArrayList<Perito>();
        Scanner s = new Scanner(System.in);
        char respuestaPerito;
        do {
            System.out.println("Quieres agregar un perito  (s/n): ");
            respuestaPerito = s.next().charAt(0);
            if (respuestaPerito == 's') {
                System.out.print("Nombre del perito: ");
                String nombre = s.next();
                System.out.print("Dame el año de contratacion: ");
                int año = s.nextInt();

                Perito nuevoPerito = new Perito(nombre, año);
                peritos.add(nuevoPerito);

                char respuestaCaso;
                do {
                    System.out.println("Quieres agregar un caso  (s/n): ");
                    respuestaCaso = s.next().charAt(0);
                    if (respuestaCaso == 's') {
                        System.out.print("Codigo del caso--> ");
                        String codigo = s.next();

                        Caso nuevoCaso = new Caso(codigo);
                        //peritos.add(nuevoPerito);
                        nuevoPerito.añadirCaso(nuevoCaso);

                        char respuestaHuella;
                        do {
                            System.out.println("Quieres agregar un Huella  (s/n): ");
                            respuestaHuella = s.next().charAt(0);
                            if (respuestaHuella == 's') {
                                System.out.print("Que tipo de huella quieras agregar:" + "\n 1.- Huella DP" + "\n 2.- Hella Olor" + "\n 3.- Huella Trazaolofica " + "\n");
                                int opcionUsuario = s.nextInt();

                                System.out.print("Cuantas huellas se recopilaron: ");
                                int cantidadTotalHuellas = s.nextInt();

                                if (opcionUsuario == 1) {
                                    System.out.print("Cuantas huellas tienen valor: ");
                                    int cantidadHuellasConValor = s.nextInt();
                                    HuellaDP nuevaHuella = new HuellaDP(cantidadHuellasConValor, cantidadTotalHuellas);
                                    nuevoCaso.añadirHuella(nuevaHuella);
                                } else if (opcionUsuario == 2) {
                                    System.out.print("Cuando es la fecha de olor de la huella: ");
                                    String fechaDeHuella = s.next();
                                    HuellaOlor nuevaHuella = new HuellaOlor(fechaDeHuella, cantidadTotalHuellas);
                                    nuevoCaso.añadirHuella(nuevaHuella);

                                } else if (opcionUsuario == 3) {
                                    System.out.print("Superficie donde se formaron: ");
                                    String superficie = s.next();
                                    HuellaTrazologica nuevaHuella = new HuellaTrazologica(superficie, cantidadTotalHuellas);
                                    nuevoCaso.añadirHuella(nuevaHuella);

                                } else {
                                    System.out.println("¡La opción introducida es incorrecta!");
                                }
                            }
                        } while (respuestaHuella == 's');

                    }
                } while (respuestaCaso == 's');

            }
        } while (respuestaPerito == 's');
        for (Perito perito: peritos) {
            System.out.println(perito);
        }

    }
}
