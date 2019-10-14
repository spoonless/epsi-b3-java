package fr.epsi.mediatheque;

public class Exemplaire {

	private String code;
	private Document document;
	
	public Exemplaire(String code, Document document) {
		this.code = code;
		this.document = document;
		this.document.getExemplaires().add(this);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Exemplaire) {
			Exemplaire exemplaire = (Exemplaire) obj;
			return this.code.equals(exemplaire.code);
		}
		return false;
	}

}
