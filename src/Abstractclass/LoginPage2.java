package Abstractclass;

public class LoginPage2 extends Page1 {

	// Child Class Extending Abstarsct Class --- So Class will get all abstrast
	// methods as well
	// These 2 methods Implementation responsibity ---- Loginpage
	@Override
	public void title() {
		System.out.println("LP ---- Title");

	}

	@Override
	public void url() {
		System.out.println("LP ----- url");

	}

	// This Concrete method able to override
	@Override
	public void header() {
		System.out.println("Login Page ---- Header");

	}

	// I cann't Override it becasue It is final method so we cann't Override it...
	/*
	 * public void logo() {
	 * 
	 * 
	 * 
	 * }
	 */

	// This class haaving it's own Methods
	// I have defined method overloaded methods with same name
	public void doLogin(String un, String pwd) {
		System.out.println("Username" + un + "Password" + pwd);
	}

	public void doLogin(String un, String pwd, long phno) {
		System.out.println("Username" + un + "Password" + pwd + "" + "PhoneNo" + phno);
	}

}
