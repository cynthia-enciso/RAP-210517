package interfaces;

public interface Refillable {
	// methods
	public abstract void isRefillable();
	
	public default void defaultMethodRefillable() {
		System.out.println("Default implementation in refillable");
	}
}
