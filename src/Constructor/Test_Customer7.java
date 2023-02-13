package Constructor;

public class Test_Customer7 {

	public static void main(String[] args) {
		Customer6 c1 = new Customer6("irfan", 34, "IBM");
		String str = c1.getCustomerInfo();
		System.out.println(str);

		// So I'm udating the values with the help of get() & set() method
		Customer6 c2 = new Customer6();
		c2.setAge(20);
		c2.setComp("Google");
		c2.setName("Afsheen");
		int a = c2.getAge();
		String b = c2.getName();
		String c = c2.getComp();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
