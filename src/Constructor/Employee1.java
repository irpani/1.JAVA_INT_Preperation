package Constructor;
//___Construcor Concept___

//Q:Y Constructor ?
// A:Constructor help me to initialize the class variables help me to create the Objects

//(1).Name of the Constructor will be same as class name
//(2).Constructor didn't have any return type ,It's look like a method
//(3).Constructor will be called at the time of creating the Object
//(4).Types Of Constructor
//  a.0_arg Constructor
// b.Param Constructor

//Function may or may not return the value but Constructor never return he value
//function name will be any thing but Constructor name will be same as classsName
//Fun will have business/feature logic but Const will be helping to create the Object

//To call the function we need to create the Object and use Object ref variable
//but to call the Constructor ...jus create the Object & supply the values..

//Q:Can we overoad the Constructor ? A: Yes

public class Employee1 {

	public String name;
	public int id;
	public int age;
	public double salary;
	public boolean isPerm;
	public char gender;

	// 0_arg Constructor
	public Employee1() {
		System.out.println("o_arg Constructor");
	}

	// Parametarised Constructor
	public Employee1(int a) {
		System.out.println("param Constructor");
	}

	// few class level properties
	public Employee1(double salary, boolean isPrem, char gender) {
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}

	// This is tedious job writing manually so we have short cut for that ...
	// All Class level Properties
	// This s tedious job to write for 50 variables this.50 varbles
	// what is the Short cut for it right Click ---Source ---Constructor
	/**
	 * @param name
	 * @param id
	 * @param age
	 * @param salary
	 * @param isPerm
	 * @param gender
	 */
	public Employee1(String name, int id, int age, double salary, boolean isPerm, char gender) {

		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}

}