package produit;

import personnages.Gaulois;

public class Sanglier {
	int poids;
	Gaulois chasseur;
	String nom = "sanglier";
	
	public Sanglier(String date, String nom) {
		super();
		description(nom);
	}
	
	public void description(String nom) {
		System.out.println(nom+" de "+poids+" kg chassé par "+chasseur.getNom()+".");
	}
}
