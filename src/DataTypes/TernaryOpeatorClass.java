package DataTypes;

public class TernaryOpeatorClass {

	public static void main(String[] args) {
		// Without Ternary Opeator we need to write these 4 Lines for just Assigning to
		// j
		// Instead Of this What we can do we can use Ternary Operator
		int i = 50;
		int j = 0;
		if (i > 4)
			j = 1;
		else
			j = 2;

		System.out.println(j);

		// With Ternary Opeator

		j = i > 4 ? 1 : 2;

	}

}
