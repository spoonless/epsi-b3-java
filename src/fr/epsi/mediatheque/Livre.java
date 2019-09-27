package fr.epsi.mediatheque;

public class Livre extends Document {

	private String auteur;
	private String editeur;
	private String isbn;
	
	public Livre(String titre, String isbn) {
		super(titre);
		this.isbn = isbn;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
