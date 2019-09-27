package fr.epsi.mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Document {
	
	private String titre;
	private List<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
	
	public Document(String titre) {
		this.titre = titre;
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

}
