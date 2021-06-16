package abstraction;

public abstract class WritingTool {
	// fields
	private int useability;

	// constructors
	public WritingTool() {
		this.useability = 100;
	}
	
	// methods
	public abstract void write();
	
	// getters and setters
	public int getUseability() {
		return useability;
	}

	public void setUseability(int useability) {
		this.useability = useability;
	}
	
	
}
