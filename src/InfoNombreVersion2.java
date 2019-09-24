import java.util.ArrayList;
import java.util.Scanner;

public class InfoNombreVersion2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double somme = .0;
		int nbNombresPairs = 0;
		int nb;
		
		ArrayList<Double> liste = new ArrayList<>();
		
		
		for (nb = 0 ; nb < 10; ++nb) {
			System.out.print("Un nombre : ");
			double valeur = sc.nextDouble();
			liste.add(valeur);
		}
		
		System.out.println("Le plus petit : " + min);
		System.out.println("Le plus grand : " + max);
		System.out.println("La somme : " + somme);
		double moyenne = somme / nb;
		System.out.println("La moyenne : " + moyenne);
		System.out.println("Nombre de nombres pairs : " + nbNombresPairs);
		
	}

}
