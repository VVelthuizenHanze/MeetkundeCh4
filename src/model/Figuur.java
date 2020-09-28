package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Sla de algemene eigenschappen van een figuur op
 */
public abstract class Figuur {
    protected static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    protected static final String DEFAULTWAARDE_KLEUR = "taupe";

    protected String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULTWAARDE_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten.";
    }

    public abstract double geefOmtrek();

    public abstract double geefOppervlakte();

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!!";
        }
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return "Kleur: " + kleur +
                "\nOmtrek: " + geefOmtrek() +
                "\nOppervlakte: " + geefOppervlakte();
    }
}
