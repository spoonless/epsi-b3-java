import java.util.Scanner;

public class DemoJeuDuPendu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JeuDuPendu jeuDuPendu = new JeuDuPendu("feuille");

		do {
			String motMasque = jeuDuPendu.getMotMasque();
			int nbTentativesRestantes = jeuDuPendu.getNbTentativesRestantes();
			System.out.printf("Le mot : %s\n", motMasque);
			System.out.printf("Proposez une lettre (il reste %d tentatives) : ", nbTentativesRestantes);
			String ligne = scanner.nextLine();
			if (ligne.length() != 1) {
				System.out.println("Vous devez saisir une seule lettre!");
				continue;
			}
			char lettre = ligne.charAt(0);
			if (! jeuDuPendu.proposer(lettre)) {
				System.out.println("Cette lettre n'est pas présente dans le mot à trouver.");
			}
		} while(! jeuDuPendu.isPartieTerminee());

		if (jeuDuPendu.isPartieGagnee()) {
			System.out.println("Bravo, vous avez gagné !");
		} else {
			System.out.printf("Vous avez perdu. Le mot à trouver était %s.\n", jeuDuPendu.getSolution());
		}
	}
}

