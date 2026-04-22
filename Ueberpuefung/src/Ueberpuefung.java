import java.util.*;

public class Ueberpuefung {

	public static void main(String[] argv) {
		int alter, einkommen;
		Scanner input = new Scanner(System.in);
		System.out.print("Bitte das Alter eingeben: ");
		alter = input.nextInt();
		System.out.print("Bitte das Einkommen eingben: ");
		einkommen = input.nextInt();
		if (alter > 17 && einkommen >= 20000) {
			System.out.println("Das Darlehen kann gewährt werden");
		} else {
			System.out.println("Kein Darlehen möglich");
		}
	}
}
