package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Doel: Sla een cirkel op en maak het mogelijk daar operaties op uit te oefenen
 */
public class Cirkel {
    private final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private double straal;
    private Punt middelpunt;
    private String kleur;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        this.straal = straal;
        this.middelpunt = middelpunt;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), "paars");
    }

    public Cirkel() {
        this(1);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, " +
                "die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!!";
        }
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }
}
