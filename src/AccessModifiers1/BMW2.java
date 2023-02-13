package AccessModifiers1;

public class BMW2 extends Car1 {

	public static void main(String[] args) {

		// Case 2:Same Package Sub Class ---- private Modifier not able to access
		Car1 c = new Car1();
		System.out.println(c.name = "Irfan");
		System.out.println(c.color = "Green");
		System.out.println(c.price = 1000);
		// System.out.println(c.licenceNumber=1208); //Private Not able to acess in Sub
		// class
		System.out.println("------------------");
		BMW2 b = new BMW2();
		System.out.println(b.color = "Yellow");
		System.out.println(b.name = "CRETA SVU");
		System.out.println(b.price = 128238);
		// System.out.println(b.licenceNumber=5208); //Private Not able to acess in Sub
		// class

	}

}
