package geometrie;

import java.util.Scanner;

public class ApprentissageFiguresGeometriques {

	private FigureComposee figure = new FigureComposee();
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		new ApprentissageFiguresGeometriques().start();
	}

	public void start() {
		while(afficherMenu()) {
			print();
			print("Votre nouveau choix");
		}
	}

	private boolean afficherMenu() {
		print("1) Ajouter un rectangle");
		print("2) Ajouter un disque");
		print("3) Afficher le perimetre et l'aire");
		print("Autre chiffre pour quitter");
		switch (scanner.nextInt()) {
		case 1:
			creerRectangle();
			return true;
		case 2:
			creerDisque();
			return true;
		case 3:
			afficherPerimetreEtAire();
			return true;
		default:
			print("Au revoir");
			return false;
		}
	}

	private void creerRectangle() {
		print("Quelle est la largeur du rectangle ?");
		double longueur = scanner.nextDouble();
		print("Quelle est la longueur du rectangle ?");
		double largeur = scanner.nextDouble();

		Rectangle r = new Rectangle(largeur, longueur);
		figure.ajouter(r);
		printf("Rectange de largeur %.04f et de longueur %f", r.getLargeur(), r.getLongueur());
		printf("Ce rectangle a un perimetre de %.04f et une aire de %.04f", r.getPerimetre(), r.getAire());
	}

	private void creerDisque() {
		print("Quel est le rayon du disque ?");
		double rayon = scanner.nextDouble();

		Disque d = new Disque(rayon);
		figure.ajouter(d);
		printf("Disque de rayon %.04f", d.getRayon());
		printf("Ce disque a un perimetre de %.04f et une aire de %.04f", d.getPerimetre(), d.getAire());
	}

	private void afficherPerimetreEtAire() {
		printf("Perimetre total : %.04f", figure.getPerimetre());
		printf("Aire totale : %.04f", figure.getAire());
	}

	private void print() {
		System.out.println();
	}

	private void print(String message) {
		System.out.println(message);
	}

	private void printf(String message, Object ... params) {
		System.out.printf(message, params);
		System.out.println();
	}

}

