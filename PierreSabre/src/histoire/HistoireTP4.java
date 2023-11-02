package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku le noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "Shochu", 60);
		Commercant marco = new Commercant("Marco", 15);
		marco.direBonjour();
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.extorquer(marco);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
	}

}
