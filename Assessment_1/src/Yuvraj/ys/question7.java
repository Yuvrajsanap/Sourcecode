//Java Program to Compare Elements in a Collection
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question7 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Pineapple");
		list.add("Grapes");

		String maxElement = Collections.max(list);
		String minElement = Collections.min(list);

		System.out.println("List: " + list);
		System.out.println("Max Element: " + maxElement);
		System.out.println("Min Element: " + minElement);

		Collections.sort(list);
		System.out.println("Sorted List: " + list);
	}
}
