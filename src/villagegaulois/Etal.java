package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal implements IEtal<Produit>, IEtal {
	private Gaulois vendeur;
	private Produit produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}


	@Override
	public Produit getProduit() {
		return produit;
	}

	@Override
	public void occuperEtal(Gaulois vendeur, Produit produit, int quantite) {
		this.vendeur = vendeur;
		this.produit = (P)produit;
		this.quantite = quantite;
		quantiteDebutMarche = quantite;
		etalOccupe = true;
	}

	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
	    int quantiteAVendre = 0;
	    if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
	        if (nbProduit >= quantiteSouhaitee) {
	            quantiteAVendre = quantiteSouhaitee;
	        } else {
	            quantiteAVendre = nbProduit;
	        }
	    }
	    return quantiteAVendre;
	}

	@Override
	public double acheterProduit(int quantiteSouhaite) {
	    double prixPaye = 0;
	    for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaite - 1 || i > 1; i--) {
	        prixPaye += produits[i].calculerPrix(prix);
	    }
	    if (nbProduit >= quantiteSouhaite) {
	        nbProduit -= quantiteSouhaite;
	    } else {
	        nbProduit = 0;
	    }
	    return prixPaye;
	}




	@Override
	public void libererEtal() {
		etalOccupe = false;
	}

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	
	@Override
	public String etatEtal() {
	    StringBuilder chaine = new StringBuilder(vendeur.getNom());
	    if (nbProduit > 0) {
	        chaine.append(" vend ");
	        chaine.append(nbProduit + " produits :");
	        for (int i = 0; i < nbProduit; i++) {
	            chaine.append("\n- " + produits[i].description());
	        }
	    } else {
	        chaine.append(" n'a plus rien à vendre.");
	    }
	    chaine.append("\n");
	    return chaine.toString();
	}

	
}
