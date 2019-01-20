package test;

import static org.junit.jupiter.api.Assertions.*;

import exception.*;
import stack.*;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
class TestGenericArrayStack {

	@org.junit.jupiter.api.Test
	public void testPush1() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		try {
			arr.push(5);
			int expected = 5;
			int actual = arr.peek();
			assertEquals(expected,actual);
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during push");
		} catch (StackUnderflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during peek");
		}
	}
	
	@org.junit.jupiter.api.Test
	public void testPush2() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		try {
			arr.push(5);
			int expected = 1;
			int actual = arr.getStackPointer();
			assertEquals(expected,actual);
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during push");
		}
	}
	
	@org.junit.jupiter.api.Test
	public void testPush3() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(2);
		try {
			arr.push(5);
			arr.push(2);
			arr.push(2);
			fail("Expected exception did not occur");
		} catch (StackOverflowException e) {
			System.out.println("Expected exception during push");
		}
	}
	
	@org.junit.jupiter.api.Test
	public void testPop() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		try {
			arr.push(5);
			arr.pop();
			boolean actual = arr.isEmpty();
			boolean expected = true;
			assertEquals(expected,actual);
		} catch (StackUnderflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during pop");
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during push");
		}
	}
	
	@org.junit.jupiter.api.Test
	public void testPeek() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		try {
			arr.push(5);
			Integer actual = arr.peek();
			Integer expected = 5;
			assertEquals(expected,actual);
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during push");
		} catch (StackUnderflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during peek");
		}
	}
	
	@org.junit.jupiter.api.Test
	public void testIsEmpty1() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		boolean expected = true;
		boolean actual = arr.isEmpty();
		assertEquals(expected,actual);
	}
	
	@org.junit.jupiter.api.Test
	public void testIsEmpty2() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		try {
			arr.push(5);
			boolean expected = false;
			boolean actual = arr.isEmpty();
			assertEquals(expected,actual);
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during push");
		}
	}
	
	@org.junit.jupiter.api.Test
	public void testIsFull1() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		boolean expected = false;
		boolean actual = arr.isFull();
		assertEquals(expected,actual);
	}
	
	@org.junit.jupiter.api.Test
	public void testIsFull2() {
		GenericArrayStack<Integer> arr = new GenericArrayStack<Integer>(5);
		try {
			arr.push(5);
			arr.push(3);
			arr.push(6);
			arr.push(8);
			arr.push(10);
			assertTrue(arr.isFull());
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during push");
		}
	}

}
