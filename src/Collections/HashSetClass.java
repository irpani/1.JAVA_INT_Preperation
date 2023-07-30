package Collections;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);

		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);

		System.out.println(hs);
	}

}
