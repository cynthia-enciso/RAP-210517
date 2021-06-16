package interfaces;

public interface Purchasable {
	// fields
	public static final double LOWEST_COST = 0.01;
	
	// methods
	public abstract void isPurchasable();
	
	public default void defaultMethodPurchasable() {
		System.out.println("Default implementation in purchasable");
	}
	
	public static void staticMethod() {
		System.out.println("static method in purchasable interface!");
	}
}
