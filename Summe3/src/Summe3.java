public class Summe3 {

	public static void main(String[] argv) {
		int i, summe = 0;
		for (i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				summe += i;
			}
		}
		System.out.println("Die Summe beträgt " + summe);
	}
}
