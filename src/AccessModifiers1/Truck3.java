package AccessModifiers1;

public class Truck3 {

	// Same Package NonSub Class =>Private Members Not able to acess
	public static void main(String[] args) {

		Car1 c = new Car1();
		System.out.println(c.color = "cwwe");
		System.out.println(c.name = "fdve");
		System.out.println(c.price = 1000);
		// System.out.println(c.licenceNumber=1208); //Private Not able to acess in Non
		// SubClass

		System.out.println("------------------");
		BMW2 b = new BMW2();
		System.out.println(b.color = "Yellow");
		System.out.println(b.name = "CRETA SVU");
		System.out.println(b.price = 128238);
		// System.out.println(b.licenceNumber=5208); //Private Not able to acess in Sub
		// class

	}

}
