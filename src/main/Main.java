package main;

import classes.Kepping;
import classes.SaveAndLoad;

import java.io.IOException;

public class Main {



    public static void main(String[] args) {
        Kepping kep =  new Kepping(10,10);
        double avarageSquare = kep.getAverageSquare();
        SaveAndLoad saveAndLoad = new SaveAndLoad();

        try {
            saveAndLoad.saveParallelogram(kep.getParallelograms());
            saveAndLoad.saveQuadrangles(kep.getQuadrangles());
            saveAndLoad.loadParallelogram();
            saveAndLoad.loadQuadrangle();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Average square of quadrangles: "+ Double.toString(avarageSquare));
        System.out.println("Parallelogram with max square: " + kep.getMaxParallelogramSquare().toString() );
        System.out.println("Parallelogram with min square: " + kep.getMinParallelogramSquare().toString());
      }
}
