//Java Program to Remove a Specific Element From a Collection
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class question10 {
	public static void main(String[] args) {
		// Removing from a List
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Orange");
		System.out.println("List before removal: " + list);
		list.remove("Orange");
		System.out.println("List after removal: " + list);

		// Removing from a Set
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Orange");
		set.add("Banana");
		System.out.println("Set before removal: " + set);
		set.remove("Orange");
		System.out.println("Set after removal: " + set);

		// Removing from a Map
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(3, "Banana");
		System.out.println("Map before removal: " + map);
		map.remove(2);
		System.out.println("Map after removal: " + map);
	}
}
