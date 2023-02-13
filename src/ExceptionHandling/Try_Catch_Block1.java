package ExceptionHandling;
//Q1:What is Exception?

//A:In case 2 I have answered practically  see that 

//Q2:How to Handle this ? ==>See case 3
public class Try_Catch_Block1 {

	public static void main(String[] args) {

		// Case 1: O/p: A A A B B B B
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		int i = 9 / 3;
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("___________________");

		// Case 2: O/p: A A A gettig printed 3 times then
		// =>java.lang.ArithmeticException: / by zero

		// unwanted logic in your code program terminated immediately it will not
		// executed from line 24
		// This is what exception is
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		// int J = 9 / 0;
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("___________________");

		// Case (3): e.printStackTrace --- > show the logger On Console
		// java.lang.ArithmeticException: / by zero
		// at ExceptionHandling.Try_Catch_Block.main(Try_Catch_Block.java:45)
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			int k = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Some Exception is Coming...");
			e.printStackTrace(); // this method will show On console regardig Exception ....
		}

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

		// Case (4):int k = 9 / 0 In this case How many Times Hi message Printed ? A: 0
		// Times
		// In try Block After exception occured code will not executed It will land on
		// catch block
		//
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			int k = 9 / 0;
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
		} catch (ArithmeticException e) {
			System.out.println("Some Exception is Coming...");
			e.printStackTrace(); // this method will show On console regardig Exception ....

		}

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

		// Case (5):int l =9/3 In this case It will never come to catch(){} block

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			int l = 9 / 3;
			System.out.println("Hi");
			System.out.println("Hi");
			System.out.println("Hi");
		} catch (ArithmeticException e) {
			System.out.println("Some Exception is Coming...");
			e.printStackTrace(); // this method will show On console regardig Exception ....

		}

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
