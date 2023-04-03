package thisKeyword;

public class TestAmazon {

	public static void main(String[] args) {

		EcomApp3 user = new EcomApp3();
		// UC 1:
		// I want to follow Builder Chaining Pattern Approch
		// Q: What is Method Builder Chaining Pattern?
		// A:see here Each & every method is return some thing

		user.login("car123@gmail.com", "car1234").search("Macbook").addCart("Macbook").doPayment("434345@123tyui")
				.logOut();

		// UC 2:

		user.login("car123@gmail.com", "car1234").addCart("Macbook").doPayment("434345@123tyui").logOut();

		// UC 3:
		user.login("car123@gmail.com", "car1234").addCart("Macbook").logOut();
		// Uc4:
		user.login("car123@gmail.com", "car1234").search("Macbook").addCart("Macbook").logOut();

		// Uc5:

		user.login("car123@gmail.com", "car1234").search("Macbook").addCart("Macbook").logOut();

		// (2).uber Booking Home work /Assignment

	}

}
