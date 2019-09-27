package fr.epsi.mediatheque;

public class Film extends Document {

	private String realisateur;
	private String distributeur;
	private String isbn;

	public Film(String titre, String isbn) {
		super(titre);
		this.isbn = isbn;
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
