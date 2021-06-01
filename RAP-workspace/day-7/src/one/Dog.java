package one;

public class Dog {
	// state: fields, properties
	// created using variables
	private String name;
	private String breed;
	private int age;
//	private Collar collar;
	
	//constructors
	public Dog() {
		// 'this' keyword call must be in first line of constructor
		this("Charlie", "Greyhound", 5);
	}
	
	public Dog(String name) {
		this(name, "Greyhound", 5);
//		this.name = name;
	}
	
	public Dog(String name, String breed) {
		this(name, breed, 5);
//		this.name = name;
//		this.breed = breed;
	}
	
	public Dog(String name, String breed, int age) {
		System.out.println("Created dog object!");
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	// behavior: method
	// created using methods
	public void bark() {
		System.out.println("woof!");
	}
	
	// getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == "Dog") {
			this.name = "Fido";
		} else {
			this.name = name;
		}
	}

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

//	public Collar getCollar() {
//		return collar;
//	}
//
//	public void setCollar(Collar collar) {
//		this.collar = collar;
//	}
}
