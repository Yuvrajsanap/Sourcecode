//Collections.shuffle() Method in Java with Examples
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class question12 {
	public static void main(String[] args) {
		// List
		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana", "Grapes", "Cherry"));
		Collections.shuffle(list);
		System.out.println("Shuffled List: " + list);

		// Set (using LinkedHashSet for predictable iteration order)
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> setAsList = new ArrayList<>(set);
		Collections.shuffle(setAsList);
		set.clear();
		set.addAll(setAsList);
		System.out.println("Shuffled Set: " + set);

		// Queue (using LinkedList)
		Queue<Character> queue = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
		List<Character> queueAsList = new ArrayList<>(queue);
		Collections.shuffle(queueAsList);
		queue.clear();
		queue.addAll(queueAsList);
		System.out.println("Shuffled Queue: " + queue);
	}
}
