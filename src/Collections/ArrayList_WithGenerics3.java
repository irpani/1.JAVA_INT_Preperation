package Collections;

import java.util.ArrayList;

//Generics -- Integer Type
public class ArrayList_WithGenerics3 {

	public static void main(String[] args) {

		// int AL:
		// ---------------
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);

		// for each Loop
		// Here What type Of Data INTEGER type not int type
		// In interger Class also we can hold int values
		for (Integer e : ar) {
			System.out.println(e);
		}
		System.out.println("-------------");
		// (or) below both are Same
		for (int e : ar) {
			System.out.println(e);
		}

		// Double AL:
		// ---------------
		ArrayList<Double> ar1 = new ArrayList<Double>();
		ar1.add(10.33);
		ar1.add(12.33);
		ar1.add(100.0);
		System.out.println("-------------");
		for (Double d : ar1) {
			System.out.println(d);
		}

		// String AL:
		// ---------------
		ArrayList<String> prodList = new ArrayList<String>();

		prodList.add("Apple");
		prodList.add("samsung");
		prodList.add("nokia");
		System.out.println("-------------");
		for (String e : prodList) {
			System.out.println(e);
		}

		// Object Data AL:
		// ---------------
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Dhara");
		empData.add(25);
		empData.add('f');
		empData.add(34.55);
		empData.add(true);
		System.out.println("---------------");

		for (Object e : empData) {
			System.out.println(e);
		}

	}
}