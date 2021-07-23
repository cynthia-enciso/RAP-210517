package examples.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Messenger {
	// fields
		private List<String> messages = new ArrayList<>();
		private static final int MAX_SIZE = 3;
		
		
		// produce message
		public synchronized void produce(String message) throws InterruptedException {
			while (messages.size() == MAX_SIZE) {
				wait(); // when queue is full, wait...
			}
			/* when the queue has space, the Producer
			 * produces data and adds to queue
			 */
			messages.add(message);
			System.out.println("Producer added: " + message);
			System.out.println("List size: " + messages.size());
			notify();
			
			// makes the working of program easier
	        // to  understand
	        Thread.sleep(1000);
		}	
		
		// consume message
		public synchronized void consume() throws InterruptedException {
			while (messages.isEmpty()) {
				wait(); // when queue is empty, wait...
			}
			/* when the queue has data, the Consumer
			 * consumes data and removes it from the queue
			 */
			
			System.out.println("Consumer deleted: " + messages.get(0));
			messages.remove(0);
			System.out.println("List size: " + messages.size());
			notify();
			
			// makes the working of program easier
	        // to  understand
	        Thread.sleep(1000);
		}
		
		// getters and setters
		public List<String> getMessages() {
			return messages;
		}
		public void setMessages(List<String> messages) {
			this.messages = messages;
		}

		public static int getMaxSize() {
			return MAX_SIZE;
		}
}
