package fr.epsi.mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Mediatheque {
	
	private List<Exemplaire> exemplaires = new ArrayList<>();
	
	public void init() {
		Livre livre = new Livre("Don Quichotte", "1231326456-1321-54564");
		livre.setAuteur("Cervantes");
		Exemplaire exemplaire = new Exemplaire("123", livre);
		exemplaires.add(exemplaire);
		
		Film film = new Film("Jumanji", "1231326456-1321-54564");
		exemplaire = new Exemplaire("98989", film);
		exemplaires.add(exemplaire);

		Revue revue = new Revue("Le monde diplomatique", "1231321321");
		exemplaire = new Exemplaire("8888", revue);
		exemplaires.add(exemplaire);
	}
	
	public List<Document> rechercher(String motCle) {
		List<Document> resultat = new ArrayList<>();
		for(Exemplaire exemplaire : exemplaires) {
			if(exemplaire.getDocument().correspond(motCle)) {
				resultat.add(exemplaire.getDocument());
			}
		}
		return resultat;
	}


}
