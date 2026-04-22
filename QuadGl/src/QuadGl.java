import java.util.Scanner;

public class QuadGl {

	public static void main(String[] argv) {
		float a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Quadratische Gleichung a*x*x+b*x+c=0");
		System.out.print("a: ");
		a = input.nextFloat();
		System.out.print("b: ");
		b = input.nextFloat();
		System.out.print("c: ");
		c = input.nextFloat();
		float pq1, pq2;
		float d = b / a;
		float e = c / a;
		pq1 = -(d / 2);
		pq2 = (d / 2) * (d / 2) - e;
		if (pq2 == 0) {
			System.out.println("Keine reelle Lösung");
		} else if (pq2 == 0) {
			System.out.println(b / (a * 2));
		} else {
			System.out.println("x(1) =" + (pq1 - Math.sqrt(pq2)) + " ; x(2) = " + (pq1 + Math.sqrt(pq2)));
		}
		input.close();
	}
}
