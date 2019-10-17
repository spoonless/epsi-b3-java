package fr.epsi.mediatheque;

public class Livre extends Document {

	private String auteur;
	private String editeur;
	private String isbn;
	
	public Livre(String titre, String isbn) {
		super(titre);
		this.isbn = isbn;
	}
	
	@Override
	public String getIdentifiant() {
		return this.isbn;
	}

	@Override
	public boolean correspond(String motCle) {
		if (super.correspond(motCle)) {
			return true;
		} else if (this.editeur != null && this.editeur.contains(motCle)) {
			return true;
		} else if (this.auteur != null && this.auteur.contains(motCle)) {
			return true;
		}
		return false;
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

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Livre) {
			Livre livre = (Livre) obj;
			return this.isbn.equals(livre.isbn);
		}
		return false;
	}
	
	
	
}
