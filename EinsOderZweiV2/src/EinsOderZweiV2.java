import java.util.Scanner;

public class EinsOderZweiV2 {

	public static void main(String[] argv) {
		int zahl = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Waehlen Sie(1/2):");
		do {
			zahl = input.nextInt();
			if (zahl != 1 && zahl != 2) {
				System.out.println("Fehleingabe!");
			}
		} while (zahl != 1 && zahl != 2);
		System.out.println("Sie haben " + zahl + " gewaehlt");
		input.close();
	}
}
