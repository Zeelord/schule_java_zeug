import java.text.DecimalFormat;
import java.util.*;

public class Brief {

	public static void main(String[] argv) {
		int gewicht;
		double kosten = 0;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Portoberechung");
		System.out.print("Gewicht des Briefes in g: ");
		gewicht = input.nextInt();
		if (gewicht <= 20) {
			kosten = 1.00;
		} else if ((gewicht > 20) && (gewicht <= 50)) {
			kosten = 1.70;
		} else if ((gewicht > 50) && (gewicht <= 100)) {
			kosten = 2.40;
		} else if ((gewicht > 100) && (gewicht <= 250)) {
			kosten = 3.20;
		} else if ((gewicht > 250) && (gewicht <= 500)) {
			kosten = 4.00;
		} else if ((gewicht > 500) && (gewicht <= 1000)) {
			kosten = 4.80;
			System.out.println("Wird als Packet verschickt");
		}
		System.out.println("Kosten: " + df.format(kosten) + "D$");
		input.close();
	}
}
