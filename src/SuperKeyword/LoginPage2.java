package SuperKeyword;

//super()                  --- we can use like this at Constructor
//super.var/super.meth()   --- we can use like this
public class LoginPage2 extends Page1 {
	// Login page VARIABLE
	int timeout = 200;

	@Override
	public void display() {
		System.out.println("LOGINPAGE ----- DISPLAY"); // This One calling Lp only
	}

	// _____Super Class methods_____from Child we can call parent class Methods
	public void loginInfo() {
		System.out.println("LOGIN PAGE ------ login Info");
		// Can I called Parent class methods Directly? A: Yes
		display(); // Child class // -------- This One also calling Lp only but I want Parent

		super.display(); // This One calling Parent now
	}

	// _____Super Class Variable_____ from Child we can call Parent class Varible
	public void getTimeOut() { // Is this Var Overriding ? A: No
		System.out.println(timeout); // Child Class var called but I want parent then u can use super
		System.out.println(super.timeout);// Super class Varible called

	}

	// _____Super Class Constructor___________ from Child we can call parent class
	// Constructor
	public LoginPage2() {
		super(); // Default Constructor Called
					// Super(10) ---One param Constructor called
					// Super(10,20) ---Two param Constructor called
	}

}
