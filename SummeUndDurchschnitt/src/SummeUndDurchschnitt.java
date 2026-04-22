import java.util.Scanner;

public class SummeUndDurchschnitt {

	public static void main(String[] argv) {
		float eingabe, ergebnis = 0;
		int anzahl = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("SummeUndDurchschnitt");
		do {
			System.out.print("Zahl (Ende mit 0): ");
			eingabe = input.nextFloat();
			ergebnis += eingabe;
			anzahl++;
		} while (eingabe != 0);
		System.out.println("Summe: " + ergebnis + "; Durchschnitt " + ergebnis / --anzahl);
		input.close();
	}
}
