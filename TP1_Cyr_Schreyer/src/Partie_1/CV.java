package Partie_1;

import java.util.ArrayList;

public class CV {

	public static String nom;
	public static String prenom;
	public static String formation;
	public static int nbAnnee;
	public static ArrayList<CV> listCompetence = new ArrayList<CV>();
	public static String Attente;

	public static void main(String[] args) {
		
		System.out.println("Bienvenue chez Barette!");
		afficher();
		
	}

	public static void afficher() {
		
		System.out.println("\nAffichage des CV:" + "\nNom: " + nom + "\nPr�nom: " + prenom + "\nFormation: " + formation
				+ "\nNombre d'ann�e d'exp�rience: " + nbAnnee + "\nComp�tences: " + listCompetence.toString()
				+ "\nAttente pour le cours 4B4: " + Attente);
		 
		
	}

}
