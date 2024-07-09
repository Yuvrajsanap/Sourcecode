//Hashtable keySet() Method in Java with Examples
package Yuvraj.ys;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class question16 {
	public static void main(String[] args) {

		Hashtable<String, Integer> hashtable = new Hashtable<>();

		hashtable.put("One", 1);
		hashtable.put("Two", 2);
		hashtable.put("Three", 3);

		Set<String> keys = hashtable.keySet();

		System.out.println("Method 1: Iterating over keys using enhanced for loop:");
		for (String key : keys) {
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}

		System.out.println("\nMethod 2: Iterating over keys using Iterator:");
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}

		System.out.println("\nMethod 3: Using forEach method with lambda expression:");
		keys.forEach(key -> System.out.println("Key: " + key + ", Value: " + hashtable.get(key)));

		System.out.println("\nMethod 4: Using forEachRemaining method with Iterator:");
		iterator = keys.iterator();
		iterator.forEachRemaining(key -> System.out.println("Key: " + key + ", Value: " + hashtable.get(key)));
	}
}
