import java.util.Scanner;

public class ProdAdd {

	public static void main(String[] argv) {
		float zahl1, zahl2;
		Scanner input = new Scanner(System.in);
		System.out.println("Berechnung des Produktes ueber Addition");
		System.out.print("Multiplikatior: ");
		zahl1 = input.nextFloat();
		System.out.print("Muliplikand: ");
		zahl2 = input.nextFloat();
		System.out.println("Das Produkt ist " + zahl1 * zahl2 + ".");
		input.close();
	}
}
