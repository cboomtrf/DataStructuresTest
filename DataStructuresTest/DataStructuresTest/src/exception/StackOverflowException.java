package exception;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class StackOverflowException extends Exception {
/*
 * Make unchecked by extending from RuntimeException.
 * Is a subclass of Exception with all the same possibilities.
 * All subclasses of exception such as IO exception, will need 
 * Try/Catch. no try-catch needed!!!	
 * 
 * public class StackOverflowException extends RuntimeException {
*/
	private static final long serialVersionUID = 7081733987100103395L;

	public StackOverflowException() {
		super();
	}
	
	public StackOverflowException(String msg) {
		super(msg);
	}
	
}
