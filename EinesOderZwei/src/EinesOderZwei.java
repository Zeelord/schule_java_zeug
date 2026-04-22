import java.util.Scanner;

public class EinesOderZwei {

	public static void main(String[] argv) {
		int zahl;
		Scanner input = new Scanner(System.in);
		System.out.println("Waehlen Sie(1/2)");
		zahl = input.nextInt();
		while (zahl != 1 && zahl != 2) {
			System.out.println("Fehleingabe!");
			System.out.println("Weahlen Sie(1/2):");
			zahl = input.nextInt();
		}
		System.out.println("Sie haben " + zahl + " gewaehlt");
		input.close();
	}
}
