package StringManipulaitons;

//_____String Api Methods_____
//String Internally Stored as Char[]
//String Length() is the  No  Of characters in Char[] -- L
//Li _ Always Starts with -- 0
//Hi _ Length Of the Array L-1
public class StringManipulation3 {

	public static void main(String[] args) {
		// ______Part(1):_______
		String s = "This is my java code and I am so happy";
		System.out.println(s.length());// 38
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(37));
		// System.out.println(s.charAt(38));String index out of range: 38
		// System.out.println(s.charAt(-1));String index out of range: -1
		System.out.println(s.indexOf('j'));// 11
		System.out.println(s.indexOf('i'));// 1 st Occurence Of i
		// In given string Couple of i'a are there so First Occurence Of i is the output
		// I want second occurence of i So how u will get that?
		System.out.println(s.indexOf('i', 3)); // Second occurence Of i --- Static O/p

		// Trw there may be a chance Of Change the String so the o/p may changes I need
		// dynamic O/p

		String str1 = "hello This is my java code and I am so happy";
		System.out.println(str1.indexOf('i', str1.indexOf('i') + 1));

		// I want third occurence can u please try this guys use your brain
		// String s="This is my java code and I am so happy java is best";

		String str2 = "hello This is my java code and I am so happy java is best";
		// Assignment 3rd occurence 4th occurence 5th Occurence By formula

		System.out.println(s.indexOf("code")); // Starts with 16
		System.out.println(s.indexOf("Python")); // -1
		// You can also write Condtion like this ....
		String mesg = "welcome admin";
		if (mesg.indexOf("admin") > 0) {
			System.out.println("pass");

		}
		// toUpperCase()
		// toLowerCase()
		// trim()
		// replace()
		// contains()
		System.out.println(s.toUpperCase());// THIS IS MY JAVA CODE AND I AM SO HAPPY
		System.out.println(s.toLowerCase());// this is my java code and i am so happy

		String str = "   hello world      "; // I want to trim - trim means remove from corners
		System.out.println(str.trim());

		// I want to remove the space between String

		System.out.println(str.replace(" ", "")); // Space also removed

		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));

		String s1 = "your user id is naveenautomation";
		System.out.println(s1.contains("naveenautomation"));

		if (s1.contains("naveenautomation")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		// == equals()
		// equalsIgnoreCase()

		// Comparisions (1).primitives == // (2).Strings .equals()
		// In Strings == to check the reference Comparision
		// equlas() to check the Values Comparision
		// ------------------------0----------------------
		// _____part:(2)_____Memory Optimization
		// Q:Which One is prefered String Literals or String Class?
		// A: String Literlas Only because String class always created 2 objects not
		// recomonded

		// _______String Literlas______ Created 1 Object in SCP
		String t1 = "hello java"; // these are called String Literlas
		String t2 = "hello Java";// jere J is capital
		System.out.println(t1.equals(t2));// false
		System.out.println(t1.equalsIgnoreCase(t2));// true

		String t3 = "hello java";
		String t4 = "hello java";
		System.out.println(t3 == t4);// true becasue these 2 references pointed to same Value
		System.out.println(t1 == t3);// true
		String t5 = "hello java";
		String t6 = "hello python";
		System.out.println(t5 == t6);// false
		// _____Created String By using String Class_______ 2 objects got created 1 in
		// heap 1 in SCP
		String st7 = new String("hello ruby"); // Q: How many Objects created? A:2
		// Now again I created like below How many objects got created?
		// A: 0 becasue st7 already created 2 1 in heap memory 1 in SCP so this scp
		// object pointed to st7
		String st8 = "hello ruby";
		// Q:Can we have Duplicate values in String Constant pool ?
		// A:No we don't have
		String st9 = new String("hello ruby"); // Now How many Objects got Created ?
		// When ever using new keyword It is always created Object in Heap

		System.out.println(st7 == st9); // false Compare references
		System.out.println(st7.equals(st9));// true Values same

		// Part 3: ______Programming type______
		// Always Remember when ever u splitting On LHS side u must write 1 Array
		// Split ---- Ex1: On the basis Of _ underscore
		// SubString()
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");
		System.out.println(langArr[0]);
		System.out.println(langArr[1]);
		System.out.println(langArr[2]);
		System.out.println(langArr[3]);
		// System.out.println(langArr[4]); java.lang.ArrayIndexOutOfBoundsException: 4

		for (String e : langArr) {
			System.out.println(e);
		}

		// // Split ---- Ex2: On the basis Of xX
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";

		String nameAr[] = name.split("xX");
		System.out.println(nameAr[0]);// Blank Value
		System.out.println(nameAr[1]);
		System.out.println(nameAr[2]);
		System.out.println(nameAr[3]);

		for (String e1 : nameAr) {
			System.out.println(e1);
		}

		String empData = "Hiren;patel;40;NY;USA;01-01-1970;Selenium;QA";
		String empAr[] = empData.split(";");

		for (String e2 : empAr) {

			System.out.println(e2);
		}

		String credentials = "admin:admin";
		System.out.println(credentials.split(":")[0]);
		System.out.println(credentials.split(":")[1]);

		// ____SubString____
		String message = "your orderid  is 12345";
		System.out.println(message.substring(17));
		System.out.println(message.substring(0, 10)); // Hard coded values

		// Trw there may be a chance to Change the values so how will u do that

		System.out.println(message.substring(message.indexOf("is") + 3, message.length()));

	}
}