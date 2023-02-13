package Constructor;

public class EmployeeTest2 {

	public static void main(String[] args) {
		// What is the problem witht this Approch
		// we will initialize the each employee manually Everytime ...
		// Ways Of Creating Obect type_1
		Employee1 emp1 = new Employee1();
		emp1.name = "Irfan";
		emp1.age = 20;
		emp1.id = 16802;
		emp1.isPerm = true;
		emp1.salary = 50_000;

		Employee1 emp2 = new Employee1();
		emp2.name = "Ayaan";
		emp2.age = 10;
		emp2.id = 26802;
		emp2.isPerm = false;
		emp2.salary = 30_000;

		Employee1 e100 = new Employee1();
		e100.name = "Afsheen";
		e100.age = 4;
		e100.id = 9009;
		e100.isPerm = true;
		e100.salary = 40_000;

		// Constructor overloading
		Employee1 e1 = new Employee1(); // Default Constructor Called
		Employee1 e2 = new Employee1(10);

		// Creating Obect type_2 --- In this way we can easily initilize class level
		// varibles with Constructors
		Employee1 e3 = new Employee1("Irfan", 111, 14, 44_000, true, 'm');
		Employee1 e4 = new Employee1("Shaik", 222, 24, 54_000, false, 'f');
		Employee1 e5 = new Employee1("Ayaan", 333, 34, 74_000, true, 'm');

		// MySystemClass m = new MySystemClass(); Not able to create Object we are
		// restricted to create

	}

}
