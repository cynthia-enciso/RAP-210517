package generics;

public class Simulator {
	public static void main(String[] args) {
		Tupperware<FoodItem> tupperware = new Tupperware<>();
		tupperware.setFoodItem(new Salad());
		tupperware.setFoodItem(new HotDog());
		System.out.println(tupperware.getFoodItem().toString());
	}
}
