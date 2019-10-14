package fr.epsi.mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Usager {

	private static final int MAX_EMPRUNTS_FILM = 3;
	private static final int MAX_EMPRUNTS = 6;
	private String matricule;
	private String nom;
	private List<Exemplaire> emprunts = new ArrayList<>();

	public Usager(String matricule, String nom) {
		this.matricule = matricule;
		this.nom = nom;
	}
	
	public void emprunter(Exemplaire exemplaire) throws EmpruntMaxAtteintException {
		if (emprunts.size() == Usager.MAX_EMPRUNTS) {
			throw new EmpruntMaxAtteintException(Usager.MAX_EMPRUNTS);
		}
		if (exemplaire.getDocument() instanceof Film 
				&& getNbFilmsEmpruntes() == Usager.MAX_EMPRUNTS_FILM) {
			throw new EmpruntMaxAtteintException(Usager.MAX_EMPRUNTS_FILM);
		}
		emprunts.add(exemplaire);
	}

	private int getNbFilmsEmpruntes() {
		int nbFilms = 0;
		for (Exemplaire emprunt : emprunts) {
			if (emprunt.getDocument() instanceof Film) {
				++nbFilms;
			}
		}
		return nbFilms;
	}
	
	public void rendre(Exemplaire exemplaire) {
		emprunts.remove(exemplaire);
	}

	public String getMatricule() {
		return matricule;
	}

	public String getNom() {
		return nom;
	}

}
