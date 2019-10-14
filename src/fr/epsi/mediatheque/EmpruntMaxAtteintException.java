package fr.epsi.mediatheque;

public class EmpruntMaxAtteintException extends Exception {
	
	public EmpruntMaxAtteintException(int maxEmprunt) {
		super("Vous ne pouvez emprunter que " + maxEmprunt + " exemplaires au maximum");
	}

	protected EmpruntMaxAtteintException(String message) {
		super(message);
	}

}
