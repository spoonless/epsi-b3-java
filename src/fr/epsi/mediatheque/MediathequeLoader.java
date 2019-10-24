package fr.epsi.mediatheque;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MediathequeLoader {
	
	private static final String TYPE_LIVRE = "L";
	private static final String TYPE_REVUE = "R";
	private static final String TYPE_FILM = "F";
	private Path cheminFichier;

	public MediathequeLoader(Path cheminFichier) {
		this.cheminFichier = cheminFichier;
	}
	
	public Mediatheque load() throws IOException, FichierMediathequeInvalideException {
		List<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
		Document dernierDocument = null;
		
		for(String ligne : Files.readAllLines(cheminFichier)) {
			String[] colonnes = ligne.split(";");
			if (colonnes.length > 1) {
				String typeDocument = colonnes[1];
				switch (typeDocument) {
				case TYPE_LIVRE:
					dernierDocument = loadLivre(colonnes);
					break;
				case TYPE_REVUE:
					dernierDocument = loadRevue(colonnes);
					break;
				case TYPE_FILM:
					dernierDocument = loadFilm(colonnes);
					break;
				default:
					throw new FichierMediathequeInvalideException("Le type de document '" + typeDocument + "' est inconnu !");
				}
			}
			if (dernierDocument == null) {
				throw new FichierMediathequeInvalideException("Aucun document pour un exemplaire !");
			}
			exemplaires.add(new Exemplaire(colonnes[0], dernierDocument));
		}
		return new Mediatheque(exemplaires);
	}

	private Document loadFilm(String[] colonnes) throws FichierMediathequeInvalideException {
		Document dernierDocument;
		if (colonnes.length < 4) {
			throw new FichierMediathequeInvalideException("La ligne pour un film doit contenir au moins 4 colonnes !");
		}
		Film film = new Film(colonnes[2], colonnes[3]);
		if (colonnes.length > 4) {
			film.setRealisateur(colonnes[4]);
		}
		if (colonnes.length > 5) {
			film.setDistributeur(colonnes[5]);
		}
		dernierDocument = film;
		return dernierDocument;
	}

	private Document loadRevue(String[] colonnes) throws FichierMediathequeInvalideException {
		Document dernierDocument;
		if (colonnes.length < 4) {
			throw new FichierMediathequeInvalideException("La ligne pour une revue doit contenir au moins 4 colonnes !");
		}
		Revue revue = new Revue(colonnes[2], colonnes[3]);
		if (colonnes.length > 4) {
			revue.setEditeur(colonnes[4]);
		}
		dernierDocument = revue;
		return dernierDocument;
	}

	private Document loadLivre(String[] colonnes) throws FichierMediathequeInvalideException {
		Document dernierDocument;
		if (colonnes.length < 4) {
			throw new FichierMediathequeInvalideException("La ligne pour un livre doit contenir au moins 4 colonnes !");
		}
		Livre livre = new Livre(colonnes[2], colonnes[3]);
		if (colonnes.length > 4) {
			livre.setAuteur(colonnes[4]);
		}
		if (colonnes.length > 5) {
			livre.setEditeur(colonnes[5]);
		}
		dernierDocument = livre;
		return dernierDocument;
	}

}
