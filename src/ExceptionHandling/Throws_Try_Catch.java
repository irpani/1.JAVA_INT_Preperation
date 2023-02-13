package ExceptionHandling;

//We can handled the Exception at Produer lebel or consumer level with try{} ..catch(){}
//m1()  m2() are consumers  we can any where ..
public class Throws_Try_Catch {

	public void m1() throws ArithmeticException {
		System.out.println("m1_Method.....");
		m2();
	}

	public void m2() throws ArithmeticException {
		System.out.println("m2_Method.....");
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

	public void m3() throws ArithmeticException {
		System.out.println("m3_Method.....");
		int i = 9 / 0;
	}

	public static void main(String[] args) throws ArithmeticException {
		// This main method called by whom => JVM [Java VirtualMachine]
		Throws_Try_Catch t = new Throws_Try_Catch();
		t.m1();
		System.out.println("Bye");
	}

}
