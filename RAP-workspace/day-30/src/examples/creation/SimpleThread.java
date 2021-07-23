package examples.creation;

public class SimpleThread extends Thread {
	// from Thread class
		/**
	     * If this thread was constructed using a separate
	     * {@code Runnable} run object, then that
	     * {@code Runnable} object's {@code run} method is called;
	     * otherwise, this method does nothing and returns.
	     * <p>
	     * Subclasses of {@code Thread} should override this method.
	     *
	     * @see     #start()
	     * @see     #stop()
	     * @see     #Thread(ThreadGroup, Runnable, String)
	     */
//	    @Override
//	    public void run() {
//	        if (target != null) {
//	            target.run();
//	        }
//	    }
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + this.getId() /*+ this.getName() */+ ": " + i);
		}
	}
}
