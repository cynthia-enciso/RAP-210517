package examples;

public class DoWhile {
	public static void main(String[] args) {
		
		// example #1
//		boolean myCondition = false;
//		
//		do {
//			System.out.println("inside code block");
//		} while(myCondition);
		
		
		// example #2
		int tvWatchingLimit = 10;
		
		do {
			System.out.println("I think I'm going to change the channel on the TV...");
			System.out.println("*changes channel*");
			
			tvWatchingLimit--;
			
			System.out.println("Have I reached my limit of channels to browse?");
			
			if (tvWatchingLimit > 1) {
				System.out.println("I have " + tvWatchingLimit + " channels left to browse.");
			} else if (tvWatchingLimit > 0) {
				System.out.println("I have " + tvWatchingLimit + " channel left to browse.");
			} else {
				System.out.println("I have no more channels to browse. Time to find something else to do.");
			}
		} while(tvWatchingLimit > 0);
	}
}
