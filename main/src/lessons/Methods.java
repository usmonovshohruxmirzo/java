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
	
	static int Recursion(int k) {
		if (k > 0) {
			return k + Recursion(k - 1);			
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		myMethod("Alex");
		Calc(10, 10);
		textUppercase("hello");
		
		int myNum = plusMethodInt(10, 20);
		double myDouble = plusMethodDouble(4.6, 6.2);
		
		System.out.println(myNum);
		System.out.println(myDouble);
		
		// Java Scope

	    // Code here CANNOT use x

	    { // This is a block

	      // Code here CANNOT use x

	      int x = 100;

	      // Code here CAN use x
	      System.out.println(x);

	    } // The block ends here

	  // Code here CANNOT use x
	    
	    
	 // Java Recursion
	 int result = Recursion(5);
	 System.out.println(result);

	}
}
