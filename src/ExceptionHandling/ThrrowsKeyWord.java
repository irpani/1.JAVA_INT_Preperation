package ExceptionHandling;

//This is not Exception Handling we can just Throws the exception
//Remember 'Throws'=> Keyword always used after the Method name ...
public class ThrrowsKeyWord {

	// Q: Can we handled the Exception with Throws Keyword?
	// A: No,We cann't handled the Exception ,
	// we can by pass the Exceptioin from Calling metod to Caller Method [Method to
	// --> Method]

	public void m1() throws ArithmeticException {
		System.out.println("m1_Method.....");
		m2();
	}

	public void m2() throws ArithmeticException {
		System.out.println("m2_Method.....");
		m3();
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3_Method.....");
		int i = 9 / 0;
	}

	public static void main(String[] args) throws ArithmeticException {
		// This main method called by whom => JVM [Java VirtualMachine]
		ThrrowsKeyWord t = new ThrrowsKeyWord();
		t.m1();

	}

}
