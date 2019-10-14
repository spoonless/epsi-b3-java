package fr.epsi.mediatheque;

public class Revue extends Document {
	private String editeur;
	private String issn;

	public Revue(String titre, String issn) {
		super(titre);
		this.issn = issn;
	}
	
	@Override
	public String getIdentifiant() {
		return this.issn;
	}

	public boolean correspond(String motCle) {
		if (super.correspond(motCle)) {
			return true;
		} else if (this.editeur != null && this.editeur.contains(motCle)) {
			return true;
		}
		return false;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

}
