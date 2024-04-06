package produit;

public class Poisson extends Produit {
	String date;
	String nom = "poisson";
	
	public Poisson(String date, String nom) {
		super(nom);
		description(nom);
	}
	
	public void description(String nom) {
		System.out.println(nom+" pêchés "+date+".");
	}
}
