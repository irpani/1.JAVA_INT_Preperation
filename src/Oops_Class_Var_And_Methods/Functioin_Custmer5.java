package Oops_Class_Var_And_Methods;

import java.util.ArrayList;

public class Functioin_Custmer5 {

	// ____behavior's Of a Customer_____

	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("Searching the Product");

		ArrayList<String> prodList = new ArrayList<String>();
		switch (categoryName) {
		case "APPLE":
			prodList.add("iph12");
			prodList.add("MacBook Pro");
			prodList.add("ipad mini");
			break;
		case "SAMSUNG":
			prodList.add("s8");
			prodList.add("Samsung Tablet");

			break;
		case "HP":
			prodList.add("Headphone");
			prodList.add("Hp Laptop");

			break;

		default:
			System.out.println("Product Category Not found" + categoryName);
			break;
		}
		return prodList;
	}
	// Typical Ex of Cross Browser Logic
	// WAF --- Launch the Browser
	// Input param : browser name(String)
	// return void

	public void launchTheBrowser(String browsername) {

		if (browsername.equals("Chrome")) {
			System.out.println("Launch Chrome Browser");
		} else if (browsername.equals("Firefox")) {
			System.out.println("Launch Fiefox Browser");
		}

		else {
			System.out.println("Please pass the right Browser");
		}

		switch (browsername) {
		case "Chrome":
			System.out.println("Chrome Browser launhed");
			break;
		case "Firefox":
			System.out.println("Firefox Browser launhed");
			break;
		case "Opera":
			System.out.println("Opera Browser launhed");
			break;
		case "Safari":
			System.out.println("Safari Browser launhed");
			break;

		default:
			System.out.println("User Not Selected right Browser");
			break;
		}

	}

	public static void main(String[] args) {

		Functioin_Custmer5 c1 = new Functioin_Custmer5();
		ArrayList<String> ar = c1.doSearch("HP");
		System.out.println(ar);
		System.out.println(ar.size());

	}

}
