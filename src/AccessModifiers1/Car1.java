package AccessModifiers1;

public class Car1 {

	// _____Class Vriables____
	// Access Modifiers => default ,public,private,protected
	String name;
	public String color;
	protected int price;
	private int licenceNumber;

	public static void main(String[] args) {
		// Case 1:Same Class ---- With in the class I'm able to access All Properties ..

		Car1 c = new Car1();
		System.out.println(c.name = "Irfan");
		System.out.println(c.color = "Green");
		System.out.println(c.price = 1000);
		System.out.println(c.licenceNumber = 1208);

	}

}
