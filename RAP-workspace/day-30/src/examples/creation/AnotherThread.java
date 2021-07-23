package examples.creation;

public class AnotherThread implements Runnable {

	private final int numberOfThread;
	
	public AnotherThread(int i) {
		this.numberOfThread = i;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + this.numberOfThread + ": "+ i);
		}
	}

}
