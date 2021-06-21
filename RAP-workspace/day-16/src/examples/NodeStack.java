package examples;

public class NodeStack {
	Node top;
	
	public void push(int element) {
		Node node = new Node(element);
		push(node);
	}
	
	public void push(Node node) {
		node.setNext(top); 
		top = node; 
	}
	
	public Node pop() {
		Node poppedNode = top; 
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}
	
	public Node peek() {
		return top; 
	}
	
	public String toString() {
		 String s = "";
		 Node runner = top;
		 while (runner != null) {
			  s += runner + " --> ";
			  runner = runner.getNext();
		 }
		 s += " end!";
		 return s;
	 }
	
	public static void main(String[] args) {
		NodeStack stack = new NodeStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack.toString());
		
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.toString());
		
		System.out.println(stack.peek());
	}

}
