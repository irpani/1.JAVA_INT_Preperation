package Collections;

import java.util.ArrayList;

public class DynamicArray_Al_WithOutGenerics2 {

	public static void main(String[] args) {

		// _____ArrayList_____
		// ArrayList - is the Default class in java.util package
		// Need to create the Object of ArrayList class using new Keyword
		// It mintains the Order/index
		// Case (1):Adding Elements to Arraylist [Maintained the Order]
		ArrayList ar = new ArrayList();
		// It always maintained the order Index Position
		ar.add(100);// 0
		ar.add(200);// 1
		System.out.println(ar.size());
		ar.add(300);// 2
		ar.add(400);// 3
		System.out.println(ar.size());

		ar.add(500);// 4
		ar.add(600);// 5
		System.out.println(ar.size());

		// Case (2):VirtulCapacity & physical Capacity
		// _____Internal Mechanism of ArrayList_____
		// Default VirtulCapacity of ArrayList is : 10
		// Size() is the physical Capacity
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.size()); // size is the physical Capacity

		// case (3): Find the Element at particualr index
		System.out.println(al.get(2));
		// System.out.println(al.get(5));//java.lang.IndexOutOfBoundsException: Index:
		// 5, Size: 3
		// System.out.println(al.get(-1)); // java.lang.ArrayIndexOutOfBoundsException:
		// -1

		// case (4): Remove Elements
		al.remove(3);
		System.out.println(al.size());
		System.out.println(al.get(3));

		// case (5): Print All the values from the for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// Case (6):Adding Diferent type of data to Arraylist --Allowed

		ArrayList a = new ArrayList();
		a.add(100);
		a.add("Irfan");
		a.add(12.33);
		a.add(true);
		System.out.println(a); // [100,Irfan,12.33,true]
	}

}
