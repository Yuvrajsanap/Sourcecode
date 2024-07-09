//How to Iterate HashMap in Java?
package Yuvraj.ys;

import java.util.HashMap;
import java.util.Map;

public class question14 {
	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);

		System.out.println("Iterating using forEach and lambda:");
		hashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

		System.out.println("\nIterating over entries using entrySet:");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("\nIterating over keys using keySet:");
		for (String key : hashMap.keySet()) {
			System.out.println(key + " -> " + hashMap.get(key));
		}

		System.out.println("\nIterating over values using values:");
		for (Integer value : hashMap.values()) {
			System.out.println(value);
		}
	}
}
