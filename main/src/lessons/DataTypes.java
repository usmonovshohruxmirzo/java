package lessons;

/*
 There are eight primitive data types in Java:

 * Data Type    Size        Description
 * byte 		1 byte 	    Stores whole numbers from -128 to 127
 * short 		2 bytes 	Stores whole numbers from -32,768 to 32,767
 * int 	    	4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
 * long 		8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * float 		4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 * double 		8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
 * boolean 		1 bit 	    Stores true or false values
 * char 		2 bytes 	Stores a single character/letter or ASCII values
*/

// non-primitive types are:
/*
 * Class
 * Object
 * String
 * Array
 * Interface
*/

public class DataTypes {
	public static void main(String[] args) {
		
	int number = 1000;
	boolean bool = true;
	String text = "Hello";
	float floatNumber = (float) 10.10;
	float floatNumber2 = 10.10f;
	char letter = 'A';
	byte b = 10;
	short s = 1000;
	long l = 50000L;
	double d = 12.32;
	
//	System.out.println(number);
//	System.out.println(bool);
//	System.out.println(text);
//	System.out.println(floatNumber);
//	System.out.println(floatNumber2);
//	System.out.println(letter);
//	System.out.println(b);
//	System.out.println(s);
//	System.out.println(l);
//	System.out.println(d);
	
	
	// Integer types: byte, short, int, long
	// Float: float, double
	
	// byte - The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
	byte myNum = 10;
	System.out.println(myNum);
	
	// short - data type can store whole numbers from -32768 to 32767:
	short myShort = 32767;
	System.out.println(myShort);
	
	// int - The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
	int myInt = 2147483647;
	System.out.println(myInt);
	
	// long - The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
	long myLong = 15000000000L;
	System.out.println(myLong);
	
	// Floating Point Types - The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
	float myF = 5.75f;
	System.out.println(myF);
	
	double myD = 19.99d;
	System.out.println(myD);
	 /*
	 * Use float or double?
	 * The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.
	 */
	
	float f1 = 35e3f;
	double d1 = 12E4d;
	System.out.println(f1);
	System.out.println(d1);
	
	// Boolean Types
	// boolean data type, which can only take the values true or false:
	boolean isJavaFun = true;
	boolean isFishTasty = false;
	
	System.out.println(isJavaFun); 
	System.out.println(isFishTasty);
	
	// Characters
	
	// The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
	char myGrade = 'A';
	System.out.println(myGrade);
	//Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
	char myVar = 65;
	System.out.println(myVar);
	
	// String
	// The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
	String str = "Hello World";
	System.out.println(str);
	
	// Exercise
	
	int items = 50;
	float costPerItem = 9.99f;
	float totalCost = items * costPerItem;
	char currency = '$';
	
	System.out.println("Number of items: " + items);
	System.out.println("Cost per item: " + costPerItem + currency);
	System.out.println("Total Cost: " + totalCost + currency);
	
	
	
	
	
	}
}
