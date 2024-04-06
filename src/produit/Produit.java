package produit;

public abstract class Produit {
	private String nom;
	@SuppressWarnings("unused")
	private enum unité {litre,gramme,kilogramme,centilitre, millilitre, piece};
	
	public Produit(String nom) {
		this.nom=nom;
	}
	
	public String toString() {
		return nom;
	}
	
	
}
