package examples;

public class StaticExample {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.setInkColor("blue");
		System.out.println(pen1.getInkColor());
		System.out.println(Pen.getCount());
		
		Pen pen2 = new Pen();
		System.out.println(pen2.getInkColor());
		System.out.println(Pen.getCount());
		
		pen2.printCount();
		System.out.println(Pen.getCount());
		
//		myInstanceMethod(); // won't work
		
		StaticExample obj = new StaticExample();
		obj.myInstanceMethod(); // needs instance to call instance method
	}
	
	public void myInstanceMethod() {
		System.out.println("instance method called!");
	}
}
