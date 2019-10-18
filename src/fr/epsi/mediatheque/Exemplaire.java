package fr.epsi.mediatheque;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class Exemplaire {

	private String code;
	private Document document;
	private LocalDate dateEmprunt;
	
	public Exemplaire(String code, Document document) {
		this.code = code;
		this.document = document;
		this.document.getExemplaires().add(this);
	}
	
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	
	public LocalDate getDateRetour() {
		if (dateEmprunt == null) {
			return null;
		}
		YearMonth aout = Year.now().atMonth(Month.AUGUST);
		LocalDate debutPeriodeVacances = aout.atDay(15);
		LocalDate finPeriodeVacances = aout.atEndOfMonth();
		if (dateEmprunt.compareTo(debutPeriodeVacances) >= 0 && dateEmprunt.compareTo(finPeriodeVacances) <= 0) {
			return Year.now().atMonth(Month.SEPTEMBER).atDay(1);
		}
		return dateEmprunt.plusWeeks(2);
	}
	
	public void emprunter() {
		this.dateEmprunt = LocalDate.now();
	}
	
	public void rendre() {
		this.dateEmprunt = null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Exemplaire) {
			Exemplaire exemplaire = (Exemplaire) obj;
			return this.code.equals(exemplaire.code);
		}
		return false;
	}

}
