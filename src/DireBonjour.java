import java.util.List;
import java.util.Scanner;

public class DireBonjour {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Comment vous appelez-vous ?");
		String line = sc.nextLine();
		System.out.println("Bonjour, " + line);
	}

}
