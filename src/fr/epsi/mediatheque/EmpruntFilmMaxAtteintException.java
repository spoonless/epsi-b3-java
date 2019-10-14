package fr.epsi.mediatheque;

public class EmpruntFilmMaxAtteintException extends EmpruntMaxAtteintException {
	
	public EmpruntFilmMaxAtteintException(int maxEmprunt) {
		super("Vous ne pouvez emprunter que " + maxEmprunt + " exemplaires de film au maximum");
	}

}
