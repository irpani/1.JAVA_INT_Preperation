package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLis_Methods4 {

	public static void main(String[] args) {

		// Q:In How many ways Arraylist Defined?
		// (1).ArrayList ar = new ArrayList();
		// (2).list ar=new ArrayList();
		// (3).ArrayList<Integer> ar = new ArrayList<Integer>();
		// (4).ArrayList<String> ar = new ArrayList<String>();

		//
		ArrayList ar = new ArrayList();
		// Tedious Process to Add Elements Everytime like this....
		ar.add(100);// 0
		ar.add(200);// 1
		ar.add(300);// 2
		ar.add(400);// 3

		// So we can add All elements Simple in 1 Line
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(numbers); // [10,20,30,40]

		// If I Directly Print I'm able to get the values but In static Arrays we get
		// Garbage Value
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(a); // [I@7852e922
		// Not required for loop we can get elements with below line
		System.out.println(Arrays.toString(a));// [10,20,30,40,50]

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("JAVA", "PYTHON", "JS"));
		System.out.println(names);

		// Collections.Sort()
		// .equals()
		// ---------------
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));
		// For Ex:
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);

		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));

		if (l1.equals(l3)) {
			System.out.println("pass");
		}

		// webPage there is a Drop down ---5 Elements ---actlist

		// removeAll():
		// ---------------
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		l5.removeAll(l4);
		System.out.println(l5);// //remove all inside l4 [E]
		System.out.println(l4);// [A,B,C,D,F]

		// retainAll():-
		// ---------------
		// Find out the Common Elements:
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "PYTHON", "JS", "DS", "ALGO"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "PYTHON", "JS", "DS", "PHP"));

		lang1.retainAll(lang2); // meas Common Elemetns in lang1 & lang2

		// addAll():-
		// ---------------
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("p", "q", "r"));
		l6.addAll(l7);//
		System.out.println(l6);// [A, B, C, D, F, p, q, r] Inside l6 p ,q, r are also added

		// clear():
		// ---------
		l7.clear();
		System.out.println(l7);// []

		// clone():
		// ---------
		l7.clone();

	}

}
