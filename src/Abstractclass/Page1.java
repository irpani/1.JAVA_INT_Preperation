package Abstractclass;
//What is an Abstraction:

//Data abstraction is the process of hiding certain details and showing only essential information to the user. 
//Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

//_______Abstract Class:______
//Abstarst Class Object Cann't Created but able to Create Constructor
//(1).For a class If we declare it with abstrsct Keyword  Then It will become Abstarsct Class
//(2).Just Like Interface we cann't Create Object for Abstract Class also ...
//(3).In Abstarst class both Abstarst methods & Concrete methods both are Allowed

//I have taken 2 abstract methods 2 Concrete Methods 
public abstract class Page1 {
	// 0-arg Constructor:
	public Page1() {
		System.out.println("o_arg Page1 ---- Constructor");
	}

	// int Param Constructor:
	public Page1(int t) {
		System.out.println("int Param ---- Constructor");
	}

	public abstract void title();

	public abstract void url();

	public void header() {

		System.out.println("PAGE ---- Header");
	}

	public final void logo() {

		System.out.println("PAGE ----- logo");
	}

}
