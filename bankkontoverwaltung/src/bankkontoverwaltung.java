import java.util.Scanner;

public class bankkontoverwaltung {

	public static void main(String[] argv) {
		int eingabe = 0;
		float kontostand = 0, veraenderung = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"Wählen sie deine Option aus dem Menü aus\n1) Kontostand abfragen\n2) Geld einzahlen\n3) Geldabheben\n0) Konto schließen");
			eingabe = input.nextInt();
			if (eingabe == 1) {
				System.out.println("Der Kontostand beträgt: " + kontostand + "€");
			}
			if (eingabe == 2) {
				System.out.print("Wie viel Geld wollen sie einzahlen: ");
				veraenderung = input.nextFloat();
				if (veraenderung < 0) {
					System.out.println("einzahlung nicht möglich betrag ist ungültig");
				} else {
					kontostand += veraenderung;
					System.out.println("Der neue kontostand ist " + kontostand + "€");
				}
			}
			if (eingabe == 3) {
				System.out.println("Wie viel Geld wollen sie abheben: ");
				veraenderung = input.nextFloat();
				if (veraenderung < 0 || veraenderung > kontostand) {
					System.out.println("Abheben nicht möglich");
				} else {
					kontostand -= veraenderung;
					System.out.println("Der neue Kontostand ist " + kontostand + "€");
				}
			}

		} while (eingabe != 0);
		input.close();
	}
}
