package covariance;

public class Simulator {
	public static void main(String[] args) {
		Bear bear = new Bear("Yogi");
		bear.hibernate();
//		((Animal)bear).hibernate(); // upcasting same as below, can't use subclass method
		
		Animal anim = new Bear("Koda");
		anim.eat();
//		((Bear)anim).hibernate(); // we can downcast but we need to be careful
		
		Animal anim2 = new Shark("Sharky");
//		((Bear)anim2).hibernate(); // we can downcast but we need to be careful
		
//		if (anim instanceof Bear) {
//			((Bear) anim).hibernate();
//		}
//		
//		if (anim2 instanceof Bear) {
//			((Bear) anim).hibernate();
//		} else {
//			System.out.println("object is an animal BUT not a bear!");
//		}
//		
		try {
			((Bear) anim2).hibernate();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("after try catch");
		Animal[] animalArray = new Animal[4];
		
		animalArray[0] = new Bear("Koda");
		animalArray[1] = new Shark("Sharky");
		animalArray[2] = new Platypus("Platty");
		animalArray[3] = new Capybara("Cappy");
//		
//		for (Animal animal : animalArray) {
//			animal.eat();
//		}
	}
}
