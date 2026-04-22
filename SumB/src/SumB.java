import java.util.Scanner;

public class SumB {

	public static void main(String[] argv) {
		int grenzwert, summe = 0, glieder = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("SumA\nBerechnung der Summe 1-2+3-4+...+ (2n+1)-2n +... bis zum Grenzwert");
		System.out.print("Grenzwert: ");
		grenzwert = input.nextInt();
		while (summe < grenzwert) {
			if (glieder % 2 == 0) {
				summe += ++glieder;
			} else
				summe -= ++glieder;
		}
		System.out.println(
				"Nach " + glieder + " Gliedern ist " + grenzwert + " erreicht. Die Summe ist " + summe);
		input.close();
	}
}
