import java.util.Scanner;

public class Ungerade {

	public static void main(String[] argv) {
		int unteregrenze, oberegrenze, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Untere Grenze: ");
		unteregrenze = input.nextInt();
		System.out.print("Obere Grenze: ");
		oberegrenze = input.nextInt();
		for (i = unteregrenze; i != oberegrenze; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		input.close();
	}
}
