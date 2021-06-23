package comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Simulator {
	public static void main(String[] args) {
		Dog dog1 = new Dog("German Shepard", 2, 80.0, false);
		Dog dog2 = new Dog("Corgi", 5, 13.0, true);
		Dog dog3 = new Dog("Standard Poodle", 8, 75.0, true);
		Dog dog4 = new Dog("Pug", 3, 25, true);
		
		
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		System.out.println(dogs);
		
//		Collections.sort(dogs);
//		System.out.println(dogs);
		
		Dog[] dogArray = new Dog[dogs.size()];
		dogArray = dogs.toArray(dogArray);
		Arrays.sort(dogArray);
		System.out.println(Arrays.toString(dogArray));
		
		Collections.sort(dogs, new AgeComparator());
		System.out.println(dogs);
		
		Collections.sort(dogs, new WeightComparator());
		System.out.println(dogs);
	}
}
