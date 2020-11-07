public class DemoRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.setLargeur(10);
		r.setLongueur(20);

		System.out.printf("Un rectangle de largeur %.2f et de longueur %.2f\n", r.getLargeur(), r.getLongueur());
		System.out.printf("Le perimettre de ce rectangle est %.2f\n", r.getPerimetre());
		System.out.printf("L'aire de ce rectangle est %.2f\n", r.getAire());
		System.out.println(r.isCarre() ? "Ce rectangle est un carre" : "Ce rectangle n'est pas un carre");

		r.transpose();
		System.out.printf("Un rectangle de largeur %.2f et de longueur %.2f\n", r.getLargeur(), r.getLongueur());
		System.out.printf("Le perimettre de ce rectangle est %.2f\n", r.getPerimetre());
		System.out.printf("L'aire de ce rectangle est %.2f\n", r.getAire());
		System.out.println(r.isCarre() ? "Ce rectangle est un carre" : "Ce rectangle n'est pas un carre");

		r.setLargeur(r.getLongueur());
		System.out.printf("Un rectangle de largeur %.2f et de longueur %.2f\n", r.getLargeur(), r.getLongueur());
		System.out.printf("Le perimettre de ce rectangle est %.2f\n", r.getPerimetre());
		System.out.printf("L'aire de ce rectangle est %.2f\n", r.getAire());
		System.out.println(r.isCarre() ? "Ce rectangle est un carre" : "Ce rectangle n'est pas un carre");
	}

}

