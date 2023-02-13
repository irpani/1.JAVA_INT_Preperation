package FinalKeyword;

public class BMW3 extends Car2 {

	// See the Green Symbol here this is over_ridden method
	// This is called Method Overriding
	// Method Overriding always hppen between Parent & Child
	// Method name Should be same name & Same no of parameters

	@Override
	public void start() {
		System.out.println("BMW ---START method called");
	}
	/*
	 * //Cann't overridden becasue this method declared as final public void logo()
	 * { System.out.println("BMW---Logo"); }
	 */

	// Only BMW guy able to access this ,no one can access this except BMW guy ..
	public void autoparking() {
		System.out.println("BMW ---AutoPark");

	}

	public static void drive() {
		System.out.println("BMW--- DRIVE");

	}

}
