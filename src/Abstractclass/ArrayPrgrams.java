package Abstractclass;

public class ArrayPrgrams {

	public static void addarrelem(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				if (a[i] % 2 == 0) {

					a[i] = a[i] + b[j];
				}
			}
			System.out.println(a[i]);
		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 13, 14 };
		int[] b = { 6, 7, 8, 9, 10, 11, 12 };

		// o/p: {1,2,6,3,4,7,5,13,8,14,9}

		addarrelem(a, b);

	}

}
