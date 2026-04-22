import java.util.*;

public class KinderG {
	public static void main(String argv[]) {
		int kinder, einkommen, kindergeld;
		Scanner input = new Scanner(System.in);
		System.out.println("Kindergeldberechnung");
		System.out.print("Ihr Jahreseinkommen in D$: ");
		einkommen = input.nextInt();
		System.out.print("Anzahl der Kinder: ");
		kinder = input.nextInt();

		if (einkommen < 45000) {
			if (kinder == 1)
				kindergeld = 70;
			if (kinder == 2)
				kindergeld = 200;
			if (kinder == 3)
				kindergeld = 420;
			else
				kindergeld = 420 + (kinder - 3) * 240;
		} else {
			if (kinder == 1)
				kindergeld = 70;
			if (kinder == 2)
				kindergeld = 140;
			if (kinder == 3)
				kindergeld = 280;
			else
				kindergeld = 280 + (kinder - 3) * 140;
		}
		System.out.println("Ergebnis: " + kindergeld + " D$ Kindergeld.");
		System.out.println("Programmende Kindergeld");
		input.close();
	}
}
