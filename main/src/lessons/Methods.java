package lessons;

public class Methods {
	static void myMethod(String name) {
		System.out.println(name + "\sHello!");
	}
	
	static void textUppercase(String text) {
		System.out.println(text.toUpperCase());
	}
	
	static void Calc(int a, int b) {
		System.out.print(a + "\s+\s" + b + "\s=\s");
		System.out.println(a + b);
	}
	
	// Java Method Overloading
	
	static int plusMethodInt(int x, int y) {
		return x + y;
	}
	
	static double plusMethodDouble(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		myMethod("Alex");
		Calc(10, 10);
		textUppercase("hello");
		
		int myNum = plusMethodInt(10, 20);
		double myDouble = plusMethodDouble(4.6, 6.2);
		
		System.out.println(myNum);
		System.out.println(myDouble);
	}
	
}
