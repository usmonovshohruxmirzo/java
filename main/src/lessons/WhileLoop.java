package lessons;

public class WhileLoop {
	public static void main(String[] args) {
		System.out.println("while");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("do while");
		int x = 0;
		do {
			System.out.println(x);
			x++;
		} while(x < 10);
		
		// Example
		
		System.out.println("countdown is started");
		int countdown = 10;
		while(countdown > 0) {
			System.out.println(countdown);
			countdown--;
		}
		System.out.println("countdown is over");
		
		int dice = 2;
		while(dice <= 6) {
			if (dice < 6) {
				System.out.println(dice + ".\sNo Yatzy.");	
			} else {
				System.out.println(dice + ".\sYatzy!");
			}
			dice = dice + 1;
		}
	}
}
