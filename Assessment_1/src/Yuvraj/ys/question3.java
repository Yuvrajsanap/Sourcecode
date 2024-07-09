//Java Program to Get Elements of a LinkedList
package Yuvraj.ys;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class question3 {
	public static void main(String[] args) {

		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);

		System.out.println("Original LinkedList: " + numbers);

		// Sort the LinkedList
		Collections.sort(numbers);
		System.out.println("Sorted LinkedList: " + numbers);

		// Reverse the LinkedList
		Collections.reverse(numbers);
		System.out.println("Reversed LinkedList: " + numbers);

		// Find the maximum element
		int maxElement = Collections.max(numbers);
		System.out.println("Maximum Element: " + maxElement);

		// Find the minimum element
		int minElement = Collections.min(numbers);
		System.out.println("Minimum Element: " + minElement);

		// Iterate in LL
		System.out.print("LinkedList elements using ListIterator: ");
		ListIterator<Integer> iterator = numbers.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		Collections.sort(numbers);
		int key = 30;
		int index = Collections.binarySearch(numbers, key);
		if (index >= 0) {
			System.out.println("Element " + key + " found at index: " + index);
		} else {
			System.out.println("Element " + key + " not found.");
		}
	}
}
