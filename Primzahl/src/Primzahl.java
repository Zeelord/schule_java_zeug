import java.util.*;

public class Primzahl {

	public static void main(String[] argv) {
		int i = 2;
		long zahl;
		boolean prim = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Primzahlipruefung");
		System.out.println("Ganze Zahl eingeben: ");
		zahl = input.nextInt();
		if (zahl > 1) {
			while (i * i <= zahl && prim == false) {
				if (zahl % i == 0) {
					prim = true;
				}
				i++;
			}
		} else {
			prim = true;
		}
		if (prim == true) {
			System.out.println(zahl + " ist keine Primzahl");
		} else
			System.out.println(zahl + " ist eine Primzahl");
		input.close();
	}
}
