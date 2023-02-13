package Polymorphism.Over_Loading;

//Poly--( many)  Morphism(forms)
//Method OverLoading also called Compile Time/Static  Polymorphism bcz..
//Ex: strat ()  strat(inta,intb) strat(Stringa,String b) here Compiler
//--- will decide at compile time only which method to call ...

// Method OverLoading: With in the same class with Different parameters

//____Method OverLoading:_____
//In Java Dupicate Method names are Not Allowed ...
// ____Method OverLoading____
// With in the same calss when u have no of methods
// With the same name
// Different parameters
// Different types of Parameters ...
// Different order /Sequence Of parametes are Different ...

class Ecomerce {

	// _____Real Time Examples_____ Login () Seach() payment() ....uber() booking
	// (1).____Login Method____
	public void login() { // O_arg Parmeter
		System.out.println("Default Login");
	}

	public void login(String un, String pwd) { // 2_arg Parmeter
		System.out.println("Login with " + un + "" + pwd);
	}

	public void login(String un, int otp) { // 2_arg Parmeter
		System.out.println("Login with " + un + "" + otp);
	}

	public void login(long pno, int otp) { // 2_arg Parmeter
		System.out.println("Login with " + pno + "" + otp);
	}

	public void login(String un, String pwd, int otp) { // 2_arg Parmeter
		System.out.println("Login with " + un + "" + pwd + "" + otp);
	}
	// (2). _____Search Method_____

	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void search(String name, int price, String seller) {

	}

	// (3).Payment method Overload
	// Note 1 : This is not Method Overloading

	/*
	 * public void doPayment(String cc ,int otp) {
	 * 
	 * }
	 * 
	 * public void doPayment(String debt ,int otp) {
	 * 
	 * }
	 */
	// Note 2 : Viceversa Order allowed but It is also not preferable
	/*
	 * public void doPayment(String cc ,int otp) {
	 * 
	 * }
	 * 
	 * public void doPayment(int otp,String cc) {
	 * 
	 * }
	 */
	// Note : In method Overloading return statment ever used

	// (4)._______ Uber Booking______
	public void booking(String str, String end) {

	}

	public void booking(String str, String end, String carType) {

	}

	public void booking(String str, String end, int couponCode) {

	}

	// ______Main Method OverLoading______

	// Q: Is main method Overloading is Possible ? A: Yes .....

	public static void main(String[] args) {
		Ecomerce e = new Ecomerce();
		// _____________Login Overloaded Methods______
		e.login();
		e.login("irfan", 100);
		e.login("Ramu", "Password@1");
		e.login(934834383, 4309);
		e.login("irfan", "Password@1", 200);

		// Search
		// Payment
		// ____Booking Overloaded Methods____
		e.booking("Hyd", "Clx");
		e.booking("Hyd", "Clx", "Benz");
		e.booking("Hyd", "Clx", 5444);
	}

}
