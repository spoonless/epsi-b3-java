public class Phrase {

	public static final String SEPARATEUR_PAR_DEFAUT = " ";

	private String mots = "";
	private String separateur = SEPARATEUR_PAR_DEFAUT;

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
		return this.mots + '.';
	}

	public static void main(String[] args) {
		Phrase phrase = new Phrase();
		phrase.ajouter("Une");
		phrase.ajouter("classe");
		phrase.ajouter("pour");
		phrase.ajouter("ajouter");
		phrase.ajouter("des mots");
		phrase.setSeparateur(" et encore ");
		phrase.ajouter("des mots", 3);
		phrase.setSeparateur(' ');
		phrase.ajouter("toujours", "et", "encore");

		System.out.println(phrase);
		System.out.println(phrase.getNbLettres());
	}

}
