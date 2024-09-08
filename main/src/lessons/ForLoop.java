package lessons;

public class ForLoop {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 0; i < 10; i+=2) {
//			System.out.println(i);
//		}
		
		// Nested Loop
		for (int i = 0; i < 5; i++) {
			System.out.println("Outer\s" + i);
			for (int a = 0; a < 5; a++) {
				System.err.println("Inner\s" + a);
			}
		}
		
		// For-Each Loop
		String[] cars = {"BMW", "Tesla", "Ferrari"};
		// : == 'in' keyword in js
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		// Example
		
		int number = 5; // shows multiplication table of 5
		for (int x = 0; x <= number; x++) {
			System.out.println(number + "\s*\s" + x + "\s=\s" + number * x);
		}
	}
}
