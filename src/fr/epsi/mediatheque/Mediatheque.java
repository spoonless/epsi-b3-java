package fr.epsi.mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Mediatheque {
	
	private List<Exemplaire> exemplaires;

	public Mediatheque(List<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
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
