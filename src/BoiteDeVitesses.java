public class BoiteDeVitesses {
	
	public static final int VITESSE_MAX = 5;
	public static final int VITESSE_MIN = 1;
	public static final int POINT_MORT = 0;
	public static final String[] LIBELLES_VITESSE = {"point mort", "première", "seconde", "troisième", "quatrième", "cinquième"};
	
	private int vitesse;
	
	public void changerVitesse() {
		if (vitesse < BoiteDeVitesses.VITESSE_MAX) {
			++vitesse;
		}
	}
	
	public boolean isVitesseMax() {
		return (this.vitesse == BoiteDeVitesses.VITESSE_MAX);
	}
	
	public void retrograder() {
		if (vitesse > BoiteDeVitesses.VITESSE_MIN) {
			--vitesse;
		}
	}
	
	public void setPointMort() {
		vitesse = BoiteDeVitesses.POINT_MORT;
	}
	
	public int getVitesse() {
		return vitesse;
	}
	
	public String toString() {
		return BoiteDeVitesses.LIBELLES_VITESSE[vitesse];
	}
	
}