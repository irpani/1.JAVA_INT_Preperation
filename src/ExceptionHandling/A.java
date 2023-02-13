package ExceptionHandling;

//_____Static Over flow Example_____
//A called B  & B called A finally Afyer some time getting Stack overflow Error
public class A {

	public static void main(String[] args) {
		System.out.println("A_main");
		B.main(args);

	}

}
