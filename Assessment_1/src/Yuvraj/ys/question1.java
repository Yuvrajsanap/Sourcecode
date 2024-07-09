//Java Program to Get the Maximum Element From a Vector
package Yuvraj.ys;

import java.util.Collections;
import java.util.Vector;

public class question1 {
	public static void main(String[] args) {

		Vector<Integer> numbers = new Vector<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(5);
		numbers.add(25);

		if (!numbers.isEmpty()) {
			// Use Collections.max()
			int max = Collections.max(numbers);
			System.out.println("The maximum element in the vector is: " + max);
		} else {
			System.out.println("The vector is empty.");
		}
	}
}
