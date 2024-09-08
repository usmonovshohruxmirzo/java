package lessons;

public class IfElse {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		if (x < y) {
			System.out.println(x + "\sis less than\s" + y);
		} else {
			System.out.println(x + "\sis greater than\s" + y);
		}
		
		String lang = "js";
		
		if (lang == "js") {
			System.out.println("JavaScript");
		} else if (lang == "py") {
			System.out.println("Python");			
		} else if (lang =="java") {
			System.out.println("Java");
		} else {
			System.out.println("Language not found.");
		}
		
		// ternary operator
		boolean isLoggedIn = true;
		String response = isLoggedIn ? "Welcome to Dashboard" : "You need to login to visit our Dashboard";
		System.out.println(response);
		
		// Example
		
		int num = -90;
		if (num % 2 == 0) {
			System.out.println(num + "\sis even number");
		} else if (num % 2 == 1) {
			System.out.println(num + "\sis odd number");
		}
				
	}
}
