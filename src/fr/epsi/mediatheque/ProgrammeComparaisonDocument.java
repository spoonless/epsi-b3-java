package fr.epsi.mediatheque;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgrammeComparaisonDocument {
	
	public static void main(String[] args) {
		
		List<Document> documents = new ArrayList<>();
		documents.add(new Livre("père riche, père pauvre", "1121312"));
		documents.add(new Livre("le Seigneur des Anneaux", "4564654654"));
		documents.add(new Livre("xlkjlkjlk", "4564654654"));
		
		System.out.println(documents);
		Comparator<Document> documentComparator = new DocumentComparator();
		documents.sort(documentComparator);
		
		System.out.println(documents);
	}

}
