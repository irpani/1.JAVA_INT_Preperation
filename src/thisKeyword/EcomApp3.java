package thisKeyword;

//Another use case of "this keyword" ---->to generate Builder pattern 
public class EcomApp3 {

	// (1).First Login () Then -----> produst searh()
	// void & this cann't be together
	public EcomApp3 login() { // this method return current class Object
		System.out.println("Default Login");
		return this;
		// here I return like "return this" => so that it will retun current class
		// Object

		// instead of writing
		// EcomApp3 ecom =new EcomApp3 ===> I write like retun this means Curren class
		// Object

	}

	public EcomApp3 login(String uname, String pwd) {
		System.out.println("Login with uname & passwor" + uname + "" + pwd);
		return this;
	}

	// ______ (2).Search the Product___
	public EcomApp3 search() {
		System.out.println("Default Search");
		return this;
	}

	public EcomApp3 search(String productName) {
		System.out.println("search product with" + productName);
		return this;
	}

	public EcomApp3 search(String productName, int rating) {
		System.out.println("search product with" + productName + "" + rating);
		return this;
	}

	// _____(3).Add Cart_____
	public EcomApp3 addCart(String productName) {

		System.out.println("Add product to cart" + productName);
		return this;
	}

	// _____(4).Do Payment_____
	public EcomApp3 doPayment(String upi) {

		System.out.println("do apyment with upi" + upi);
		return this;
	}

	public EcomApp3 doPayment(String cC, int cvv) {

		System.out.println("OR ->Payment_With" + cC + "" + cvv);
		return this;
	}

	public EcomApp3 doPayment(String cC, int cvv, int otp) {

		System.out.println("OR -> Payment_With" + cC + "" + cvv + "" + otp);
		return this;
	}

	// _____(5).OrderID _____

	public EcomApp3 generateOrderId() {

		System.out.println("Orderid Generated");
		return this;
	}

	// _____(6)Logout_____
	public EcomApp3 logOut() {

		System.out.println("LogOut from the Amazon App");
		return this;
	}

}
