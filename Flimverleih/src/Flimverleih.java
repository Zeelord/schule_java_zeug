import java.util.Scanner;

public class Flimverleih {

	public static void main(String[] argv) {
		int eingabe, auswahl;
		boolean newfilm;
		Scanner input = new Scanner(System.in);

		System.out.println("Wollen sie einen Film zurückgeben (1) oder ausleihen (2)");
		auswahl = input.nextInt();
		if (auswahl == 1) {
			do {
				System.out.println("Welchen Film wollen sie zurückgeben");
				eingabe = input.nextInt();
				if (eingabe < 0 || eingabe > 10) {
					System.out.println("Film nicht verfügbar");
				} else {
					System.out.println("Film zurückgegeben");
				}
				System.out.println("Wollen sie noch einen Film zurückgegeben (yes = true / no = false");
				newfilm = input.nextBoolean();
			} while (newfilm);
		} else {
			do {
				System.out.println("Welchen Film wollen sie ausleihen");
				eingabe = input.nextInt();
				if (eingabe < 0 || eingabe > 10) {
					System.out.println("Film nicht verfügbar");
				} else {
					System.out.println("Film hinzugefügt");
				}
				System.out.println("Wollen sie noch einen Film ausleihen (yes = true / no = false");
				newfilm = input.nextBoolean();
			} while (newfilm = true);
		}
		input.close();
	}
}
