package exception;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class StackUnderflowException extends Exception {

	private static final long serialVersionUID = -3099359638513694671L;

	public StackUnderflowException() {
		super();
	}
	
	public StackUnderflowException(String msg) {
		super(msg);
	}
	
}
