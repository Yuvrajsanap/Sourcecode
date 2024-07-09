//Collections.reverse() Method in Java with Examples
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class question11 {
	public static void main(String[] args) {
		// List
		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana"));
		System.out.println("List before reversal: " + list);
		Collections.reverse(list);
		System.out.println("List after reversal: " + list);

		// Set
		Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("Set before reversal: " + set);
		List<Integer> setAsList = new ArrayList<>(set);
		Collections.reverse(setAsList);
		set = new HashSet<>(setAsList);
		System.out.println("Set after reversal: " + set);

		// Queue (using LinkedList)
		Queue<Character> queue = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
		System.out.println("Queue before reversal: " + queue);
		List<Character> queueAsList = new ArrayList<>(queue);
		Collections.reverse(queueAsList);
		queue.clear();
		queue.addAll(queueAsList);

		System.out.println("Queue after reversal: " + queue);
	}
}
