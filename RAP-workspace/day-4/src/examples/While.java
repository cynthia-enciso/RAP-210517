package examples;

public class While {
	public static void main(String[] args) {
		
		boolean myCondition = true;
		
		while (myCondition) {
			System.out.println("my condition is true!");
			
			// eventually change condition to be false
			myCondition = false;
		}
		
		
		String[] vowels = {"a", "e", "i", "o", "u"};
		int index = 0;
		
		while (index < vowels.length) {
			System.out.println(vowels[index]);
			index++;
		}
	}
}
