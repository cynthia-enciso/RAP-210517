package examples;

public class ArrayStack {
		private int[] stack = new int[5]; 
		private int lastElementIndex = -1; 
		
		public void push(int element) {
			// check if we are out of room
			if(lastElementIndex == stack.length - 1) {
				int[] newStack = new int[stack.length*2]; 
				for(int j = 0; j<stack.length; j++) {
					newStack[j] = stack[j];
				}
				stack = newStack; 
			}
			lastElementIndex++;
			stack[lastElementIndex] = element;
			
		}
		
		public Integer pop() {
			if (lastElementIndex >= 0)
				return stack[lastElementIndex--]; 		
			else 
				return null;
		}
		
		public int peek() {
			return stack[lastElementIndex]; 
		}
		
		public String toString() {
			String s = "";
			 for (int i = 0; i <= lastElementIndex; i++) {
				 s += "[Index: " + i + " Data: " + stack[i] + "] --> ";
			 }
			 s += " end!";
			 return s;
		 }
		
		public static void main(String[] args) {
			ArrayStack stack = new ArrayStack();
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
