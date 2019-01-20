package stack;

import java.util.ArrayList;

public class GenericArrayListStack<E> {

	private ArrayList<E> list;
	
	public GenericArrayListStack() {
		super();
		this.list = new ArrayList<>();
	}

	public E peek() {
		return list.get(list.size() - 1);
	}

	public void push(E o) {
		list.add(o);
	}

	public E pop() {
		E o = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
