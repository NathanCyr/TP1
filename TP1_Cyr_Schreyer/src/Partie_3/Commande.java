//Programmation: Nathan Cyr et Michel Schreyer

package Partie_3;

public class Commande {

	private String Client;
	private Plats Plat;
	private int QuantiteCommander;

	public Commande(String Client, Plats PlatCommander, int QuantiteCommander) {

		this.Client = Client;
		this.Plat = PlatCommander;
		this.QuantiteCommander = QuantiteCommander;

	}

	public int getQuantiteCommander() {

		return this.QuantiteCommander;

	}

	public String getClient() {

		return this.Client;

	}

	public Plats getPlat() {

		return this.Plat;

	}

}
