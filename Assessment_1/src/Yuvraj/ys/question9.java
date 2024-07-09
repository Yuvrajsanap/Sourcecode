//How to Make a Collection Read-Only in Java?
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class question9 {
	public static void main(String[] args) {
		// List Read-Only
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		List<String> readOnlyList = Collections.unmodifiableList(list);
		System.out.println("Read-Only List: " + readOnlyList);

		// Set Read-Only
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Orange");
		set.add("Banana");
		Set<String> readOnlySet = Collections.unmodifiableSet(set);
		System.out.println("Read-Only Set: " + readOnlySet);

		// Map Read-Only
		Map<String, String> map = new HashMap<>();
		map.put("A", "Apple");
		map.put("O", "Orange");
		map.put("B", "Banana");
		Map<String, String> readOnlyMap = Collections.unmodifiableMap(map);
		System.out.println("Read-Only Map: " + readOnlyMap);

		// Collection Read-Only
		List<String> generalCollection = new ArrayList<>();
		generalCollection.add("Apple");
		generalCollection.add("Orange");
		generalCollection.add("Banana");
		Collection<String> readOnlyCollection = Collections.unmodifiableCollection(generalCollection);
		System.out.println("Read-Only Collection: " + readOnlyCollection);
	}
}
