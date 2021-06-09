package models;

public class Simulator {
	public static void main(String[] args) {
		Dog dog = new Dog();
		// HAS-A relationship
		System.out.println(dog.getCollar().getColor());
		
		
		System.out.println(dog.getNumberOfLegs());
		
		// IS-A relationship
		System.out.println(dog instanceof Dog);
		System.out.println(dog instanceof Animal);
//		System.out.println(dog.getCollar() instanceof Dog);
		
		Bird bird = new Bird();
		System.out.println(bird.getNumberOfLegs());
		
		// overriding: dynamic binding
		dog.makeNoise();
		
		// object class methods:
		/*
		 * Hashcode: generates an integer that uniquely identifies an object from all other objects of a class. 
		 * 
		 * finalize: called by the garbage collector when there are no more references to the object, 
		 * just before the instance is destroyed. useful for making sure resources created in object are released.
		 * 
		 * equals:
		 * 
		 * note the difference between == and equals with strings. 
		 * 
		 * toString: 
		 */
		
		System.out.println(dog.hashCode());
		
		
		Dog dog2 = new Dog();
		System.out.println(dog.equals(dog2));
		
		
//		dog = null;	
		System.gc(); // calling the garbage collection
		
		System.out.println(dog2);
		
		
//		dog2.setName("Charlie");
//		System.out.println(dog2);
	}
}
