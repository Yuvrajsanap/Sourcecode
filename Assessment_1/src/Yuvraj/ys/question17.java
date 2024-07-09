//Min and Max in a List in Java
package Yuvraj.ys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class question17 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6, 3, 9, 4, 7);

		int min = Collections.min(numbers);
		int max = Collections.max(numbers);

		System.out.println("List: " + numbers);
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
	}
}
