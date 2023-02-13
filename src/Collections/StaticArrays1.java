package Collections;

public class StaticArrays1 {

	public static void main(String[] args) {
		// ______ Limitations_____ 2 major Limitations
		// 1.Size is fixd Statuc Array,To overcome this problem we will use Dynamic
		// Array -ArrayList
		// 2.Similar DataTpe,To over come this problem Dynamic Array used
		// --Arraylist/Object Array

		// ____Use Cases of Arrays _____
		// when we have Static data we will go with Arrays
		// Months 12 ,Days 31

		// ____Case(1):____
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		// System.out.println(a[5]); // ArrayIndexOutOfBoundsException:
		// System.out.println(a[-1]); // ArrayIndexOutOfBoundsException

		System.out.println("----------------------");
		// ____Case(2):____
		// Array Literal Ex :
		// int i[]={10,20,30,40,50}
		int b[] = { 1, 2, 3, 4, 5 };
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);

		System.out.println("----------------------");

		// *** write {< lessthen} in for loop
		// Don't write [<=] in for loop because chance of getting Array Index Outof bond
		// exception
		// if u write <= better to write length-1

		// Print All the value form the Array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------------------");

		// _______ Enhanced For Loop / for each Loop ______
		// main usage of this Array is we cannt get Array Index Out of ond exception
		// First u check what type of Array It is Immediately u can write int here
		// int with variable name Any variable name Generally e because Element
		// then ArrayName What is the Array Name here
		// here e will go tho the each index of a
		for (int e : a) {
			System.out.println(e);
		}
		System.out.println("----------------------");
		// _____Double Array______
		double[] d = new double[4];
		d[0] = 10.23;
		d[1] = 10;
		d[2] = 23.23;
		d[3] = 34.21;
		System.out.println(d[3]);
		for (double f : d) {
			System.out.println(f);
		}
		System.out.println("----------------------");
		// ______Char Array______
		char ch[] = new char[5];
		ch[0] = 'A';
		ch[1] = 'Y';
		ch[2] = 'A';
		ch[3] = 'A';
		ch[4] = 'N';

		for (char c : ch) {
			System.out.println(c);
		}
		// _____String Array____
		String lang[] = new String[5];
		lang[0] = "Irfan";
		lang[1] = "Ayaan";
		lang[2] = "Reshma";
		lang[3] = "Afsheen";
		lang[4] = "Mummy";

		for (String str : lang) {
			System.out.println(str);
		}
		System.out.println("----------------------");
		// ____Object Array_____
		Object emp[] = new Object[4];
		emp[0] = "tom";
		emp[1] = 20;
		emp[2] = "sam";
		emp[3] = 10.33;
		for (Object oj : emp) {
			System.out.println(oj);
		}

	}
}
