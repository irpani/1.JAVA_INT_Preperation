package ExceptionHandling;

public class Throw_KeyWord {
	// JAVA will give standard Exceptions to handled In some scenari's like
	// Data Not found In this case u can use 'Throw' Keyword if u want that

	// no data is present
	// e1 prop is missing
	// XMl is missing
	// File is Missing

	// Q: What is the meaning of Throw Keyword
	// Q2:How will use Throw Keyword?
	// A: 'Throw' Keyword used when u want to throw the exception deliberately ....
	// It's Customized Exception
	// we have sone use cases in selenium also ...

	public static void main(String[] args) {

		try {
			throw new Exception("NAVVEN Exception");
		} catch (Exception e) {
			System.out.println("Some Exception is Coming ");
			e.printStackTrace();
		}

		// _______ Practical Use case of throw Keyword______________
		// CASE1:
		// If I'm getting data from outside if there is no data I'g getting Error

		String data = null;
		if (data == null) {
			try {
				throw new Exception("DATA Not Found Exception");
			} catch (Exception e) {
				System.out.println("DATA Not Found Exception is Coming ");
				e.printStackTrace();
			}
		}

		// CASE2:In selenium also have some usecases
		// On webPage Element ---e1 not found It will give No Suh Element Excpetion
		// e1 prop is missing --->Throw New
		// Exception("ELEMENT_PROP_NOTFOUND_EXCEPTION");

	}

}
