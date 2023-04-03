package DataTypes;

public class Switch_Case4 {

	public static void main(String[] args) {

		// case (1) Switch case with String
		// case (2) Int case with String

		// case (1) Switch case with String:
		// ----------------------------------
		String browser = "xyz";

		switch (browser) {
		case "chrome":
			System.out.println("Chrome Browser ");
			break;
		case "Firefox":
			System.out.println("Firefox Browser ");
			break;
		case "Opera":
			System.out.println("Opera Browser ");
			break;
		case "Safari":
			System.out.println("Safari Browser ");
			break;

		default:
			System.out.println("No browser is launched.....");
			break;

		}

		// Case (2): Int type:
		// -----------------
		int age = 20;
		switch (age) {
		case 10:
			System.out.println(" Stuent Age " + age);
			break;
		case 20:
			System.out.println(" Stuent Age " + age);
			break;
		case 30:
			System.out.println(" Stuent Age " + age);
			break;
		case 40:
			System.out.println(" Stuent Age " + age);
			break;

		default:
			System.out.println("Student not found" + age);
			break;
		}

	}

}
