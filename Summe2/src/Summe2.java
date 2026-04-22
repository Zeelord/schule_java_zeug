import java.util.Scanner;

public class Summe2 {

	public static void main(String[] argv) {
		int i, summe = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Zahl: ");
		for (i = input.nextInt(); i <= 100; i++) {
			summe += i;
		}
		System.out.println("Die Summe beträgt " + summe);
	}
}
