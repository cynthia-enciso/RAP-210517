package examples.producerconsumer;

public class UsingMessenger {
	public static void main(String[] args) throws InterruptedException {
		Messenger messenger = new Messenger();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					messenger.produce("Hello");
                    messenger.produce("Hi there");
                    messenger.produce("Howdy");
                    messenger.produce("Hola");
                    messenger.produce("Hiya");
				}catch(InterruptedException ex) {
					System.out.println("producer interrupted!");
					ex.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					messenger.consume();
					messenger.consume();
					messenger.consume();
					messenger.consume();
					messenger.consume();
				}catch(InterruptedException ex) {
					System.out.println("consumer interrupted!");
					ex.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
