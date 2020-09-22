package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Doel: Sla een cirkel op en maak het mogelijk daar operaties op uit te oefenen
 */
public class Cirkel extends Figuur {

    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        this.straal = straal;
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULTWAARDE_KLEUR);
    }

    public Cirkel() {
        this(1);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, " +
                "die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStraal: " + straal +
                "\nMiddelpunt: " + middelpunt.toString();
    }
}
