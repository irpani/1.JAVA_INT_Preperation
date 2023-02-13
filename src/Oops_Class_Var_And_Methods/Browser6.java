package Oops_Class_Var_And_Methods;

public class Browser6 {
	// _____Call By Value Vs Call By Reference Example____
	// Q:Can we pass the Object Ref as Parameter?
	// A: Yes
	String name;
	double version;
	String vendor;

	public void getInfo(Browser6 br) {
		System.out.println(br.name + " " + br.version + " " + br.vendor);

	}

	// Call By Value

	public void sum(int a, int b) {

		System.out.println("" + (a + b));

	}

	public static void main(String[] args) {
		Browser6 b = new Browser6();

		b.name = "chrome";
		b.vendor = "GOOGLE";
		b.version = 100;
		b.getInfo(b); // Call By Reference

		b.sum(10, 20); // Call by Value

	}

}
