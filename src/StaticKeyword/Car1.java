package StaticKeyword;

//____Static Topic____

//Static Varibles:
//----------------
public class Car1 {
	// Static --- Allowed only for class level variables ....
	// Not Allowed for local/method level variables....
	String name;
	int price;
	String color;
	static int wheels; // Static VARIABLE

	public static void main(String[] args) {
		// Here one Property value always same So In that Case Java Sugge keep that
		// property as static
		//
		Car1 c1 = new Car1();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "Blue";
		c1.wheels = 4; // Getting warning If I clled with Obj Reference ..
		Car1.wheels = 4; // No error If I called with Class name Bcz Stored in CMA

		System.out.println("-------------------");

		Car1 c2 = new Car1();
		c2.name = "AUDI";
		c2.price = 50;
		c2.color = "White";
		c2.wheels = 4; // Getting warning If I clled with Obj Reference ..
		Car1.wheels = 4; // No error If I called with Class name Bcz Stored in CMA

		System.out.println("-------------------");

		Car1 c3 = new Car1();
		c3.name = "Honda";
		c3.price = 40;
		c3.color = "Blue";
		c3.wheels = 4;// Getting warning If I clled with Obj Reference ..
		Car1.wheels = 4; // No error If I called with Class name Bcz Stored in CMA
	}

}
