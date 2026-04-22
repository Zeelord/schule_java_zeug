import java.util.Scanner;

public class Teiler {

	public static void main(String[] argv) {
		int zahl, i = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Teiler");
		System.out.print("Geben Sie eine ganze Zahl ein: ");
		zahl = input.nextInt();
		System.out.print(zahl + " ist druch: ");
		do {
			if (zahl % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (zahl >= i);
		System.out.println("teilbar\nProgrammende Teiler");
		input.close();
	}
}
