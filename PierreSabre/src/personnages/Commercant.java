package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		perdreArgent(argentPerdu);
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int argentObtenu) {
		gagnerArgent(argentObtenu);
		parler(argentObtenu + " sous ! Je te remercie généreux donateur !");
	}

}
