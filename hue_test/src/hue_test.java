import java.util.Scanner;

public class hue_test {

	public static void main(String[] argv) {
		int zahl, i, summe = 0;
		Scanner input = new Scanner(System.in);
		zahl = input.nextInt();
		for (i = zahl; i <= zahl + 4; i++) {
			summe += i;
		}
		System.out.println(summe);
	}
}
