package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Doel: Sla een rechthoek op en maak het mogelijk er operaties op uit te voeren
 */
public class Rechthoek {
    private final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;
    private String kleur;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
        this.kleur = kleur;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), "geel");
    }

    public Rechthoek() {
        this(2, 1);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    public double geefOmtrek() {
        return (lengte + breedte) * 2;
    }

    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!!";
        }
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }
}
