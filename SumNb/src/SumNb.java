import java.util.*;

public class SumNb {

	public static void main(String[] argv) {
		int eingabe, gesamt = 0, i;
		Scanner input = new Scanner(System.in);
		System.out.println("SumNa");
		System.out.println("Berechnung der Summe der reihe:\n1*1+3*3+5*5+...+(2n-1)^2");
		System.out.print("Geben Sie eine pos. ganze Zahl ein (n) : ");
		eingabe = input.nextInt();
		for (i = 1; i <= eingabe; i++) {
			gesamt += (2 * i - 1) * (2 * i - 1);
		}
		System.out.println("Die Summe ist: " + gesamt);
		input.close();
	}
}
