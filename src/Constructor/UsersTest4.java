package Constructor;

public class UsersTest4 {

	public static void main(String[] args) {

		// Main Advantage Of Constructor
		// You are restrcting to create unneessary objects
		// Here u can create these 3 objects only other than u cann't create objects
		// Users u4 = new Users(); End_user restricted to create Object
		Users3 u1 = new Users3("Shaik", 10001);
		Users3 u2 = new Users3("Shaik", "HYD");
		Users3 u3 = new Users3("Shaik", 10002, true, "Mum");

	}

}
