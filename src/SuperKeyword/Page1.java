package SuperKeyword;

// Super    Name It self Super which means 
//we can call super class var/meth/constr from child class
//Q1:How to use super key word?
//Q2:What is the purpose of super keyword?

public class Page1 {
	// Page level Variable
	int timeout = 100;

	public void display() {
		System.out.println("PAGE ----- DISPLAY");
	}

	public Page1() {
		System.out.println("Page Default Constructor....");
	}

	public Page1(int a) {
		System.out.println("it param Constructor...." + a);
	}

	public Page1(int a, int b) {
		System.out.println("it param Constructor...." + (a + b));
	}
}
