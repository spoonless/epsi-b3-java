import java.util.Scanner;

public class InfoNombre {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double somme = .0;
		int nb = 0;
		int nbNombresPairs = 0;

		for (nb = 0 ; nb < 10; ++nb) {
			System.out.print("Un nombre : ");
			double valeur = sc.nextDouble();
			somme += valeur;
			min = Math.min(min, valeur);
			max = Math.max(max, valeur);
			if (valeur % 2 == 0) {
				++nbNombresPairs;
			}
		}
		
		System.out.println("Le plus petit : " + min);
		System.out.println("Le plus grand : " + max);
		System.out.println("La somme : " + somme);
		double moyenne = somme / nb;
		System.out.println("La moyenne : " + moyenne);
		System.out.println("Nombre de nombres pairs : " + nbNombresPairs);
		
	}

}
