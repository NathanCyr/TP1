//Programmation: Nathan Cyr et Michel Schreyer

package Partie_3;

public class Plats {

	private String PlatMenu;
	private double PrixPlat;

	public Plats(String PlatCommander, double PrixCommande) {

		this.PlatMenu = PlatCommander;
		this.PrixPlat = PrixCommande;

	}

	public double getPrix() {

		return this.PrixPlat;

	}

	public String getPlat() {

		return this.PlatMenu;

	}

}
