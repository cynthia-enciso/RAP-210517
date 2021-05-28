package main;

import models.Dog;
import models.Collar;

public class Simulator {
	public static void main(String[] args) {
		Dog myDog = new Dog("Fred");
//		System.out.println(myDog.name);
//		myDog.name = "Fred";
		System.out.println(myDog.age);
		myDog.grow(5);
		System.out.println(myDog.age);
		
		System.out.println(myDog.collar.color);
		
		Dog myOtherDog = new Dog("Sam", 100.00);
		Dog myThirdDog = new Dog(50.00, "Rover");
	}
}
