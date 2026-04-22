import java.util.Scanner;

public class SumA {

	public static void main(String[] argv) {
		int grenzwert, summe = 0, glieder = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("SumA\nBerechnung der Summe 1+2+3+4+... bis zum Grenzwert");
		System.out.print("Grenzwert: ");
		grenzwert = input.nextInt();
		while (summe < grenzwert) {
			summe += ++glieder;
		}
		System.out.println(
				"Nach " + glieder + " Gliedern ist " + grenzwert + " erreicht. Die Summe ist " + summe);
		input.close();
	}
}
