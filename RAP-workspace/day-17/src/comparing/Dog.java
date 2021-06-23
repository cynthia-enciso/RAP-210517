package comparing;

public class Dog implements Comparable<Dog> {
	// fields
	private String breed;
	private int age;
	private double weight;
	private boolean isMale;
	
	// parameterized constructor
	public Dog(String breed, int age, double weight, boolean isMale) {
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.isMale = isMale;
	}
	
	// methods
	@Override
	public int compareTo(Dog o) {
		if (this.getBreed().compareToIgnoreCase(o.getBreed()) < 0) {
			return -1;
		} else if (this.getBreed().compareToIgnoreCase(o.getBreed()) > 0) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "{ " + this.breed + ": " + this.age + " years old, " + this.weight + " pounds}";
	}
	
	// getters and setters
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	
	
	
}
