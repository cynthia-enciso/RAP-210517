package examples;

public class Node {
	// Data
	private Integer data = 0;

	// Reference to next node
	private Node next = null;

	// Constructors
	public Node(Integer data) {
		this.data = data;
	}

	public Integer getData() {	return data; }

	public void setData(Integer data) { this.data = data; }

	public Node getNext() {	return next; }

	public void setNext(Node next) { this.next = next; }

	@Override
	public String toString() {
		return "Node: data ="+this.data; 
	}

}
