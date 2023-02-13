package AccessModifier2;

import AccessModifiers1.Car1;

public class Audi extends Car1 {

	public static void main(String[] args) {

		Audi a = new Audi();
		a.color = "Green"; // public Allowed
		a.price = 2000; // protected Allowd
		// a.name="dsds"; //Default Not Allowed ...
		// a.licenceNumber=344; //privatr Not Allowed

	}

}
