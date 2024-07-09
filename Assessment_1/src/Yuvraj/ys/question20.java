//Java Program to Rotate Elements of the List?
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class question20 {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		System.out.println("Original List: " + numbers);

		int rotateDistance = 2;
		Collections.rotate(numbers, -rotateDistance);

		System.out.println("Rotated List by " + rotateDistance + " positions to the left: " + numbers);
	}
}
