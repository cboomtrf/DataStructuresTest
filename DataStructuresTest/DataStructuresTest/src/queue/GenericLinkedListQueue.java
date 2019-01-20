package queue;

import java.util.LinkedList;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class GenericLinkedListQueue<E> {

		  private LinkedList<E> list;
		  
		  public GenericLinkedListQueue() {
			  super();
			  this.list = new LinkedList<>();
		  }

		  public void enqueue(E e) {
		    list.addLast(e);
		  }

		  public E dequeue() {
		    return list.removeFirst();
		  }

		  public int getSize() {
		    return list.size();
		  }

		  @Override
		  public String toString() {
		    return "Queue: " + list.toString();
		  }
}
