package main;

import one.Dog;

public class Simulator {
	// default access:
		// given to a member if no access modifier specified
		// accessible within the package
	// public access modifier:
		// accessible anywhere
	// private access modifier:
		// accessible ONLY within the class
	// protected access modifier:
		// accessible within the package OR
		// within another package if accessed through a subclasses
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.name = "Charlie";
//		System.out.println(dog.name);
//		dog.setName("Charlie");
//		System.out.println(dog.getName());
//		System.out.println(dog.getBreed());
//		System.out.println(dog.getAge());
//		
//		Dog dog2 = new Dog("Sparky");
//		System.out.println(dog2.getName());
//		System.out.println(dog2.getBreed());
//		System.out.println(dog2.getAge());
		
		
		// primitives vs reference variables
		int num = 9;
		// class type  reference variable name = assign to an object created in memory
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		// reassign dog2
//		dog2 = dog1;
//		dog1.setAge(3);
//		System.out.println(dog1.getAge());
//		System.out.println(dog2.getAge());
		
		// cannot compare objects (other than strings) with ==
		// unless you are using it to see if it is the exact
		// same object in memory
		if(dog1 == dog2) {
			System.out.println("objects are the SAME in memory");
		} else {
			System.out.println("objects are DIFFERENT");
		}
		
		two.Dog newDog = new two.Dog();
		System.out.println(newDog.name);
		
	}
}
