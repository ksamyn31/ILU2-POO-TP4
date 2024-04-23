package produit;
public class Produit implements IProduit {
    private String nom;

    public Produit(String nom) {
        this.nom = nom;
    }

    @Override
	public String getNom() {
        return nom;
    }

    @Override
	public String decrireProduit() {
        return "Description du produit : " + nom;
    }
}


