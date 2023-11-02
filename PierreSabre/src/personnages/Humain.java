package personnages;

public class Humain {
	protected String nom;
	protected String boissonPreferee;
	protected int argent;
	
	public Humain(String nom, String boissonPreferee, int argent) {
		super();
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
	}
	
	public void direBonjour() {
		parler("Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonPreferee);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPreferee + " ! Gloups !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un/une " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	private void parler(String texte) {
		System.out.println("(" + nom + ")" + " - " + texte);
	}
}



