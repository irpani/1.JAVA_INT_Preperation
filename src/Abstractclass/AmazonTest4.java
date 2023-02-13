package Abstractclass;

public class AmazonTest4 {

	public static void main(String[] args) {
		// Case(1):
		LoginPage2 lp = new LoginPage2();
		lp.title();// Overrideen Method
		lp.url();// Overrideen Method
		lp.header();// Inhertied Method
		lp.logo();// Inhertied Method
		lp.doLogin("q2_test_001", "Password@1");
		lp.doLogin("q2_test_001", "Password@1", 992444);

		// Case(2):
		HomePage3 hp = new HomePage3();
		hp.title(); // Overrideen Method
		hp.url();// Overrideen Method
		hp.header();// Inhertied Method
		hp.logo();// Inhertied Method
		// hp.dologin()// Cann't access because siblings

		// Case(3): Topcasting
		Page1 pg = new LoginPage2();
		pg.title();
		pg.url();
		pg.header();
		pg.logo();

		// case( 4) Downcasting
		// HomePage3 p=new Page1(); Dpwncastig not possible

		// Q:Can we Create Constructor Of abstract Class ? A:Yes

		// Q: Is It Compulsory to define Abstract method inside in Abstract class ?

		// A:Not necessary
	}

}
