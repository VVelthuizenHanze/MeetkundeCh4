package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Doel: Sla een rechthoek op en maak het mogelijk er operaties op uit te voeren
 */
public class Rechthoek extends Figuur {
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur);
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;

    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULTWAARDE_KLEUR);
    }

    public Rechthoek() {
        this(2, 1);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    @Override
    public double geefOmtrek() {
        return (lengte + breedte) * 2;
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }
}
