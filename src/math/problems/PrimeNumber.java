package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int a = 0;
		int b = 0;

		String PN = "";

		for (a = 1; a <= 1000000; a++) {

			int c = 0;

			for (b = a; b >= 1; b--) {

				if (a%b == 0) {

					c = c + 1;
				}
			}
			if (c==2) {

				PN = PN + a + "\n";

			}
			System.out.println("List of prime numbers from 1 to 1 million :");

			System.out.println(PN);
		}

	}

}
