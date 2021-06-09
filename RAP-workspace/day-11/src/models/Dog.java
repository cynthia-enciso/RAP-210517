package models;

public class Dog extends Animal {
	
	//fields
	private Collar collar = new Collar();

	// constructor
	public Dog() {
		this.setNumberOfLegs(4);
		this.setName("Buster");
	}
	
	//methods
	@Override
	public void makeNoise() {
		System.out.println("woof!");
	}

	
	// getters and setters
	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (collar == null) {
			if (other.collar != null)
				return false;
		} else if (!collar.equals(other.collar))
			return false;
		return true;
	}
	
	public void finalize() {
		System.out.println("Dog is being destroyed!");
	}
	
	public String toString() {
		return this.getName() + " has " + this.getNumberOfLegs() + " legs";
	}
}
