package Interface;

//In interface method could not have method body only Method declaration
//Only method Prototype  ---- abstract methods 
//Interface Cann't have the Business logic ...

public interface US_Medical2 extends WHO7 {

	// Interface VARIABLES
	// Always variables are public static final ....
	public int min_fee = 100;

	// _____Set Of Services_____
	public void physioSevices();

	public void cardioServices();

	public void oncologyServices();

	// trw if there is ant new rule method added in Us_medical Interface
	public void test();

	// Emergency Services method added for USA
	// Emergency Services method added for UK interface also then ---->
	// Int Q:In class level How mant times this service got Overridden?
	// A: Only one time that's it ..
	public void emergencyServices();

	// After JDK 1.8 there are two major changes happened ...

	// (1). Static method with method body Allowed........
	public static void billing() { // (Static )
		System.out.println("US ---- Billing");
	}

	// (2).Default method with Method Body ....(Non Static )
	// Q: Default method can be overridden (A): Yes
	default void medicalInsurance() {
		System.out.println("USA ---Medical Insurance...");

	}

}
