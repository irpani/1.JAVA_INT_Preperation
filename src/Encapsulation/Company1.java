package Encapsulation;

//Abstraction:
//Data abstraction is the process of hiding certain details and showing only essential information to the user. 
//Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

//Note:
//In java applications Encapsulation and abstraction both are coexisted 
//and they will improve security in java applications…
//_____Enapsulation_____

// A:Private DataMembers we cann't access out side of the Class So for accessing private members
// Encapsulation Coming in to Picture ...
//Q: y Encapsulation?
//A:Some times My requirement is to access the private members in to anotner class How will u do that ?
//So Java Come with Soutition called Encapsulation 
public class Company1 {

	public String name;
	private int SharePrice = 100;
	public String hq;

	// ___Setter___
	// We can't write like this ... because trw we have 100 of variables we Cann't
	// assigned
	// Memory wastage ....
	/*
	 * public void setSharePrice(int Sp) { SharePrice = Sp; }
	 */

	public void setSharePrice(int SharePrice) { // This Local variable assigned to global varble
		this.SharePrice = SharePrice;
	}

	// This Keyword is pointing to the Current class Object
	// ___getter___
	public int getSharePrice() {

		return SharePrice;
	}

	public static void main(String[] args) {
		Company1 obj = new Company1();
		obj.name = "MicroSoft";
		obj.hq = "HYD";
		// obj.SharePrice = 100; // Same class I'm able to access the Shar Price ...
	}

}
