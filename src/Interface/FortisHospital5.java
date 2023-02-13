package Interface;

//This is Called Multiple Inheritance --- Allowed in JAVA with Interfaces
//Diamond Problem Resolved  
//Child Class Having multiple Interfaces
// extends with only one class implements n no of coma sepearated interfces..
public class FortisHospital5 extends UnHG8 implements US_Medical2, UKMedical3, IndianMedical4 {

	// It's class responsibity to implement or override these methods ...
	// we are overriding all methods in US_medical2

	// __________US MEDICAL___
	@Override
	public void physioSevices() {
		System.out.println("Fortify ----Physio");

	}

	@Override
	public void cardioServices() {
		System.out.println("Fortify ---- CARDIO SERVICE");
	}

	// If I comment one of the method It will thorw Error becasue It's class
	// resposibiity
	// to Implement all US_Medical2 INTERFACE methods ...
	/*
	 * @Override public void oncologyServices() { // TODO Auto-generated method stub
	 */
	@Override
	public void oncologyServices() {
		System.out.println("Fortify ----ONCOLOGY");

	}

	// __________UK MEDICAL___
	// It should be class responsibity to implement those new method as well
	public void test() {
		System.out.println("Fortify ----TEST");

	}

	@Override
	public void entServices() {
		System.out.println("Fortify ----- ENT SERVICE");

	}

	@Override
	public void pediaServices() {
		System.out.println("Fortify ----- PEDIA SERVICE");

	}

	// __________INDIA______
	@Override
	public void orthoServices() {
		System.out.println("Fortify-----------Ortho SERVICES");

	}

	@Override
	public void DentalServies() {

		System.out.println("Fortify-----SERVICES");
	}

	// Interface has the Common method but in class Overridden 1 time
	// Only one time overridden 2 times it's duplicate
	@Override
	public void emergencyServices() {
		System.out.println("Fortify ------Emergency Services");
	}

	// Fortis Hospital Class Methods

	public void medicalTraining() {
		System.out.println("Medical Trainging---");

	}

	public void opdServices() {
		System.out.println("opdServices ----");
	}

	@Override
	public void medicalInsurance() {
		System.out.println("USA ---Medical Insurance...");

	}

	@Override
	public void covidTest() {
		System.out.println("Fortify --- Covid Test");

	}

}
