import java.util.Scanner;

public class Wochentag {

	public static void main(String[] argv) {
		int jahr, monat, tag;
		Scanner input = new Scanner(System.in);
		System.out.print("Tag: ");
		tag = input.nextInt();
		System.out.print("Monat: ");
		monat = input.nextInt();
		System.out.print("Jahr: ");
		jahr = input.nextInt();
		if (monat <= 2) {
			monat += 10;
			jahr -= 1;
		} else {
			monat -= 2;
		}
		int c = jahr / 100;
		int y = jahr % 100;
		int wochentag = (((26 * monat - 2) / 10) + tag + y + (y / 4) + (c / 4) - 2 * c) % 7;
		switch (wochentag) {
			case 0:
				System.out.println("Sonntag");
				break;
			case 1:
				System.out.println("Montag");
				break;
			case 2:
				System.out.println("Dienstag");
				break;
			case 3:
				System.out.println("Mittwoch");
				break;
			case 4:
				System.out.println("Donnerstag");
				break;
			case 5:
				System.out.println("Freitag");
				break;
			case 6:
				System.out.println("Samstag");
				break;
			default:
				System.out.println("hilfe");
				break;
		}
	}
}
