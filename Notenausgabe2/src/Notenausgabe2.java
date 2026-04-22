import java.util.*;

public class Notenausgabe2 {

	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		String note;
		note = input.nextLine();
		switch (note) {
			case "sehr gut":
				System.out.println(1);
				break;
			case "gut":
				System.out.println(2);
				break;
			case "befriedigent":
				System.out.println(3);
				break;
			case "ausreichend":
				System.out.println(4);
				break;
			case "mangelhaft":
				System.out.println(5);
				break;
			case "ungenügend":
				System.out.println(6);
				break;

			default:
				System.out.println("hilfe");
				break;
		}
		input.close();
	}
}
