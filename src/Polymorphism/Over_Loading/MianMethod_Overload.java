package Polymorphism.Over_Loading;

//Main Method Overloading  -----   is Possible
//Main Method Overriding   -----   N't possible 
public class MianMethod_Overload {

	// _____Main Method Overloading______
	// String[] args is the ---- Cmd line arguments Jvm will search for this in main
	// method
	public static void main(String[] args) {
		System.out.println("main_1");
	}

	public static void main(int a[]) { // This is Array Parmater
		System.out.println("int a[] arguments");
	}

	public static void main(int a) { // This is Normal Parmater
		System.out.println("Passing int as Paramter");
	}

}
