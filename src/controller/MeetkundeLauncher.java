package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Uitwerking van opdracht Meetkunde (5)
 *
 * Doel: Werk met de klasse van het meetkunde project
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        Cirkel mijnCirkel = new Cirkel(3, new Punt(2, 5), "groen");

        Rechthoek mijnRechthoek = new Rechthoek(3, 4, new Punt(-2, 6),"blauw");

        Figuur[] figuren = new Figuur[3];
        figuren[0] = mijnCirkel;
        figuren[1] = mijnRechthoek;
        figuren[2] = new Cirkel(10, new Punt(-1, -3), "karmozijn");

        for (int figuurTeller = 0; figuurTeller < figuren.length; figuurTeller++) {
            toonInformatie(figuren[figuurTeller]);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}
