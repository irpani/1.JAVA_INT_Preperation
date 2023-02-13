package Encapsulation;

public class Employee2 {

	public static void main(String[] args) {
		Company1 c2 = new Company1();

		c2.name = "Google";
		c2.hq = "USA";
		// I cann't access Share price because It is Private in nature
		// Now Here Encapsulation Concept comig in to picture ....
		// c1.getSharePrice();

		int i = c2.getSharePrice();
		System.out.println(i);
	}

}
