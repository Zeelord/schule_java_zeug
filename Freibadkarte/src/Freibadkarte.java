import java.util.Scanner;

public class Freibadkarte {

	public static void main(String[] argv) {
		int alter, anzahl, oanzahl;
		float preis = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Freibad Preise");
		System.out.print("Anzahl:");
		anzahl = input.nextInt();
		oanzahl = anzahl;
		while (anzahl != 0) {

			System.out.print("Alter: ");
			alter = input.nextInt();
			if (alter <= 12) {
				preis += 3f;
			} else if (alter >= 13 && alter <= 17) {
				preis += 5f;
			} else if (alter >= 18 && alter <= 64) {
				preis += 8f;
			} else {
				preis += 4f;
			}
			anzahl--;
		}
		if (oanzahl >= 5) {
			preis *= 0.9f;
		}
		System.out.println("Die Karten kosten " + preis + " Euro.");
		input.close();
	}
}
