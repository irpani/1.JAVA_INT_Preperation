package Oops_Class_Var_And_Methods;

public class ObjectRefer_Concepts2 {

	// Class Data members
	// ___Class Var____
	String name;
	int age;

	// ____Methods___
	public void get() {
		System.out.println("get method");
	}

	public static void main(String[] args) {

		ObjectRefer_Concepts2 obj = new ObjectRefer_Concepts2();
		// Case 1
		obj = null; // null means -->The above object is not referring any one
		// Getting Null Pointer Exception not able to acces class Propeties ..

		// //Case 2 Now Object poited to object so that we can access the properties
		obj.name = "tom";
		obj.age = 20;
		// Every time Creating Object Not a good Appproch ,These are no reference
		// objects
		// gc() will clear all those objects
		new ObjectRefer_Concepts2().age = 20;
		new ObjectRefer_Concepts2().name = "Ayaan";

	}

}
