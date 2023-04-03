package DataTypes;

public class Loops5 {

	public static void main(String[] args) {

		// _____Loops______
		// While Loop:
		int j = 1;
		while (j <= 10) {
			System.out.println(j);
			// j++;
			// ++j;
			j = j + 1;
		}

		/*
		 * int k = 1; while (true) { System.out.println(k); k++; if (k == 20) { break; }
		 * } }
		 */

		// for Loop:
		// ___Typical for loop___
		// case1:
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		// ____ case2:_____
		int i = 1;
		for (; i < 10; i++) {
			System.out.println(i);
		}
		// _____case3:____
		int k = 1;
		for (; k < 10;) {

			k++;
			System.out.println(k);
		}
		// case 4: ____Infinite Loop____
		/*
		 * for (int p = 1; p <= 10;) { System.out.println(p); } // case 5: ____Infinite
		 * Loop____ for (;;) { System.out.println("Welcome to Hotel Taj"); }
		 */
		// _____case (6)____
		// print the first 5 Even Numbers

		for (int even = 2; even <= 10; even = even + 2) {
			System.out.println(even);
		}
		// ____Case(7)___ Double Datatype
		for (double d = 1; d <= 10; d++) {
			System.out.println(d);
		}
		// ____Case(8)___ Char Datatype
		for (char c = 'A'; c <= 'z'; c++) {
			System.out.println(c);
		}
		// ____Case(9)___
		System.out.println(10 % 2);
		System.out.println(10 % 3);
		// _____Print Odd Numbers from 1 -100____
		for (int t = 1; t <= 100; t++) {
			if (t % 2 == 1) {

				System.out.println(t);
			}
		}
		// ____Print Even Numbers from 1 -100____
		for (int l = 1; l <= 100; l++) {
			if (l % 2 == 0) {

				System.out.println(l);
			}
		}

		// ____ Do While Loop _____

		// _____Assignment_____
		/*
		 * 00 01 02 03 10 11 12 13 20 21 22 23 31 32 33 34
		 */

		for (int c = 0; c < 4; c++) {

			for (int d = 0; d < 4; d++) {
				System.out.print(c + "" + d + " ");
			}
			System.out.println();
		}

		// ______for_each Loop_____

	}
}
