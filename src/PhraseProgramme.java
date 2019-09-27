
public class PhraseProgramme {

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

		// constructeur sans paramètre
		phrase = new Phrase();
		phrase.ajouter("Bonjour", "le", "monde");
		System.out.println(phrase); // Bonjour le monde.

		// constructeur pour indiquer quel caractère fini la phrase
		Phrase phraseInterrogative = new Phrase(Phrase.INTERROGATION);
		phraseInterrogative.ajouter("Ça", "va");
		System.out.println(phraseInterrogative); // Ça va ?

		Phrase phraseExclamative = new Phrase(Phrase.EXCLAMATION);
		phraseExclamative.ajouter("Oui");
		System.out.println(phraseExclamative); // Oui !

		Phrase phraseDeclarative = new Phrase(Phrase.DECLARATION);
		phraseDeclarative.ajouter("C'est", "bien");
		System.out.println(phraseDeclarative); // Assez bien.

		// constructeur pour indiquer quel caractère fini la phrase
		// et passer un nombre quelconque de mots à la phrase
		phrase = new Phrase(Phrase.INTERROGATION, "Et", "ensuite");
		System.out.println(phrase); // Et ensuite ?

		Phrase autrePhrase = new Phrase(" :");
		autrePhrase.ajouter("C'est", "bien");
		System.out.println(autrePhrase);
	}
}
