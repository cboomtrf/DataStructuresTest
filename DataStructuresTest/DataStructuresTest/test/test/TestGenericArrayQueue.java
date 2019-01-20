package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import exception.*;
import queue.*;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
class TestGenericArrayQueue {

	@Test
	public void testOffer1() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(5);
		try {
			arr.offer(5);
			int expected = 5;
			int actual = arr.element();
			assertEquals(expected,actual);
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during offer");
		} catch (StackUnderflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during element");
		}
	}
	
	@Test
	public void testOffer2() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(5);
		try {
			arr.offer(5);
			int expected = 1;
			int actual = arr.getSize();
			assertEquals(expected,actual);
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during offer");
		}
	}
	
	@Test
	public void testOffer3() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(2);
		try {
			arr.offer(5);
			arr.offer(2);
			arr.offer(2);
			fail("Expected exception did not occur");
		} catch (StackOverflowException e) {
			System.out.println("Expected exception during offer");
		}
	}
	
	@Test
	public void testRemove() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(5);
		try {
			arr.offer(5);
			arr.remove();
			assertTrue(arr.isEmpty());
		} catch (StackUnderflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during remove");
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during offer");
		}
	}
	
	@Test
	public void testElement() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(5);
		try {
			arr.offer(5);
			Integer actual = arr.element();
			Integer expected = 5;
			assertEquals(expected,actual);
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during offer");
		} catch (StackUnderflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during element");
		}
	}
	
	@Test
	public void testIsEmpty1() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(5);
		boolean expected = true;
		boolean actual = arr.isEmpty();
		assertEquals(expected,actual);
	}
	
	@Test
	public void testIsEmpty2() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(5);
		try {
			arr.offer(5);
			assertFalse(arr.isEmpty());
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during offer");
		}
	}
	
	@Test
	public void testIsFull1() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(5);
		assertFalse(arr.isFull());
	}
	
	@Test
	public void testIsFull2() {
		GenericArrayQueue<Integer> arr = new GenericArrayQueue<Integer>(3);
		try {
			arr.offer(5);
			arr.offer(3);
			arr.offer(6);
			assertTrue(arr.isFull());
		} catch (StackOverflowException e) {
			e.printStackTrace();
			fail("Unexpected exception during offer");
		}
	}

}
