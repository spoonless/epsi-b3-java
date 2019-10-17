package fr.epsi.mediatheque;

import java.util.Comparator;

public class DocumentParTypeComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		if(! (o1 instanceof Document) || ! (o2 instanceof Document)) {
			throw new ClassCastException("Attention ce ne sont pas des documents !");
		}
		Document d1 = (Document) o1;
		Document d2 = (Document) o2;

		int codeD1 = getCode(d1);
		int codeD2 = getCode(d2);
		
		int comparaison = codeD1 - codeD2;
		
		if (comparaison == 0) {
			DocumentComparator documentComparator = new DocumentComparator();
			return documentComparator.compare(d1, d2);
		}
		return comparaison;
	}
	
	private int getCode(Document d) {
		if(d instanceof Livre) {
			return 0;
		}
		if(d instanceof Revue) {
			return 1;
		}
		return 2;
	}
}
