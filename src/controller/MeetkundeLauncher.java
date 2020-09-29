package controller;

import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
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

        Scanner keyboard = new Scanner(System.in);
        boolean onjuistInvoer = true;

        while(onjuistInvoer) {
            System.out.print("Geef een straal: ");

            try {
                double straal = keyboard.nextDouble();
                Cirkel ingevoerdeCirkel = new Cirkel(straal);
                System.out.println(ingevoerdeCirkel);
                onjuistInvoer = false;
            } catch (IllegalArgumentException exception) {
                // System.out.println("Dat was geen geldige straal");
                System.out.println(exception.getMessage());
            } catch (InputMismatchException exception) {
                System.out.println("Dat is geen getal");
                keyboard.nextLine();
            } finally {
                System.out.println("Je invoer is afgehandeld.");
            }
        }




    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}
