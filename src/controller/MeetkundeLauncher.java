package controller;

import model.*;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Uitwerking van opdracht Meetkunde (5)
 *
 * Doel: Werk met de klasse van het meetkunde project
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        Oppervlak oppervlak = new Oppervlak(10, 7);

        oppervlak.voegFiguurToe(new Rechthoek(3, 3, new Punt(0, 7), "rood"));
        oppervlak.voegFiguurToe(new Rechthoek(3, 2, new Punt(0, 4), "geel"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(0, 2), "groen"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(3, 7), "paars"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 4, new Punt(5, 7), "oranje"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 3, new Punt(5, 3), "blauw"));

        System.out.println(oppervlak);

    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}
