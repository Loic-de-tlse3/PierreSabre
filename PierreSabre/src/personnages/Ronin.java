package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}

	public void donner(Commercant nomCommercant) {
		int argentDonne = getArgent() * 1/10;
		parler(nomCommercant.getNom() + " prend ces " + argentDonne + " sous.");
		perdreArgent(argentDonne);
		nomCommercant.recevoir(argentDonne);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (honneur*2 >= adversaire.getReputation()) {
			gagnerArgent(adversaire.getArgent());
			honneur++;
			parler("Je t'ai eu petit Yakusa");
			adversaire.perdre();
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce Yakusa, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
		}
	}
}
