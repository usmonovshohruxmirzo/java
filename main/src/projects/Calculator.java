package projects;

public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int result;
		String operator = "+";
		
		switch(operator) {
		case "+":
			result = a + b;
			System.out.print(a + " + " + b + " = ");
			System.out.print(result);
		break;
		case "-":
			result = a - b;
			System.out.print(a + " - " + b + " = ");
			System.out.print(result);
		break;
		case "/":
			if (b == 0) {
				System.err.println(a + " Cannot divided by " + b);
			} else {
				result = a - b;
				System.out.print(a + " / " + b + " = ");
				System.out.print(result);
			}
		break;
		case "*":
			result = a - b;
			System.out.print(a + " * " + b + " = ");
			System.out.print(result);
		break;
		default: System.out.println("operator not found");
		}
		
	}
}
