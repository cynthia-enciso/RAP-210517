package exceptions;

@SuppressWarnings("serial")
public class EvenNumberException extends Exception {

	public EvenNumberException() {}
	
	public EvenNumberException(String message) {
		super(message);
	}
	
}
