package examples;

import java.util.ArrayDeque;
import java.util.Stack;

public class DequeEx {
	public static void main(String[] args) {
		System.out.println(":::::::::: Deque ::::::::::");
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		for (int i = 1; i <= 5; i++ ) {
			deque.add(i);
		}
		
		System.out.println(deque);
		
		// queue methods
		deque.offer(6); // adding to end
		System.out.println(deque);
		
		deque.poll(); // removing from beginning
		System.out.println(deque);
		
		deque.remove();
		System.out.println(deque);
		
		// stack methods
		System.out.println(deque.peek());
		deque.push(8);
		System.out.println(deque);
		deque.pop();
		System.out.println(deque);
		
		
		deque.addFirst(0);
		deque.addLast(9);
		System.out.println(deque);
		
//		for (int i = 0; i < deque.size(); i++) {
//			System.out.println(deque[i]);
//		}
		
	System.out.println(":::::::::: Stack ::::::::::");
		Stack<Integer> stack = new Stack<>();
		for (int i = 1; i <= 5; i++ ) {
			stack.add(i);
		}
		
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.push(8);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
}
