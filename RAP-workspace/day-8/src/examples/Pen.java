package examples;

public class Pen {
	// fields
	private String inkColor = "black";
	private String type = "rollerball";
	private static int count = 0;
	
	// constructors
	public Pen() {
		count++;
	}
	
	// methods
	public void printCount() {
		count++;
	}
	
	// getters and setters
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
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pen.count = count;
	}
	
}
