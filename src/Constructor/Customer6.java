package Constructor;

public class Customer6 {
	// Blue Print of a Class
	private String name;
	private int age;
	private String comp;

	// Constructor with 3 fields
	/**
	 * @param name
	 * @param age
	 * @param comp
	 */

	public Customer6() {
		System.out.println("Default Constructor ...");
	}

	public Customer6(String name, int age, String comp) {
		super();
		this.name = name;
		this.age = age;
		this.comp = comp;
	}

	// ***get() & Set() with 3 fields are helping me to intialize the variables
	// Constructor already do the same y we returned get() & set() bucause helping
	// me to update the values which already initialized
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	// 1 Method I'm taking
	public String getCustomerInfo() {

		return name + " " + age + " " + comp;
	}

}
