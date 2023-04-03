package Inheritance;

public class BMW2 extends Car1 {

	// See the Green Symbol here this is over_ridden method
	// This is called Method Overriding
	// Method Overriding always hppen between Parent & Child
	// Method name Should be same name & Same no of parameters

	@Override
	public void start() {
		System.out.println("BMW ---START method called");
	}

	// Only BMW guy able to access this ,no one can access this except BMW guy ..
	public void autoparking() {
		System.out.println("BMW ---AutoPark");

	}

	// @Override Not Allowed because it's static mehod
	public static void drive() {
		System.out.println("BMW--- DRIVE");

	}

}
