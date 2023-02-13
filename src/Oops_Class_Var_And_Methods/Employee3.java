package Oops_Class_Var_And_Methods;

public class Employee3 {
	// _____Class Level Variables/Global Variables_____ to access these have to
	// Create Object
	// What is Class & Obect ?
	// For Single class we will create n No of Objects .....
	// All Objects are stored in Heap memory & their references will be stored in --
	// Stack memory
	int age;
	String name;
	String city;
	double salary;
	boolean isprem;

	public static void main(String[] args) {

		// e1 ==> Obj reference name
		// RHS new Employee --this is the Object
		// Employee is class/type of t1
		// Class is the Non primitive Data Type

		Employee3 e1 = new Employee3();
		e1.age = 30;
		e1.city = "Hyd";
		e1.name = "Irfan";
		e1.salary = 10000;
		System.out.println(e1.age + " " + " " + e1.city + " " + e1.name + " " + e1.salary);
		System.out.println("---------------------");

		Employee3 e2 = new Employee3();
		e2.age = 30;
		e2.city = "Delhi";
		e2.name = "Ayaan";
		e2.salary = 50000;
		System.out.println(e2.age + " " + " " + e2.city + " " + e2.name + " " + e2.salary);

		System.out.println("---------------------");
		// ___Default Values Case___
		Employee3 e3 = new Employee3();
		System.out.println(e3.age + " " + e3.city + " " + e3.name + " " + e3.isprem);

	}

}
