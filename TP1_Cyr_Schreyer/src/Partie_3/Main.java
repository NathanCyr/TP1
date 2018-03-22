//Programmation: Nathan Cyr et Michel Schreyer

package Partie_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Hashtable;

public class Main {

	private static double TPS = 1.05;
	private static double TVQ = 1.10;

	public static void main(String[] args) {
		final String fichier = "listeCommandes.txt";
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader BufferFic = null;
		FileReader LectureFic = null;
		String Ligne;

		ArrayList<String> clients = new ArrayList<String>();
		Hashtable<String, Plats> plats = new Hashtable<String, Plats>();
		ArrayList<Commande> commande = new ArrayList<Commande>();

		try {

			LectureFic = new FileReader(fichier);
			BufferFic = new BufferedReader(LectureFic);

			Ligne = BufferFic.readLine();

			while (!(Ligne = BufferFic.readLine()).equals("Plats :")) {

				clients.add(Ligne);
			}

			while (!(Ligne = BufferFic.readLine()).equals("Commandes :")) {

				String[] LigneSpliter = Ligne.split(" ");
				plats.put(LigneSpliter[0], new Plats(LigneSpliter[0], Double.parseDouble(LigneSpliter[1])));
			}

			while (!(Ligne = BufferFic.readLine()).equals("Fin")) {

				String[] LigneSpliter = Ligne.split(" ");

				if (LigneSpliter.length == 3) {
					commande.add(new Commande(LigneSpliter[0], plats.get(LigneSpliter[1]),
							Integer.parseInt(LigneSpliter[2])));

				} else {

					LectureFic.close();
					System.out.println("Le fichier ne respecte pas le format demandé !");

				}
			}
			LectureFic.close();
		} catch (Exception err) {

			System.out.println(err);

		}

		PrintWriter writer;
		try {
			String dateString = date();
			File file = new File ("Facture-du" + dateString + ".txt");
			writer = new PrintWriter(file, "UTF-8");
			writer.println("Bienvenue chez Barette!");
			writer.println("Factures:");
			System.out.println("Bienvenue chez Barette!");
			System.out.println("Factures:");
			
			for (String client : clients) {
				double total = 0;

				for (Commande commandes : commande) {

					if (commandes.getClient().equals(client)) {
						total += commandes.getQuantiteCommander() * commandes.getPlat().getPrix() * TPS * TVQ;
					}
				}
				
				if (total != 0) {
					writer.println(client + " " + df.format(total) + "$");	
					System.out.println(client + " " + df.format(total) + "$");
				}else{
					writer.print("");
					
				}
			}

			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}


	public static String date() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy-HH-mm");
		String dateString = dateFormat1.format(gc.getTime());
		return dateString;
	}
}
