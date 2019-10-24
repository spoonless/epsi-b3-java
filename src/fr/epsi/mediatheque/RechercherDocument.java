package fr.epsi.mediatheque;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class RechercherDocument {
	
	public static void main(String[] args) {
		MediathequeLoader loader = new MediathequeLoader(Path.of("mediatheque.csv"));
		Mediatheque mediatheque;
		try {
			mediatheque = loader.load();
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le mot-cle :");
			String motCle = sc.nextLine();
			
			List<Document> documents = mediatheque.rechercher(motCle);
			if(documents.isEmpty()) {
				System.out.println("Aucun document trouve !");
			} else {
				for (Document document : documents) {
					System.out.println(document.getTitre());
				}
			}
		} catch (IOException | FichierMediathequeInvalideException e) {
			System.err.println("Le fichier CSV n'a pas pu etre charge !");
			e.printStackTrace();
		}
	}

}
