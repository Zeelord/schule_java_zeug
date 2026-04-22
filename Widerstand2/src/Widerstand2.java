import java.util.*;

public class Widerstand2 {

	public static void main(String[] argv) {
		float r1, r2, rg;
		String wahl;
		Scanner input = new Scanner(System.in);
		System.out.println("Gib an ob Parallelschaltung (p) oder Reihenschaltung (r)");
		wahl = input.nextLine();
		System.out.println("Gib zuerst den Wiederstand r1, dann r2 ein:");
		r1 = input.nextFloat();
		r2 = input.nextFloat();
		if (wahl.equals("p") || wahl.equals("P"))
			rg = r1 * r2 / (r1 + r2);
		else {
			if (wahl.equals("r") && wahl.equals("R")) {
				rg = r1 + r2;
			} else {
				System.out.println("Fehlermeldung");
				rg = 0;
			}
		}
		System.out.println("Der wiederstand beträgt: " + rg);
		input.close();
	}
}
