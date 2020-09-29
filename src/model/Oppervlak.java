package model;

import java.util.ArrayList;
import java.util.Collections;

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

    private boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean eenReturn = false;

        if (figuur instanceof Rechthoek) {
            if ( ((Rechthoek) figuur).getLengte() <= this.lengte &&
                    ((Rechthoek) figuur).getBreedte() <= this.breedte) {
                eenReturn = true;
            }
        } else if (figuur instanceof Cirkel) {
            // het is geen rechthoek dus moet het wel een Cirkel zijn.
            if ( ((Cirkel) figuur).getStraal() <= this.breedte / 2 &&
                    ((Cirkel) figuur).getStraal() <= this.lengte / 2) {
                eenReturn = true;
            }
        }

        return eenReturn;
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuurPastAlsVormInOppervlak(figuur)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur is te groot");
        }
    }

    @Override
    public String toString() {
        String eenReturn = "";

        if(!mijnFiguren.isEmpty()) {
            Collections.sort(mijnFiguren);

            for (Figuur figuur : mijnFiguren) {
                eenReturn += figuur.toString() + "\n\n";
            }
        }

        return eenReturn;
    }
}
