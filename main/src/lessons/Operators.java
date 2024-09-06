package lessons;

// Java divides the operators into the following groups:
/*
 * Arithmetic operators
 * Assignment operators
 * Comparison operators
 * Logical operators
 * Bitwise operators
*/

public class Operators {
	public static void main(String[] args) {
		int x = 10 + 10;
		System.out.println(x);
		
		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		System.out.println(sum3);
		
		int s = 10 - 5;
		int m = 10 * 2;
		int d = 10 / 2;
		int modulus = 10 % 3;
		
		System.out.println(s);
		System.out.println(m);
		System.out.println(d);
		System.out.println(modulus);
		
		int myNum = 10;
		
		myNum++;
		++myNum;
		System.out.println(myNum);
		

		--myNum;
		System.out.println(myNum);
		
		// Assignment Operators
		int myInt = 10;
		myInt += 50;
		System.out.println(myInt);
		
		myInt -= 10;
		System.out.println(myInt);
		
		myInt *= 10;
		System.out.println(myInt);
		
		myInt /= 10;
		System.out.println(myInt);
		
		myInt %= 10;
		System.out.println(myInt);
		
		myInt &= 5;
		System.out.println(myInt);
		
		myInt |= 5;
		System.out.println(myInt);
		
		myInt ^= 5;
		System.out.println(myInt);
		
		myInt >>= 5;
		System.out.println(myInt);
		
		myInt <<= 5;
		System.out.println(myInt);
		
		// Comparison Operators
		
		int a = 5;
		int b = 7;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		// Logical Operators
		
		System.out.println(a < 5 && b < 8);
		System.out.println(a < 5 || b < 8);
		System.out.println(!(a < 5) && b < 8);
	}
}
