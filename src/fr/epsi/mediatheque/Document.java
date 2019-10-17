package fr.epsi.mediatheque;

import java.util.ArrayList;
import java.util.List;

public abstract class Document {
	
	private String titre;
	private List<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
	
	public Document(String titre) {
		this.titre = titre;
	}
	
	public abstract String getIdentifiant();

	public boolean correspond(String motCle) {
		return this.titre.contains(motCle);
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public List<Exemplaire> getExemplaires() {
		return exemplaires;
	}
	
	public void setExemplaires(List<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}

	@Override
	public String toString() {
		return titre;
	}

}
