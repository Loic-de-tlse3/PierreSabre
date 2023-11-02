package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 54);
		Ronin roro = new Ronin("Roro", "Shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}

}
