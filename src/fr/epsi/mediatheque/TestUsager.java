package fr.epsi.mediatheque;

public class TestUsager {
	
	public static void main(String[] args) {
		try {
			Usager david = new Usager("1231321", "david");
			
			Livre livre = new Livre("Père riche, père pauvre", "1231321321");
			Exemplaire exemplaire = new Exemplaire("131321", livre);
			
			david.emprunter(exemplaire);
		} 
		catch (EmpruntFilmMaxAtteintException e) {
			
		}
		catch (EmpruntMaxAtteintException e) {
			e.printStackTrace();
		}
	}

}
