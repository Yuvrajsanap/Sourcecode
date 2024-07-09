//How to Find a Sublist in a List in Java?
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question18 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana", "Grapes", "Cherry"));

		List<String> sublist = list.subList(1, 4);

		System.out.println("Original List: " + list);
		System.out.println("Sublist from index 1 to 4: " + sublist);
	}
}
