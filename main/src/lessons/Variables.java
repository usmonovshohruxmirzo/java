package main;

public class Variables {
	public static void main(String[] args) {
		int number = 1000;
		boolean bool = true;
		String text = "Hello";
		float floatNumber = (float) 10.10;
		float floatNumber2 = 10.10f;
		char letter = 'A';
		
//		System.out.println("number: " + number);
//		System.out.println("boolean: " + bool);
//		System.out.println("string: " + text);
//		System.out.println("float: " + floatNumber);
//		System.out.println("float: " + floatNumber2);
//		System.out.println("char: " + letter);
		
//		int x = 10;
//		int y = 10;
//		System.out.print("result: "); 
//		System.out.print(x + y);
		
//		int x = 20, y = 20, z = 20; // comma-separated list
//		System.out.print("result x + y + z = ");
//		System.out.print(x + y + z);
		
//		int x, y, z;
//		x = y = z = 50;
//		System.out.print(x + y + z);
		
		// Identifiers
		
//		int num = 10;
//		int $ = 10;
//		int _hello = 20;
//		String helloWorld = "helloWorld";
//		String HelloWorld = "HelloWorld";
//		
//		System.out.println($);
//		System.out.println(_hello);
//		System.out.println(helloWorld);
//		System.out.println(HelloWorld);
		
		
		// Student Info
		String studentName = "Alex";
		int studentId = 897;
		int studentAge = 18;
		float studentFee = 78.100f;
		char studentGrade = 'A';
		
		System.out.println("- Student Name: " + studentName);
		System.out.println("- Student ID: " + studentId);
		System.out.println("- Student Age: " + studentAge);
		System.out.println("- Student Fee: " + "$" + studentFee);
		System.out.println("- Student Grade: " + studentGrade);
		
		// Calculate the Area of a Rectangle	
		int length = 4;
		int width = 6;
		int area;
		
		area = length * width;
		
		System.out.println("Length is: " + length);
		System.out.println("Width is: " + width);
		System.out.println("Area of Rectangle is: " + area);
		
	}
}