package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}

	public void donner(Commercant nomCommercant) {
		int argentDonne = argent * 1/10;
		parler(nomCommercant.getNom() + " prend ces " + argentDonne + " sous.");
		argent = argent - argentDonne;
		nomCommercant.recevoir(argentDonne);
	}
}
