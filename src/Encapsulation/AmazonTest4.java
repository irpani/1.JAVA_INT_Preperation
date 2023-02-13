package Encapsulation;

public class AmazonTest4 {

	public static void main(String[] args) {
		LoginPageClass3 lp = new LoginPageClass3();
		lp.setUsername("q2_test_001");
		lp.setPassword("Password@1");

		System.out.println(lp.getUsername());
		System.out.println(lp.getPassword());

	}

}
