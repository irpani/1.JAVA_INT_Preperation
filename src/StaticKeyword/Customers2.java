package StaticKeyword;

//___Static Method:____
public class Customers2 {
	// Note: **Static methods are overloaded but cann't overrided
	String name;
	int id;
	static String city = "Banglore"; // All the Customers from Banglore
	static String paymentMethod = "CC";

	public void getInfo() {
		System.out.println("System Info");

	}

	public static void sentEmail() {

		System.out.println("Sent Email ....");
	}

	public static void main(String[] args) {
		// Static Context Call with Classname / Directly ...
		Customers2 c = new Customers2();
		Customers2.city = "Hyderabad";
		Customers2.paymentMethod = "CC";
		Customers2.sentEmail();

	}

}
