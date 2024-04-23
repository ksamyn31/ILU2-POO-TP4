package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
    private double poids;
    private Gaulois chasseur;

    public Sanglier(double poids, Gaulois chasseur) {
        super("sanglier");
        this.poids = poids;
        this.chasseur = chasseur;
    }

    @Override
    public String decrireProduit() {
        return "Sanglier de " + poids + " kg chassé par " + chasseur;
    }
}
