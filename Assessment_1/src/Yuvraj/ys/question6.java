//Java Program to Change a Collection to an Array
package Yuvraj.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question6 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		Object[] array1 = list.toArray();
		System.out.println("Array using toArray(): " + Arrays.toString(array1));

		String[] array2 = new String[list.size()];
		array2 = list.toArray(array2);
		System.out.println("Array using toArray(T[] a): " + Arrays.toString(array2));

		String[] array3 = list.stream().toArray(String[]::new);
		System.out.println("Array using Stream API: " + Arrays.toString(array3));
	}
}
