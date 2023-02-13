package Polymorphism_Overriding;

public class TestCar3 {

	public static void main(String[] args) {

		BMW2 b = new BMW2();

		// Note: ***Which class start() method called first CAR Class/BMW Class?
		// Java says u have already overridden start() method so child class method will
		// be -called

		b.start(); // Over_ridden method //Inherited method
		b.stop(); // Inherited method
		b.refilling(); // Inherited method
		b.autparking(); // Ind Method Of BMW class

	}

}
