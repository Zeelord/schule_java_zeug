import java.util.Scanner;

public class Matrix {

	public static void main(String[] argv) {
		int eingabe, i;
		Scanner input = new Scanner(System.in);
		System.out.println("Marix von 0 .. 99");
		System.out.print("Zahl (2..9): ");
		eingabe = input.nextInt();
		for (i = 0; i <= 99; i++) {
			if (i % 10 == 0)
				System.out.println();
			if (i % eingabe == 0 && i != 0 || (i - eingabe) % 10 == 0 || i / 10 < eingabe + 1 && i / 10 >= eingabe)
				System.out.print(" * ");
			else if (i < 10)
				System.out.print(" " + i + " ");
			else
				System.out.print(i + " ");
		}
		System.out.println();
		input.close();
	}
}
