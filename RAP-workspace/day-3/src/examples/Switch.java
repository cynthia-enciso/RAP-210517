package examples;

public class Switch {
	
	// not quite a class
		// represents a group of unchanging variables
		// can be accessed with dot notation
	static enum DAY {
		MONDAY, 
		TUESDAY, 
		WEDNESDAY, 
		THURSDAY, 
		FRIDAY,
		SATURDAY,
		SUNDAY
		}
		
		// https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
		
	public static void main(String[] args) {
		// can support int, char, short, byte, string and enum
		int int1 = 3;
		
		switch (int1) {
		case 1:
			System.out.println("number is 1");
			break;
		case 2:
			System.out.println("number is 2");
			break;
		case 3:
			System.out.println("number is 3");
			break;
		case 4:
			System.out.println("number is 4");
			break;
		case 5:
			System.out.println("number is 5");
			break;
		default:
			System.out.println("number is not in the range of 1-5");
			break;
		}
		
		DAY myDay = DAY.FRIDAY;
		
		switch (myDay) {
		case MONDAY:
			System.out.println("it is monday");
			break;
		case TUESDAY:
			System.out.println("it is tuesday");
			break;
		case WEDNESDAY:
			System.out.println("it is wednesday, my dudes");
			break;
		case THURSDAY:
			System.out.println("it is thursday");
			break;
		case FRIDAY:
			System.out.println("it is friday");
			break;
		default:
			System.out.println("it's the weekend!");
			break;
		}
		
		// when you want to use fall-through
		switch (myDay) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			System.out.println("it's a weekday!");
			break;
		default:
			System.out.println("it's the weekend!");
			break;
		}
	}
}
