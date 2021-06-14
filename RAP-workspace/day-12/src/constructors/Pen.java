package constructors;

public class Pen extends WritingUtensil {
	// fields
	private String inkColor = "blue";
	private String type = "fine-point";
	
	// no args constructor
	public Pen() {
		super(100);
	}
	
	// getters and setters
	public Pen(String inkColor, String type) {
		super(100);
		this.inkColor = inkColor;
		this.type = type;
//		this.setType(type); // does the same thing as 
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
