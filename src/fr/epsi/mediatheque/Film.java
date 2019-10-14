package fr.epsi.mediatheque;

public class Film extends Document {

	private String realisateur;
	private String distributeur;
	private String isbn;

	public Film(String titre, String isbn) {
		super(titre);
		this.isbn = isbn;
	}
	
	@Override
	public String getIdentifiant() {
		return this.isbn;
	}

	public boolean correspond(String motCle) {
		if (super.correspond(motCle)) {
			return true;
		} else if (this.realisateur != null && this.realisateur.contains(motCle)) {
			return true;
		} else if (this.distributeur != null && this.distributeur.contains(motCle)) {
			return true;
		}
		return false;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public String getDistributeur() {
		return distributeur;
	}

	public void setDistributeur(String distributeur) {
		this.distributeur = distributeur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
