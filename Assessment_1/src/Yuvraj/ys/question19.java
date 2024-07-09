//How to replace an element in a list?
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question19 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana", "Grapes", "Cherry"));

		System.out.println("Original List: " + list);

		int index = 2;
		String newElement = "Mango";
		list.set(index, newElement);

		System.out.println("Modified List after replacing element at index " + index + ": " + list);
	}
}
