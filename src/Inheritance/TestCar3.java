package Inheritance;

public class TestCar3 {

	public static void main(String[] args) {

		BMW2 b = new BMW2();

		// Note: ***Which class start() method called first CAR Class/BMW Class?
		// Java says u have already overridden start() method so child class method will
		// be -called
		// Case 1:
		// --------------------------
		b.start(); // Over_ridden method
		b.stop(); // Inherited method
		b.refilling(); // Inherited method
		b.autoparking(); // Ind Method Of BMW class
		b.engine(); // Able to access Grandparent propertes via car class
		BMW2.drive(); // Static method in BMW class called with Class name

		// Note : drive() is a staic method in both parent & Child Class they Cann't
		// Override
		// if I declared Car class as final Inheritance Cann't possible

		// Can we create the Object Of Car class ? A: Yes
		// Case 2:
		// --------------------------
		Car1 c = new Car1();
		c.start();
		c.stop();
		c.refilling();
		c.engine();
		Car1.drive(); // Static method in Car1 Class Called with Class name

		// ----------------------------
		// Case 3:Top/Upcasting small Box -----> in to Big bOX
		// -------------------------- Every BMW is a Car
		Car1 c1 = new BMW2();
		// which properties called ? Child class properties Only because Ref type Check
		// c1 is car class Type with this reference I cann't access BMW class
		// Properties..
		// I'm able to access Only BMW class properties
		c1.start();
		c1.refilling();
		c1.stop();
		// c1.autoParking(); Not Allowed .. Ref check failed

		// ----------------------------
		// Case 4:Downcasting Big box --- in to small box
		// ----------------------------- Every Car is not BMW
		// BMW2 b2=new Car1(); //Not Allowed in JAVA
		BMW2 b2 = (BMW2) new Car1(); // Compile time not identified

		// ---------- // Run time it will throw Class Cast Exception
		// Case 5:
		// ------------
		Vehicle4 v1 = new BMW2();
		v1.engine(); // y Vehicle properties able to access because v1 type of Vehicle car bwm
						// properties cann't bcz of reference check failed
		// --------
		// Case 6:
		// --------
		// Grand Parent object refer with child class Object ...
		BMW2 b3 = (BMW2) new Vehicle4(); // Run time it wil throw Class Cast Exception

		// ----------
		// Case 7: Siblings properties we cann't shared
		// -----------

		Audi5 a = new Audi5();
		a.threadSafety();
		a.sportsMode();

		// ----------
		// Case 8: BMW cann/t shared from CAR,TRUCK at a time it will leads to
		// Dimondproblem
		// -----------
		Truck6 tr1 = new Truck6();
		tr1.heavyLoading();

	}

}
