package model;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Sla een lijst met figuren op die samen een oppervlak bedekken
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    public ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        mijnFiguren.add(figuur);
    }

    @Override
    public String toString() {
        String eenReturn = "";

        if(!mijnFiguren.isEmpty()) {
            for (Figuur figuur : mijnFiguren) {
                eenReturn += figuur.toString() + "\n\n";
            }
        }

        return eenReturn;
    }
}
