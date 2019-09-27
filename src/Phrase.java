public class Phrase {

	public static final String SEPARATEUR_PAR_DEFAUT = " ";
	public static final String DECLARATION = ".";
	public static final String INTERROGATION = " ?";
	public static final String EXCLAMATION = " !";

	private String mots = "";
	private String separateur = SEPARATEUR_PAR_DEFAUT;
	private String mode;
	
	public Phrase() {
		this.mode = DECLARATION;
	}
	
	public Phrase(String mode, String... mots) {
		this.mode = mode;
		this.ajouter(mots);
	}

	public int getNbLettres() {
		int nbLettres = 0;
		for (char c : this.mots.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				++nbLettres;
			}
		}
		return nbLettres;
	}

	public void ajouter(String mot, int nbMots) {
		for (int i = 0; i < nbMots; ++i) {
			this.ajouter(mot);
		}
	}

	public void ajouter(String premierMot, String... mots) {
		this.ajouter(premierMot);
		this.ajouter(mots);
	}

	private void ajouter(String... mots) {
		for (String mot : mots) {
			this.ajouter(mot);
		}
	}

	public void ajouter(String mot) {
		if (!this.mots.equals("")) {
			this.mots += this.separateur;
		}
		this.mots += mot;
	}

	public void setSeparateur(String separateur) {
		this.separateur = separateur;
	}

	public void setSeparateur(char separateur) {
		this.separateur = Character.toString(separateur);
	}

	public String toString() {
		return this.mots + mode;
	}


}
