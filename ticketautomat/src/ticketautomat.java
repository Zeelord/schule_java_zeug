import java.util.Scanner;

public class ticketautomat {

	public static void main(String[] argv) {
		int tarifzone, ticketart;
		float preis;
		Scanner input = new Scanner(System.in);
		System.out.print("Wählen sie eine Tarifzone aus | 1 = kurzstrecke / 2 = normal\nTarifzone: ");
		tarifzone = input.nextInt();
		System.out.print(
				"Wählen sie eine Ticketart aus | 1 = Einzelfahrkarte / 2 = Tageskarte / 3 = Jahresticket\nTicketart: ");
		ticketart = input.nextInt();
		if (tarifzone > 2 || ticketart > 3) {
			System.out.println("Fehlerhafte eingabe");
		} else {
			if (tarifzone == 1)
				preis = 3f;
			else
				preis = 5f;
			if (ticketart == 1)
				System.out.println("Der Preis beträgt: " + preis + "€");
			if (ticketart == 2)
				System.out.println("Der Preis beträgt: " + preis * 3f + "€");
			if (ticketart == 3)
				System.out.println("Der Preis beträgt: " + preis * 365f + "€");
		}
	}
}
