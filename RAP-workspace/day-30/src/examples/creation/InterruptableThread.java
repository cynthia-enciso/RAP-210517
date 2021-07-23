package examples.creation;

//https://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html
//https://docs.oracle.com/javase/tutorial/essential/concurrency/interrupt.html

public class InterruptableThread extends Thread {
	@Override
	public void run() {
		String message[] = {
				"line 1",
				"line 2",
				"line 3",
				"line 4"
		};
		
		for (int i = 0; i < message.length; i++) {
			try {
				// pause my thread
				Thread.sleep(3000);
			} catch(InterruptedException ex) {
				// if interrupted, stop
				return;
			}
			System.out.println(message[i]);
		}
	}
}
