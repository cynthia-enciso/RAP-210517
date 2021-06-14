package covariance;

public class Capybara extends Animal {
	public Capybara(String name) {
		super(name,
			"Capybara",
			"Capybara are the world's largest Rodent!");
	}

	@Override
	public void eat() {
		System.out.println("Eats grass");
		
	}
}
