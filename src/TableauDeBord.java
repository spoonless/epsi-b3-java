import java.util.Scanner;

public class TableauDeBord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoiteDeVitesses boiteDeVitesses = new BoiteDeVitesses();
		while(true) {
			System.out.println("c) changer de vitesse");
			System.out.println("r) retrograder");
			System.out.println("p) point mort");
			System.out.println("q) quitter");
			String choix = sc.nextLine();

			switch(choix) {
			case "c":
				boiteDeVitesses.changerVitesse();
				System.out.println(boiteDeVitesses);
				break;
			case "r":
				boiteDeVitesses.retrograder();
				System.out.println(boiteDeVitesses);
				break;
			case "p":
				boiteDeVitesses.setPointMort();
				System.out.println(boiteDeVitesses);
				break;
			case "q":
				System.out.println("Merci");
				return;
			}
		}
	}
}
