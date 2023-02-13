package StaticKeyword;

//_____Static Block _____
//Static {} Block will be executed before main method .....
public class TestBlock3 {

	static {
		System.out.println("Static block got executed Before main method....");

	}

	public static void test() {

		System.out.println("test  Method");
	}

	public static void main(String[] args) {
		System.out.println("main_Method");

		test();
	}

}
