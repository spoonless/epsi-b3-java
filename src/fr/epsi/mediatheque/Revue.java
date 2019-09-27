package fr.epsi.mediatheque;

public class Revue extends Document {
	private String editeur;
	private String issn;

	public Revue(String titre, String issn) {
		super(titre);
		this.issn = issn;
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
