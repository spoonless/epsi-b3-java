import java.util.Scanner;

public class TableauDeBord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BoiteDeVitesses boite = new BoiteDeVitesses();
		int choix = 0;

		do {
			System.out.println("1) Changer de vitesse");
			System.out.println("2) Rétrograder");
			System.out.println("3) Passer au point mort");
			System.out.println("4) Quitter");

			choix = sc.nextInt();

			switch (choix) {
			case 1:
				boite.changerVitesse();
				System.out.println("Vitesse courante " + boite);
				break;
			case 2:
				boite.retrograder();
				System.out.println("Vitesse courante " + boite);
				break;
			case 3:
				boite.setPointMort();
				System.out.println("Vitesse courante " + boite);
				break;
			case 4:
				System.out.println("Merci");
				break;
			default:
				System.out.println("Erreur de choix!");
			}
		} while (choix != 4);
	}
}
