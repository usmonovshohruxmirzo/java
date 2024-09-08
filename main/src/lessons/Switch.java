package lessons;

public class Switch {
	public static void main(String[] args) {
		int day = 1;
		switch(day) {
			case 1:
				System.out.println(day + "\sMonday");
				break;
			case 2:
				System.out.println(day + "\sTuesday");
				break;
			case 3:
				System.out.println(day + "\sWednesday");
				break;
			case 4:
				System.out.println(day + "\sThursday");
				break;
			case 5:
				System.out.println(day + "\sFriday");
				break;
			case 6:
				System.out.println(day + "\sSaturday");
				break;
			case 7:
				System.out.println(day + "\sSunday");
				break;
			default: System.out.println(day + "\snot exists in week");
		}
	}
}
