package controller;

import model.Cirkel;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Uitwerking van opdracht Meetkunde (3)
 *
 * Doel: Werk met de klasse van het meetkunde project
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        Cirkel[] mijnCirkelArray = new Cirkel[3];

        Cirkel mijnCirkel = new Cirkel();

        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        System.out.println(Cirkel.geefDefinitie());

        for (Cirkel cirkel : mijnCirkelArray) {
            System.out.println(cirkel.geefOmtrek());
            System.out.println(cirkel.geefOppervlakte());
            System.out.println(cirkel.getMiddelpunt().getxCoordinaat());
            System.out.println(cirkel.getMiddelpunt().getyCoordinaat());
            System.out.println(cirkel.vertelOverGrootte());
            System.out.println(cirkel);
        }

//        System.out.println(Rechthoek.geefDefinitie());
//        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
//        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
//        mijnRechthoekArray[1] = new Rechthoek();
//        mijnRechthoekArray[2] = new Rechthoek(25, 10);
//        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length; arrayTeller++) {
//            System.out.println(mijnRechthoekArray[arrayTeller].geefOmtrek());
//            System.out.println(mijnRechthoekArray[arrayTeller].geefOppervlakte());
//            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksBoven().getxCoordinaat());
//            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksBoven().getyCoordinaat());
//            System.out.println(mijnRechthoekArray[arrayTeller].vertelOverGrootte());
//        }
    }

}
