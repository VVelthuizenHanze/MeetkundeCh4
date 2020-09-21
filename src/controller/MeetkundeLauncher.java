package controller;

import model.Cirkel;

import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Uitwerking van opdracht Meetkunde (1)
 *
 * Doel: Werk met de klasse van het meetkunde project
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, 1, 4, "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        System.out.println(Cirkel.geefDefinitie());

        for (Cirkel cirkel : mijnCirkelArray) {
            System.out.println(cirkel.geefOmtrek());
            System.out.println(cirkel.geefOppervlakte());
            System.out.println(cirkel.vertelOverGrootte());
            System.out.println();
        }
    }

}
