package Encapsulation;

//____Method Chaining Concept____

public class Persons5 {
	// ____Method Chaining _____
	public void m1() {
		System.out.println("p1_method");
		m2();
	}

	public void m2() {
		System.out.println("p2_method");
		m3();
	}

	public void m3() {

		System.out.println("p3_method");
	}

	public static void m4() {
		System.out.println("p1_method");
		m5();
	}

	public static void m5() {
		System.out.println("p2_method");
		m6();
	}

	public static void m6() {

		System.out.println("p3_method");
	}

	public static void main(String[] args) {

		Persons5 p = new Persons5();
		p.m1();
		p.m4();
	}

}
