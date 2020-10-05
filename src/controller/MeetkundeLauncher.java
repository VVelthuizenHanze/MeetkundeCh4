package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Uitwerking van opdracht Meetkunde (5)
 *
 * Doel: Werk met de klasse van het meetkunde project
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        ArrayList<String> regelsUitBestand = new ArrayList<>();
        File rechthoekenBestand = new File("resources/Rechthoek.csv");

        Scanner invoer = null;
        try {
            invoer = new Scanner(rechthoekenBestand);
            while (invoer.hasNextLine()) {
                regelsUitBestand.add(invoer.nextLine());
            }
        } catch (FileNotFoundException exception) {
            // exception.printStackTrace();
            System.out.println("Het bestand is niet gevonden.");
        } finally {
            if (invoer != null) {
                invoer.close();
            }
        }
        
        if (regelsUitBestand.size() > 0) {
            ArrayList<Rechthoek> rechthoeken = new ArrayList<>();
            for (String regel : regelsUitBestand) {
                String[] regelArray = regel.split(",");
                double lengte = Double.parseDouble(regelArray[0]);
                double breedte = Double.parseDouble(regelArray[1]);
                double xCoordinaat = Double.parseDouble(regelArray[2]);
                double yCoordinaat = Double.parseDouble(regelArray[3]);
                String kleur = regelArray[4];
                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }

            for (Rechthoek rechthoek : rechthoeken) {
                System.out.println(rechthoek);
                System.out.println();
            }
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}
