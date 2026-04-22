import java.util.Scanner;

public class Ratespiel {

	public static void main(String[] argv) {
		int zahl = (int) (Math.random() * 100), ratezahl, versuch = 0;
		System.out.println("Ratespiel Zufallszahl zwischen 0 und 100 erzeugt");
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Eingabe: ");
			ratezahl = input.nextInt();
			if (ratezahl > zahl) {
				System.out.println("Die gesuchte Zahl ist kleiner...");
			} else if (ratezahl < zahl) {
				System.out.println("Die gesuchte Zahl ist größer...");
			}
			versuch++;
		} while (zahl != ratezahl);
		System.out.println("Gesuchte Zahl nach " + versuch + " Versuchen gefunden");
		input.close();
	}
}
