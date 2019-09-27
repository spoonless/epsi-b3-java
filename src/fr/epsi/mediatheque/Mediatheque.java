package fr.epsi.mediatheque;

public class Mediatheque {

	public static void main(String[] args) {
		
		Document document = new Film("Don Quichotte", "1231326456-1321-54564");
		
		if (document instanceof Livre) {
			Livre livre = (Livre) document;
		}

	}

}
