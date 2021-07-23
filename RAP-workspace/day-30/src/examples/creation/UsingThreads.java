package examples.creation;

public class UsingThreads {
	public static void main(String[] args) {
		Thread t1 = new SimpleThread();
//		System.out.println(t1.getState());
		Thread t2 = new SimpleThread();
		Thread t3 = new Thread(new AnotherThread(20));
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread " + 25 + ": " + i);
			}
		});
		Thread t5 = new InterruptableThread();
		
		
		t5.start();
		
//		System.out.println(t1.getState());
		
		// using join: other threads wait on t5
		try {
			t5.join();
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
