package Oops_Class_Var_And_Methods;

public class FunctionsInJava4 {
	// Global Variable
	int a;
	// Rule 1: We cann't create a function Inside a Function
	// Rule 2: We can call a Function Inside another function ... Allowed
	// Rule 3: We cann't call static from Non static methods ...

	// There are 3 types Of Funciotns Majorly.
	// Type (1): No Input No return Type
	// Type (2): Some Input No return type
	// Type (3):Some Input Some return type

	// Type (1): No Input No return Type
	public void test() {

		System.out.println("Test Method----");
		int i = 10;
		System.out.println(i);
	}

	public void getprint() {

		System.out.println("Print Method");
	}

	// Type (2): No Input but Some return Type like3 Examples [int ,String ,boolean]
	// ___returns int___
	public int getBalance() {
		System.out.println("getBalance");
		int fee = 10;
		int tax = 5;
		int total = fee + tax;
		return total;
	}

	// ____returns String____
	public String getTrainerName() {

		System.out.println("Get Trainer Name");
		String name = "Naveen";
		return name;
	}

	// ____returns boolean____
	public boolean isEmpActive() {

		System.out.println("Employee Active");
		return true;
	}

	// Type (3): Some Input Some return Type
	// These are method input parameters
	// a,b are called Method Paramters
	public int add(int a, int b) {
		System.out.println("Add Method----");
		int c = a + b;
		return c;
	}

	public int getCourseFee(String Coursename) {
		System.out.println("fee Structure for the course name" + Coursename);

		if (Coursename.equals("JAVA")) {
			return 100;
		} else if (Coursename.equals("c#")) {
			return 200;
		} else if (Coursename.equals("Python")) {
			return 200;
		} else {
			System.out.println("Course Not matched...");
		}
		return -1; // *** most imp here

	}

	// Inside Main method we never return =>'return' statement
	public static void main(String[] args) {
		FunctionsInJava4 obj = new FunctionsInJava4();
		// Case:1:No Input No return type
		obj.test();
		obj.getprint();
		// Don't use this Aapproch

		// Case:2:No Input Some return type
		System.out.println(obj.getBalance());
		// Always use this Approch

		int p = obj.getBalance();
		System.out.println(p);
		// Holding parameter preferable so that we can use it in future ...
		String str = obj.getTrainerName();
		System.out.println(str);
		// System.out.println(obj.getTrainerName());
		// U can write like this
		if (obj.isEmpActive()) {
			System.out.println("Pass");
		}
		// U can stored in Holding Parmeter
		boolean b = obj.isEmpActive();
		System.out.println(b);

		// Case:3:Some Input some return type

		// a,b are called input parameters
		int c = obj.add(10, 20); // 10,20 are called method arguments
		// you can also perform Action on this
		System.out.println(c + 10);

		int f2 = obj.getCourseFee("Spring");
		System.out.println(f2);
		if (f2 == -1) {
			System.out.println("This is not part of training");
		}

	}

}
