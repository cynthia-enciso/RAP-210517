package generics;
//generics enforce COMPILE TIME SAFETY: you can use whichever type specified and only that type
//makes your classes or methods more flexible
//useful for utility classes or methods 
/*
* Naming Conventions:
	E => Element
	K => Map Key
	V => Map Value
	N => Number
	T => Generic data type
**/
public class Tupperware<T extends FoodItem> {
	private T foodItem;
	
	public T getFoodItem() {
		return this.foodItem;
	}
	
	public void setFoodItem(T foodItem) {
		this.foodItem = foodItem;
	}
}
