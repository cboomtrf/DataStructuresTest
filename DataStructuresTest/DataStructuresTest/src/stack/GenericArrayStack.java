package stack;

import exception.*;

public class GenericArrayStack<E> {
	
	/** Variables */
	private final int ZERO = 0;
	private E[] contents;
	private int stackPointer;
	
	/** Constructor */
	@SuppressWarnings("unchecked")
	public GenericArrayStack(int maxSize) {
		super();
		this.contents = (E[]) new Object[maxSize];
		this.stackPointer = ZERO;
	}
	
	/**
	 * Add element to a stack 
	 * @param e
	 * @throws StackOverflowException
	 */
	public void push(E e) throws StackOverflowException {
		if (this.isFull()) {
			throw new StackOverflowException();
		}
		contents[stackPointer++] = e;
	}
	
	/**
	 * Remove element from top of stack
	 * @return
	 * @throws StackUnderflowException
	 */
	public E pop() throws StackUnderflowException {
		if (this.isEmpty()) {
			throw new StackUnderflowException();
		}
		return contents[--stackPointer];
	}
	
	/**
	 * Look at what lies at top of the stack
	 * @return
	 * @throws StackUnderflowException
	 */
	public E peek() throws StackUnderflowException {
		if (this.isEmpty()) {
			throw new StackUnderflowException();
		}
		return contents[stackPointer-1];
	}
	
	/**
	 * Is stack empty?
	 * @return
	 */
	public boolean isEmpty() {
		return stackPointer <= ZERO;
	}
	
	/**
	 * Is stack full?
	 * @return
	 */
	public boolean isFull() {
		return stackPointer >= contents.length;
	}
	
	/** Print stack */
	@Override
	public String toString() {
		return "stack: " + contents.toString();
	}
	
	/**
	 * Getter only to test if StackPointer 
	 * increased after push.
	 * @return stackPointer;
	 */
	public int getStackPointer() {
		return stackPointer;
	}

}
