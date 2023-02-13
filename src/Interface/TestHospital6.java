package Interface;

public class TestHospital6 {

	public static void main(String[] args) {

		FortisHospital5 fh = new FortisHospital5();
		// Case (0): Interface Variables
		System.out.println(US_Medical2.min_fee);
		// US_Medical2.min_fee=200; interface Value Cann't be changed ....
		// bcz public static final ....

		// Case (1): Class Implements all abstract methods in class
		fh.cardioServices();
		fh.DentalServies();
		fh.emergencyServices();
		fh.entServices();
		fh.oncologyServices();
		fh.orthoServices();
		fh.pediaServices();
		fh.pediaServices();
		fh.physioSevices();

		fh.medicalInsurance(); // I'm able to access Us interface default method
		fh.covidTest(); // I'm able to access Super Interface method implemented in class

		UnHG8.covidGuidelines();
		fh.medicalInfo();

		// Case (2):we never Create Object of class ...
		// US_Medical2 us=new Us(); //Not ALLOWED IN jAVA

		// Case (3):TopCasting
		// Child Class Object refered with Parent Interface ref Variable
		// Only able to access Us based Serices
		US_Medical2 us = new FortisHospital5();

		us.physioSevices();
		us.cardioServices();
		us.oncologyServices();
		us.emergencyServices();

		US_Medical2.billing(); // After JDK 1.8 Static method accessed with Class Name ...
		// Only able to access Uk based Serices
		us.medicalInsurance();// After JDK 1.8 default method Able to Access

		UKMedical3 uk = new FortisHospital5();
		uk.emergencyServices();
		uk.entServices();
		uk.pediaServices();

		// Only able to access India Based Services
		IndianMedical4 in = new FortisHospital5();
		in.DentalServies();
		in.orthoServices();

		// Case (4)_____DownCasting______CT Not Allowed
		// Parent interface Object is ref with Child Class Ref

		// Case 5: After JDK 1.8 there are two major changes happened ...
		// You can have static methods with the body

	}

}
