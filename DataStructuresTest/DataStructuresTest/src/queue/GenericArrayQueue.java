package queue;

import exception.*;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class GenericArrayQueue<E> {
	
	/** Variables */
	private E[] contents;
	private int size;
	private int firstPointer;
	private int lastPointer;
	
	/** Constructor */
	@SuppressWarnings("unchecked")
	public GenericArrayQueue(int maxValue) {
		super();
		this.size = 0;
		this.contents = (E[]) new Object[maxValue];
	}
	
	/** Add element to end of queue 
	 * @param e
	 * @throws StackOverflowException
	 */
	public void offer(E e) throws StackOverflowException {
		if (this.isFull()) {
			throw new StackOverflowException();
		}
		
		contents[lastPointer] = e;
		lastPointer = lastPointer++ % contents.length;
		size++;
	}
	
	/**
	 * Removes element from BEGIN queue
	 * @return
	 * @throws StackUnderflowException
	 */
	public E remove() throws StackUnderflowException {
		if (this.isEmpty()) {
			throw new StackUnderflowException();
		}
		
		size--;
		E output = contents[firstPointer];
	    contents[firstPointer] = null;
        firstPointer = firstPointer++ % contents.length;
		return output;
	}
	
	/**
	 * Look at what is at the first pointer
	 * @return
	 * @throws StackUnderflowException
	 */
	public E element() throws StackUnderflowException {
		if (this.isEmpty()) {
			throw new StackUnderflowException();
		}
		return contents[firstPointer];
	}
	
	/**
	 * Is queue empty?
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Is queue full?
	 * @return
	 */
	public boolean isFull() {
		return size == contents.length;
	}
	
	/** Print queue */
	@Override
	public String toString() {
		return "stack: " + contents.toString();
	}
	
	/**
	 * Getter only to test if size
	 * increases/decreases on offer/remove
	 * @return
	 */
	public int getSize() {
		return size;
	}
	
}
