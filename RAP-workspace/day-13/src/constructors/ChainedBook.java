package constructors;

public class ChainedBook {
	// fields
	private String title;
	private String author;
	private int pages;
	
	// constructors
	public ChainedBook() {
		this("The Stand", "Stephen King", 1000);
	}
	
	public ChainedBook(String title, String author) {
		this(title, author, 100);
	}
	
	public ChainedBook(String title, String author, int pages) {
		System.out.println("Book Created!");
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	// methods
	public String toString() {
		return this.title + ", " + this.author + ", " + this.pages;
	}
	
	// getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
}
