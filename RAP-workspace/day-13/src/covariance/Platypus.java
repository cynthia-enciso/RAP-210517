package covariance;

public class Platypus extends Animal {
	public Platypus(String name) {
		super(name,
			"Platypus", 
			"Male Platypus have spurs on their hind-feet which contain a powerful and painful venom!");
	}

	@Override
	public void eat() {
		System.out.println("Eats weeds");
		
	}
}
