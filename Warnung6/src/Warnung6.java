import java.util.*;

public class Warnung6 {

	public static void main(String[] argv) {
		int messwert;
		string test, name;

		test = name;
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie den Messwert ein: ");
		messwert = input.nextInt();

		if ((messwert >= 0) && (messwert <= 35)) {
			System.out.println("normale Temperatur");
		} else if ((messwert >= 36) && (messwert <= 45)) {
			System.out.println("erhöhte Temperatur");
		} else if ((messwert >= 46) && (messwert <= 55)) {
			System.out.println("Warnung");
		} else if (messwert >= 56) {
			System.out.println("Abschaltung");
		} else {
			System.out.println("Wert ist nicht erlaubt");
		}
		input.close();
	}
}
