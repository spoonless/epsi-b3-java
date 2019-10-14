package fr.epsi.mediatheque;

import java.util.List;
import java.util.Scanner;

public class RechercherDocument {
	
	public static void main(String[] args) {
		Mediatheque mediatheque = new Mediatheque();
		mediatheque.init();
		
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
	}

}
