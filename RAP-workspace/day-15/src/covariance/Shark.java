package covariance;

public class Shark extends Animal {
	public Shark(String name) {
		super(name,
			"Shark",
			"Sharks have been around as long as the dinosaurs!");
	}

	@Override
	public void eat() {
		System.out.println("Eats fish");
		
	}
}
