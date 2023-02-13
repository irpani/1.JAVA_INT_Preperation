package ExceptionHandling;

public class Throwable_Class4 {

	String name;

	public static void main(String[] args) {
		Multi_catch_Block2 b = new Multi_catch_Block2();
		b.name = "irfan";
		b = null;

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			System.out.println(b.name);// Gettig Null Pointer Exception ... here but It will not reach the Catch Block
			int l = 9 / 3; // Case 1: So I will write another Catch block here with right Exception
			int m = 9 / 0; // Case 2:So I will write another Catch block here with right Exception
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
		} catch (Throwable e) { // Instead of Multiple catch blocks will write a Exception class
			System.out.println("Some Exceptioin is Coming....");
			e.printStackTrace();
		}

	}

}
