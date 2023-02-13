package Constructor;

public class Users3 {

	String firstName;
	int userId;
	boolean isActive;
	String city;

	// Main Advantage Of Constructor
	// You are restrcting to create unneessary objects here I'm taking 3
	// Constructors I'm able
	// to create 3 objects only other than that I cann't create

	// we can create n no of constructor's just Right click ---Source---generate
	// Constr with different Combinations
	public Users3(String firstName, String city) {
		super();
		this.firstName = firstName;
		this.city = city;
	}

	public Users3(String firstName, int userId) {
		super();
		this.firstName = firstName;
		this.userId = userId;
	}

	public Users3(String firstName, int userId, boolean isActive, String city) {
		super();
		this.firstName = firstName;
		this.userId = userId;
		this.isActive = isActive;
		this.city = city;
	}

}
