package Yuvraj.ys;

import java.util.LinkedList;

public class question4 {
	public static void main(String[] args) {
		// Create a LinkedList and add some elements
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");

		// Print the original LinkedList
		System.out.println("Original LinkedList: " + fruits);

		// Clear the LinkedList using the clear() method
		fruits.clear();

		// Print the LinkedList after clearing
		System.out.println("LinkedList after clear(): " + fruits);

		// Check if the LinkedList is empty
		if (fruits.isEmpty()) {
			System.out.println("The LinkedList is now empty.");
		} else {
			System.out.println("The LinkedList is not empty.");
		}
	}
}
