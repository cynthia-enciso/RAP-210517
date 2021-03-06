package examples;

public class LinkedListExample {
Node head; 
	
	public boolean add(Node node) {
		if(head == null) {
			head = node; 
		}else {
			Node runner = head; 
			while(runner.getNext() != null) {
				runner = runner.getNext();
			}
			runner.setNext(node);
		}
		return true; 
	}
	
	public boolean add(int value) {
		Node newNode = new Node(value);
		return add(newNode); 
	}
	
	public  Integer remove() {
		if(head == null) {
			System.out.println("Empty List");
			return -1;
		}else {
			Node temp = head; 
			head = head.getNext(); 
			temp.setNext(null);
			return temp.getData(); 
		}
	}

	public String toString() {
		String s = ""; 
		Node runner = head; 
		while (runner != null) {
			s += runner + "-->";
			runner = runner.getNext(); 
		}
		s += "null"; 
		return s; 
	}
}
