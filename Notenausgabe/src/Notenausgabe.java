import java.util.*;

public class Notenausgabe {

	public static void main(String[] argv) {
		int note;
		Scanner input = new Scanner(System.in);
		System.out.print("Note eingeben: ");
		note = input.nextInt();
		switch (note) {
			case 1:
				System.out.println("sehr gut");
				break;
			case 2:
				System.out.println("gut");
				break;
			case 3:
				System.out.println("befriedigent");
				break;
			case 4:
				System.out.println("ausreichend");
				break;
			case 5:
				System.out.println("mangelhaft");
				break;
			case 6:
				System.out.println("ungenügent");
				break;
			default:
				System.out.println("Hilfe");
				break;
		}
		input.close();
	}
}
