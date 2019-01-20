package set;

import java.util.*;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class HashSetTest<E> {
	
	private Set<E> set;
	
	@SuppressWarnings("unchecked")
	public HashSetTest() {
		super();
		this.set = (Set<E>) new HashSet<Object>();
	}

	  public static void main(String[] args) {
		HashSetTest<String> test = new HashSetTest<String>();  
	    //Set<String> strSet = new HashSet<>();

	    // Add strings to the set
	    test.set.add("London");
	    test.set.add("Paris");
	    test.set.add("New York");
	    test.set.add("San Francisco");
	    test.set.add("Beijing");
	    test.set.add("New York");

	    System.out.println(test);

	    // Display the elements in the hash set
	    for (String s: test.set) {
	      System.out.print(s.toUpperCase() + " ");
	    }
	    
	    // Process the elements using a forEach method
	    System.out.println();
	    test.set.forEach(e -> System.out.print(e.toLowerCase() + " "));
	    
	    // Test remove
	    System.out.println();
	    test.set.remove("Beijing");
	    test.set.forEach(e -> System.out.print(e + " "));	    
	  }
}
