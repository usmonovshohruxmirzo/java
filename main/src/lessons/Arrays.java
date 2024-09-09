package lessons;

public class Arrays {
	public static void main(String[] args) {
		String[] cars = {"BMW", "Tesla", "Ferrari", "Porsche"};
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(numbers[1]);
		
		cars[0] = "Buggatti";
		System.out.println(cars[0]);
		System.out.println("Cars length is\s" + cars.length);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + ",");
		}
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		
		// Example
		
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int avarage, sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println("sum:\s" + sum);
		
		avarage = sum / nums.length;
		System.out.println("avarage:\s" + avarage);
		
		// Multidimensional Arrays
		int[][] multiDArr = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(multiDArr[1][2]);
		
//		for (int i = 0; i < multiDArr.length; i++) {
//			for (int a = 0; a < multiDArr[i].length; a++) {
//				System.out.println(multiDArr[i][a]);		
//			}
//		}
		
		for (int[] row : multiDArr) {
			for (int i : row) {
				System.out.println(i);
			}
		}
	}
}
