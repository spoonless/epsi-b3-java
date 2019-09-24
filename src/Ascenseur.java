
public class Ascenseur {
	
	private int etage;
	
	public int getEtage() {
		return etage;
	}
	
	public void appeler(int etage) {
		this.etage = etage;
	}
	
	public String toString() {
		return "L'ascenseur est à l'étage : " + etage;
	}

	public static void main(String[] args) {
		Ascenseur ascenseur = new Ascenseur();
		ascenseur.appeler(10);
		System.out.println(ascenseur);
		ascenseur.appeler(48);
		System.out.println(ascenseur);
		ascenseur.appeler(0);
		System.out.println(ascenseur);
	}
}
