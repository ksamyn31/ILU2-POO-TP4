package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import villagegaulois.IEtals;

public class ScenarioTest {
	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		IEtal[] marche = new IEtal[3];
		IEtal<Sanglier> etalSanglier1 = new Etal<>();
		IEtal<Sanglier> etalSanglier2 = new Etal<>();
		IEtal<Poisson> etalPoisson = new Etal<>();
		
		marche[0] = etalSanglier1; // Affectation des étals aux emplacements du marché
		marche[1] = etalSanglier2;
		marche[2] = etalPoisson;
		
		
		marche[0].installerVendeur(obelix,sangliersObelix,8);
		marche[1].installerVendeur(asterix,sangliersAsterix,10);
		marche[2].installerVendeur(ordralfabetix,poissons,8);
	}
	
}
