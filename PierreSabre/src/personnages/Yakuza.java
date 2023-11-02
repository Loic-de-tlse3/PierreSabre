package personnages;

public class Yakuza extends Humain {
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom, boissonPreferee, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		gagnerArgent(victime.argent);
		int argentRecupere = victime.seFaireExtorquer();
		reputation++;
		parler("J’ai piqué les " + argentRecupere + " sous de " + victime.getNom() + " ce qui me fait " + argent 
				+ " dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... j'ai déshonoré le clan de " + clan + ".");
		int argentPerdu = argent;
		perdreArgent(argent);
		reputation--;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " 
			+ gain + " sous");
	}
}
