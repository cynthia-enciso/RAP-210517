package models;

public class Animal {
	// field
	private int numberOfLegs;
	private String name;
	
	// methods
	public void makeNoise() {
		System.out.println("*generic animal noise*");
	}

	// getters and setters
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	
}
