package Abstractclass;

public class HomePage3 extends Page1 {

	@Override
	public void title() {
		System.out.println("Home Page Title");
	}

	@Override
	public void url() {
		System.out.println("Home Page url");
	}

	// This Concrete method able to override
	@Override
	public void header() {
		System.out.println("Home Page ---- Header");

	}

	// I cann't Override it becasue It is final method so we cann't Override it...
	/*
	 * public void logo() {
	 * 
	 * 
	 * 
	 * }
	 */

}
