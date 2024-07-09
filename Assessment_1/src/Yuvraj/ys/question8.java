//How to Print a Collection in Java?
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class question8 {
	public static void main(String[] args) {
		// Create a collection (ArrayList in this case)
		Collection<String> collection = new ArrayList<>();
		collection.add("Apple");
		collection.add("Orange");
		collection.add("Banana");
		collection.add("Pineapple");
		collection.add("Grapes");

		System.out.println("Using toString(): " + collection);

		System.out.print("Using for-each loop: ");
		for (String fruit : collection) {
			System.out.print(fruit + " ");
		}
		System.out.println();

		System.out.print("Using Iterator: ");
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		System.out.print("Using forEach method: ");
		collection.forEach(fruit -> System.out.print(fruit + " "));
		System.out.println();

		System.out.println("Using String.join: " + String.join(", ", collection));
	}
}
