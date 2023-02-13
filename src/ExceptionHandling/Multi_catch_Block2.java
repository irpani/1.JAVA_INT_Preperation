package ExceptionHandling;

public class Multi_catch_Block2 {

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
			int m = 9 / 0; // Case 2:
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception is Coming...");
			e.printStackTrace(); // this method will show On console regardig Exception ....

		}

		catch (NullPointerException e) {
			System.out.println("NullPointer Exception is Coming...");
			e.printStackTrace(); // this method will show On console regardig Exception ....

		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

		// Case 3: Is it right Approch to write multiple Catch Block?
		// A: Yes that's how programming works line by line ...

		// Q: did we handled exceptions in catch Block ? A: Yes
		// Because others didn't knw what are the possible excpetions
		//
	}

}
