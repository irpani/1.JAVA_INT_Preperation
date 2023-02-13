package FinalKeyword;

//Final Variable:If a method declared as Final It become Constant,Cann't Change
//Final Method:  If a method declaed as final It cann't Overridden
//Final Class : Cann't allowed Inheritance

//_____Final Class____
//Final --> class Declared with final Cann't allowed Inheritance
//public final class Car2 {
public class Car2 extends Vehicle4 {

	public void start() {
		System.out.println("CAR ---START");
	}

	// Cann't overridden becasue this method declared as final
	public final void logo() {
		System.out.println("CAR---Logo");
	}

	public void stop() {
		System.out.println("CAR -- STOP");
	}

	public void refilling() {
		System.out.println("Car ---Refilling");
	}

	public static void drive() {
		System.out.println("CAR--- DRIVE");

	}
}
