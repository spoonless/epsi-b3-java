package fr.epsi.mediatheque;

import java.util.List;
import java.util.Scanner;

public class EmprunterDocument {
	private Scanner sc = new Scanner(System.in);
	private Mediatheque mediatheque = new Mediatheque();
	
	public EmprunterDocument() {
		mediatheque.init();
	}
	
	private String getInput(String message) {
		System.out.println(message);
		return sc.nextLine();
	}
	
	public Usager creerUsager() {
		String matricule = getInput("Matricule de l'usager :");
		String nom = getInput("Nom de l'usager :");
		return new Usager(matricule, nom);
	}
	
	public static void main(String[] args) {
		EmprunterDocument app = new EmprunterDocument();
		Usager usager = app.creerUsager();
	}

}
