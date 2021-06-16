package constructors;

public class Simulator {
	public static void main(String[] args) {
		WritingUtensil writingUtensil = new WritingUtensil(100);
		
		Pen pen = new Pen();
		
		Pen pen2 = new Pen("black", "rollerball");
		
//		Book book1 = new Book();
//		System.out.println(book1);
//		
//		Book book2 = new Book("Jurassic Park", "Michael Crichton");
//		System.out.println(book2);
//		
//		Book book3 = new Book("The Martian", "Andy Weir", 500);
//		System.out.println(book3);
		
		ChainedBook book1 = new ChainedBook();
		System.out.println(book1);
		
		ChainedBook book2 = new ChainedBook("Jurassic Park", "Michael Crichton");
		System.out.println(book2);
		
		ChainedBook book3 = new ChainedBook("The Martian", "Andy Weir", 500);
		System.out.println(book3);
	}
}
