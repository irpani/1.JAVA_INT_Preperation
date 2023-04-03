package Wrappers;

public class DataCoversion {
	// Type Casting : Always On same DataType ....
	// Data Conversion :Always On One type to another type

	// WRAPPER CLASSES:
	// Q: What are Wrapper Classes ? A: Integer,Double,Boolean ..... are Wrapper
	// classes

	// Y Wrapper Classes ?
	// A: Wrapper classes are help us to convert Data from One type to another Type
	// Data Conversion happened in JAVA with the help of Wrapper classes

	// Keep in mind Everything on web page is a String even though it is numeric On
	// webpage It's String Only....

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);// 10020
		// But we want 120 then what ? That is the priblem
		// When ever we are reading from the web pages Specially In case of
		// Automatontool

		// CASE(1): String to int Conversion =>Pure Numeric Conversion to Int
		// ------------------------
		int i = Integer.parseInt(x);// 100
		System.out.println(i + 20);// 120

		// String y = "100A"; // Split /trim/Substring /replace try with any one of them
		// to remove A
		// int j = Integer.parseInt(y);
		// System.out.println(j);// NumberFormatException
		// So Programaticall u need to remove A then u can convert into int that is your
		// Assignment

		// (2).String to Double:
		// ---------------------
		String p = "12.33";
		System.out.println(p + 20);// 12.3320
		double d = Double.parseDouble(p);
		System.out.println(d + 20);// 32.33

		// CASE(2): int to String:
		// --------------------
		int total = 100;
		String str = String.valueOf(total);
		System.out.println(str);// 100 but is is String how do u know just below added to 100 it's Concatenated
								// not added hence it i String
		System.out.println(str + 20);// 10020

		String g = "true";
		boolean b = Boolean.parseBoolean(g);
		if (b) {
			System.out.println("pass");
		} else {

			System.out.println("fail");
		}
	}

}
