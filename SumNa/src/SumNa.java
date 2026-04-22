import java.util.Scanner;

public class SumNa {

	public static void main(String[] argv) {
		int eingabe, gesamt = 0, i;
		Scanner input = new Scanner(System.in);
		System.out.println("SumNa");
		System.out.println("Berechnung der Summe der reihe:\n1*1+2*2+.. +n*n");
		System.out.print("Geben Sie eine pos. ganze Zahl ein (n) : ");
		eingabe = input.nextInt();
		for (i = 1; i <= eingabe; i++) {
			gesamt += i * i;
		}
		System.out.println("Die Summe ist: " + gesamt);
		input.close();
	}
}
