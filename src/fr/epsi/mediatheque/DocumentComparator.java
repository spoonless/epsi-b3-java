package fr.epsi.mediatheque;

import java.util.Comparator;

public class DocumentComparator implements Comparator<Document>{
	
	@Override
	public int compare(Document d1, Document d2) {
		String titre1 = d1.getTitre();
		String titre2 = d2.getTitre();
		return titre1.compareToIgnoreCase(titre2);
	}

}
