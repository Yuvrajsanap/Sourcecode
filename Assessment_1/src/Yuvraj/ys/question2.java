//Binary Search on Java Vector
package Yuvraj.ys;

import java.util.Collections;
import java.util.Vector;

public class question2 {
	public static void main(String[] args) {
		// Create a Vector and add some elements
		Vector<Integer> numbers = new Vector<>();
		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		numbers.add(80);

		// Sort the Vector using Collections.sort()
		Collections.sort(numbers);
		System.out.println("Sorted Vector: " + numbers);

		// Element to be searched
		int key = 40;

		// Perform binary search using Collections.binarySearch()
		int index = Collections.binarySearch(numbers, key);

		// Check if the element was found
		if (index >= 0) {
			System.out.println("Element " + key + " found at index: " + index);
		} else {
			System.out.println("Element " + key + " not found.");
		}
	}
}
