package produit;

public class Poisson extends Produit {
    private String datePeche;

    public Poisson(String datePeche) {
        super("poisson");
        this.datePeche = datePeche;
    }

    @Override
    public String decrireProduit() {
        return "Poisson pêché le " + datePeche;
    }
}
