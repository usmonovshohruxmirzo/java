package main;

// Data types

/*
 * boolean - true/false
 * byte - 10
 * char - A
 * short - 1000
 * int - 10
 * long - 10000L
 * float - 10.50
 * double - 12.3
*/


public class Variables {
	public static void main(String[] args) {
		int number = 1000;
		
		boolean bool = true;
		
		String text = "Hello";
		
		float floatNumber = (float) 10.10;
		
		float floatNumber2 = 10.10f;
		
		char letter = 'A';
		
		byte b = 10;
		
		short s = 5000;
		
		long l = 100000L;
		
		double d = 12.3;
		
		System.out.println("number: " + number);
		System.out.println("boolean: " + bool);
		System.out.println("string: " + text);
		System.out.println("float: " + floatNumber);
		System.out.println("float: " + floatNumber2);
		System.out.println("char: " + letter);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("long: " + l);
		System.out.println("double: " + d);
	}
}
