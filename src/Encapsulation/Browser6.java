package Encapsulation;

public class Browser6 {
	// In the same class I'm able to access but Some one will use this class So
	// better to access from another class the Properties
	// Another class try to access it ...
	// ____End User Point Of u ____
	// These below public methods like Total ATM MAChine opened access to user --Not
	// right
	// Approch
	// These public methods like launching browser internal mechanism not required
	// to user
	/*
	 * public void launchbrowser() { System.out.println("LaunchBrowser"); }
	 * 
	 * public void checkVersion() { System.out.println("Check br Version"); }
	 * 
	 * public void checkOsVersion() { System.out.println("OS Version"); }
	 * 
	 * public void checkEnoughRam() { System.out.println("check Enough Ram"); }
	 */
	public void launchbrowser() {

		System.out.println("LaunchBrowser");
		checkVersion();
		checkOsVersion();
		checkEnoughRam();
	}

	private void checkVersion() {
		System.out.println("Check br Version");

	}

	private void checkOsVersion() {
		System.out.println("OS Version");

	}

	private void checkEnoughRam() {
		System.out.println("check Enough Ram");
	}

}
