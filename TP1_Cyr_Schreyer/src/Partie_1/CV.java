package Partie_1;

public class CV {

	private static String nom;
	private static String prenom;
	private static String formation;
	private static int nbAnnee;
	private static String[] CompetenceMike = { "Programmeur", "Tester des programmes", "Modelisation" };
	private static String[] CompetenceNathan = { "D�veloppeur web", "Musicien", "Base de donn�es" };
	private static String Attente;

	public static void afficher(String nom, String prenom, String formation, int nbAnnee, String Attente) {

		System.out.println("\n\nAffichage des CV:" + "\n\nNom: \t\t\t\t" +nom + "\nPr�nom: \t\t\t" + prenom + "\nFormation: \t\t\t" + formation
				+ "\nNombre d'ann�e d'exp�rience: \t" + nbAnnee + "\nComp�tences: \t\t\t" + CompetenceMike[0] + ", "
				+ CompetenceMike[1] + ", " + CompetenceMike[2] + "\nAttente pour le cours 4B4: \t" + Attente);

	}

	public static void main(String[] args) {

		System.out.println("Bienvenue chez Barette!");
		afficher("Schreyer", "Michel", "DEC en programmation en pr�paration", 4, "Passer le cours");
		afficher("Cyr", "Nathan", "Informaticien", 21, "passer le cours");
	}

}
