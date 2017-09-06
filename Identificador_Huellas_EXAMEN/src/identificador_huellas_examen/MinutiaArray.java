/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificador_huellas_examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ercv1
 */
public class MinutiaArray extends ArrayList<Minutia> {

    public ArrayList<Minutia> Serialize(String s) {

        Formatter txtWritter = null;
        try {
            txtWritter = new Formatter(s);
            for (Minutia m : this) {
                txtWritter.format(m.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MinutiaArray.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            txtWritter.close();
        }
        return lista;
    }

    public double ComputeCumulativeDistances(Minutia m1, IMinutiaDistance distance) {
        double distanciaT = 0;
        for (int i = 0; i < Minutia.size(); i++) {
            distanciaT += distance.Compare(m1, Minutia.get(i));
        }
        return distanciaT;
    }
