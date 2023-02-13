package Constructor;

public class MySystemClass5 {
	/*
	 * public MySystemClass() {
	 * 
	 * }
	 */

	// Do we have private Cosnstructor ?
	// A: Yes
	// Int Q: How to restrict the class to create Object?
	// A: make constructor as private

	// In real time frameworks we never use private Constructor
	private MySystemClass5() {

	}

	public static void main(String[] args) {
		MySystemClass5 s = new MySystemClass5(); // In same clsss I'm able to create Object
												// Out side of Employeetest class Not allowed to create

	}

}
