package lessons;

public class Strings {
	public static void main(String[] args) {
		String text = "Hello World";
		
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.indexOf("H"));
		
		// String Concatenation
		
		String firstName = "Usmonov";
		String lastName = "Shohruhmirzo";
		
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));
		
		int x = 10;
		String y = "20";
		System.out.println(x + y);
		
		// Special Characters
		System.out.println("Hello\tWorld"); // \t
		System.out.println("Hello\nWorld"); // \n
		System.out.println("Hello\rWorld"); // \r
		System.out.println("Hel\blo World"); // \b
	}
}
