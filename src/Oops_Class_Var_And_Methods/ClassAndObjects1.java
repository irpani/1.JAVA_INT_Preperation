package Oops_Class_Var_And_Methods;

//Global Variable Vs Local Variable
//To Access Global Varibles we  must create object for the Class Scope Class Level
//Local Variable Scope ---Method Level
//ShortCuts:
//ctrl+o       ----  to see the VAR & METHODS
//ctrl+shift+R  ---- to search the class 
public class ClassAndObjects1 {
	// __Global Variable___
	int i = 20;

	public static void main(String[] args) {
		// ___Local Varible____
		int i = 10;
		System.out.println(i);

		ClassAndObjects1 obj = new ClassAndObjects1();
		System.out.println(obj.i); // To Access Global Variable we have to create Pgject for the Class
	}

}
