package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class MapTest<A, B> {

	private Map<A,B> hashMap;
	private Map<A,B> treeMap;
	private Map<A,B> linkedHashMap;

	public MapTest() {
		super();
		this.hashMap = new HashMap<A,B>();
		this.linkedHashMap = new LinkedHashMap<A,B>(16, 0.75f, true);
	}
	
	public static void main(String[] args) {
		MapTest<String, Integer> test = new MapTest<>();

		//Test hashmap
		test.hashMap.put("Smith", 30);
		test.hashMap.put("Anderson", 31);
		test.hashMap.put("Lewis", 29);
		test.hashMap.put("Cook", 29);

		System.out.println("Display entries in HashMap");
		System.out.println(test.hashMap + "\n");

		System.out.println("Display entries in ascending order of key");
		test.treeMap = new TreeMap<>(test.hashMap);
		System.out.println(test.treeMap);

		test.linkedHashMap.put("Smith", 30);
		test.linkedHashMap.put("Anderson", 31);
		test.linkedHashMap.put("Lewis", 29);
		test.linkedHashMap.put("Cook", 29);

		// Display the age for Lewis
		System.out.println("\nThe age for " + "Lewis is " +
				test.linkedHashMap.get("Lewis"));

		System.out.println("Display entries in LinkedHashMap");
		System.out.println(test.linkedHashMap);

		// Display each entry with name and age
		System.out.print("\nNames and ages are ");
		test.treeMap.forEach(
				(name, age) -> System.out.print(name + ": " + age + " "));
	}
}