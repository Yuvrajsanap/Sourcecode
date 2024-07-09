//How to Get a Size of Collection in Java?
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class question13 {
	public static void main(String[] args) {
		// List
		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana", "Grapes", "Cherry"));
		System.out.println("Size of List: " + list.size());

		// Set
		Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println("Size of Set: " + set.size());

		// Queue
		Queue<Character> queue = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
		System.out.println("Size of Queue: " + queue.size());
	}
}
