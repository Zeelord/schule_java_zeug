import java.util.Scanner;

public class Sterne {

	public static void main(String[] argv) {
		int anzahl, zahlsterne;
		Scanner input = new Scanner(System.in);
		System.out.print("Wie viele Sterne sollen ausgegeben werden: ");
		anzahl = input.nextInt();
		for (zahlsterne = anzahl; zahlsterne != 0; zahlsterne--) {
			System.out.print("* ");
		}
		input.close();
	}
}
