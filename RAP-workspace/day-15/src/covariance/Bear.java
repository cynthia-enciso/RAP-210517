package covariance;

public class Bear extends Animal {
	// constructor
	public Bear(String name) {
		super(name, "Bear", "Bears are huge");
	}
	
	// methods
	public void hibernate() {
		System.out.println(this.getName() + " is sleeping.");
	}
	
	@Override
	public void eat() {
		System.out.println("Eats berries");
	}
	
}
