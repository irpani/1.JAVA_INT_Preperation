package Oops_Class_Var_And_Methods;

public class User7 {
	// _____Ref Check Mechanism_____
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		User7 u1 = new User7();
		u1.name = "Afsheen";
		u1.age = 2;
		u1.city = "CLX";

		System.out.println("---------------");
		User7 u2 = new User7();
		u2.name = "Ayaan";
		u2.age = 4;
		u2.city = "vtm";

		System.out.println("---------------");
		User7 u3 = new User7();
		u3.name = "Reshma";
		u3.age = 32;
		u3.city = "HYD";
		// _____Ref Check Mechanism_____
		/*
		 * System.out.println(u1.age + " " + u1.city + " " + u1.name);
		 * System.out.println(u2.age + " " + u2.city + " " + u2.name);
		 * System.out.println(u3.age + " " + u3.city + " " + u3.name);
		 */
		System.out.println("---------------");
		// Case (1): u1=u2 means u1 break the connection Referring to u2 Now what o/p?
		u1 = u2;

		System.out.println(u1.age + " " + u1.city + " " + u1.name);
		System.out.println(u2.age + " " + u2.city + " " + u2.name);
		System.out.println(u3.age + " " + u3.city + " " + u3.name);

		// Case (2): u2=u3 means u2 break the Connection Pointing to u3 Now what o/p?

		u2 = u3;

		System.out.println(u1.age + " " + u1.city + " " + u1.name);
		System.out.println(u2.age + " " + u2.city + " " + u2.name);
		System.out.println(u3.age + " " + u3.city + " " + u3.name);

		// Case (3): u3=u1 means u3 **** vv imp refering to current position of u1
		u3 = u1;
		System.out.println(u1.age + " " + u1.city + " " + u1.name);
		System.out.println(u2.age + " " + u2.city + " " + u2.name);
		System.out.println(u3.age + " " + u3.city + " " + u3.name);

		// ____Note:____
		// object will allowed Multiple References? from above yes
		// Object wil not allowed not a single reference A: YES

	}

}
