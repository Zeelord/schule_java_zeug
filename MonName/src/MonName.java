import java.util.*;

public class MonName {

	public static void main(String[] argv) {
		int monat;
		Scanner input = new Scanner(System.in);
		System.out.print("Ausgabe des Monatsnames\nNummer des Monats (1..12): ");
		monat = input.nextInt();
		switch (monat) {
			case 1:
				System.out.println("Der 1. Monat heisst Januar.");
				break;
			case 2:
				System.out.println("Der 2. Monat heisst Februar.");
				break;
			case 3:
				System.out.println("Der 3. Monat heisst März.");
				break;
			case 4:
				System.out.println("Der 4. Monat heisst April.");
				break;
			case 5:
				System.out.println("Der 5. Monat heisst Mai.");
				break;
			case 6:
				System.out.println("Der 6. Monat heisst Juni.");
				break;
			case 7:
				System.out.println("Der 7. Monat heisst July.");
				break;
			case 8:
				System.out.println("Der 8. Monat heisst August.");
				break;
			case 9:
				System.out.println("Der 9. Monat heisst September.");
				break;
			case 10:
				System.out.println("Der 10. Monat heisst Oktober.");
				break;
			case 11:
				System.out.println("Der 11. Monat heisst November.");
				break;
			case 12:
				System.out.println("Der 12. Monat heisst December.");
				break;

			default:
				System.out.println("hilfe");
				break;
		}
		input.close();
	}
}
