package constructors;

public class WritingUtensil {
	private int durability = 100;
	
	// given a default no-args constructor
//	public WritingUtensil() {
//		System.out.println("created writing utensil");
//	}
	
	public WritingUtensil(int durability) {
		this.durability = durability;
	}
	
	//getters and setters
	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}
	
}
