package examples.creation;

//https://docs.oracle.com/javase/tutorial/essential/concurrency/simple.html

public class InterruptExample {
	// Display a message, preceded by
    // the name of the current thread
    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    public static void main(String args[]) throws InterruptedException {

        // Delay, in milliseconds before
        // we interrupt MessageLoop
        // thread (default one hour: 1000 * 60 * 60).
        long patience = 6000;

        threadMessage("Starting InterruptableThread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new InterruptableThread());
        t.start();

        threadMessage("Waiting for InterruptableThread to finish");
        // while interruptable threads is still going
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second
            // for thread to finish.
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
            }
        }
        threadMessage("Finally!");
    }
}
