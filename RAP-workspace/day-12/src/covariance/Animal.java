package covariance;

public class Animal {
	// fields
	private String name;
	private String type;
	private String funFact;
	
	// constructors
	public Animal(String name, String type, String funFact) {
		this.name = name;
		this.type = type;
		this.funFact = funFact;
	}
	
	// methods
	public String toString() {
		return "Name: " + this.name + ", type: " + this.type + ", funFact: " + this.funFact;
	}
	
	public void eat() {
		System.out.println("*generic eating*");
	}
	
	// getters and setters
	public String getName() {
		return this.name;
	}
}
