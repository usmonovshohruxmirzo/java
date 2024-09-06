package lessons;

// Type casting is when you assign a value of one primitive data type to another type.

/*
In Java, there are two types of casting:

	Widening Casting (automatically) - converting a smaller type to a larger type size
	byte -> short -> char -> int -> long -> float -> double
	
	Narrowing Casting (manually) - converting a larger type to a smaller size type
	double -> float -> long -> int -> char -> short -> byte 
*/

public class TypeCasting {
	public static void main(String[] args) {
		// Widening Casting - Widening casting is done automatically when passing a smaller size type to a larger size type:
		int myInt = 9;
		double myDouble = myInt;

		System.out.println(myInt);
		System.out.println(myDouble);
		
		// Narrowing Casting -  Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
		double myD = 7.10;
		int myNum = (int) myD;
		
		System.out.println(myD);
		System.out.println(myNum);
		
		
		// Real-Life Example
		
		int maxScore = 500;
		int userScore = 423;
		float percentage  = userScore / maxScore * 100.0f;
		
		System.out.println("User's percentage is: " + percentage);
	}
}
