package examples;

public class PassByValue {
	public static void main(String[] args) {
		int x = 9;
		String word = "laptop";
		Pen pen = new Pen();
		
		// primitives are pass by value, value gets copied
		System.out.println("primitive before change: " + x);
		changePrimitive(x);
		System.out.println("primitive after change: " + x);
		
		// strings work like primitives when we talk about pass by value
		System.out.println("String before change: " + word);
		changeString(word);
		System.out.println("String after change: " + word);
		
		// other objects can have their properties changed even with pass by value
		System.out.println("Object before change: " + pen.getInkColor());
		changeObject(pen);
		System.out.println("Object after change: " + pen.getInkColor());
	}
	
	public static void changePrimitive(int x) {
		x = 10;
	}
	
	public static void changeString(String word) {
		word = "tablet"; // after this method executes and finishes, the object is garbage collected
	}
	
	public static void changeObject(Pen pen) {
		pen.setInkColor("red");
	}
	
}
