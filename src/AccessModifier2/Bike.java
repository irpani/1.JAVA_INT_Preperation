package AccessModifier2;

import AccessModifiers1.Car1;

public class Bike {

	public static void main(String[] args) {

		Car1 c = new Car1();
		// System.out.println(c.name = "Irfan"); // Default Not Allowed
		System.out.println(c.color = "Green"); // Only Public Allowed
		// System.out.println(c.price = 1000); //Protected not Allowed
		// System.out.println(b.licenceNumber=5208); //Private Not ALLOWED

	}

}
